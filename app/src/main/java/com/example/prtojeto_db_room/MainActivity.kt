package com.example.prtojeto_db_room

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prtojeto_db_room.ui.theme.PrtojetodbroomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrtojetodbroomTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Formulario()
                }
            }
        }
    }
}

@Composable
fun Formulario() {
    var nome by remember { mutableStateOf("ex: Lucas Silva das Oliveiras") }
    var telefone by remember { mutableStateOf("ex: (xx) xxxx-xxxx") }
    var pessoa by remember { mutableStateOf("ex: (xx) xxxx-xxxx") }

    Column(
        Modifier
            .background(Color.White)
    ) {
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Text(
                text = "App DataBase",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = nome,
                onValueChange = { nome = it  },
                label = { Text("Nome:") }
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(
                value = telefone,
                onValueChange = { telefone = it  },
                label = { Text("Telefone:") }
            )
        }
        Row(
            Modifier
                .padding(20.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Button(onClick = {
                //viewModel.upsertPessoa(pessoa)
                nome = ""
                telefone = ""
            }) {
                Text("Cadastrar")
            }
        }
        Row(
            Modifier
                .padding(20.dp)
        ){

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ){
            Column(
                Modifier
                    .fillMaxWidth(0.5f)
            ) {
                Text(text = "Nome ")
            }
            Column(
                Modifier
                    .fillMaxWidth(0.5f)
            ) {
                Text(text = "Telefone")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormularioPreview() {
    PrtojetodbroomTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Formulario()
        }
    }
}