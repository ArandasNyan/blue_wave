package br.com.fiap.locmail.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.locmail.R
import br.com.fiap.locmail.ui.theme.Zinc700

@Composable
fun EmailScreen() {
    var recipient by remember { mutableStateOf(TextFieldValue("laurafaustino@gmail.com")) }
    var subject by remember { mutableStateOf(TextFieldValue("laurafaustino@gmail.com")) }
    var body by remember { mutableStateOf(TextFieldValue("Lorem ipsum dolor sit amet, consectetur adipiscing elit...")) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 32.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* Enviar */}) {
                Icon(
                    painter = painterResource(id = R.drawable.x),
                    contentDescription = "Close",
                    tint = Zinc700 // Use a cor original do ícone
                )
            }
            Text("Nova mensagem", fontSize = 18.sp, color = Color.Black)
            IconButton(onClick = { /* Enviar */}) {
                Icon(
                    painter = painterResource(id = R.drawable.send_diagonal),
                    contentDescription = "Send",
                    tint = Zinc700 // Use a cor original do ícone
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = recipient,
            onValueChange = { recipient = it },
            label = { Text("Para") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = subject,
            onValueChange = { subject = it },
            label = { Text("Assunto") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .weight(1f)
                .background(Color.White)
                .padding(8.dp)
        ) {
            BasicTextField(
                value = body,
                onValueChange = { body = it },
                modifier = Modifier.fillMaxSize(),
                textStyle = LocalTextStyle.current.copy(fontSize = 16.sp)
            )
        }
    }
}