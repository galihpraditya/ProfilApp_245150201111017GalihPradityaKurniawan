package com.example.profilapp_245150201111017galihpradityakurniawan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfilScreen()
                }
            }
        }
    }
}

@Composable
fun ProfilScreen() {
    // Modifier diletakkan di luar komponen agar rapi dan diberi background warna
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF3F4F6)) // Warna latar belakang abu-abu terang
            .padding(24.dp)
    ) {
        // 1. Foto Profil
        Image(
            painter = painterResource(id = R.drawable.profil_dummy),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 2. Nama Lengkap & NIM
        Text(
            text = "Galih Praditya Kurniawan",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = "NIM: 245150201111017",
            fontSize = 16.sp,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 3. Deskripsi Singkat
        Text(
            text = "Mahasiswa Teknik Informatika",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 4. Tombol Interaktif (Follow/Unfollow) dengan State
        var isFollowed by remember { mutableStateOf(false) }

        Button(
            onClick = { isFollowed = !isFollowed },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isFollowed) Color.Gray else Color(0xFF0066FF)
            ),
            modifier = Modifier.fillMaxWidth(0.6f)
        ) {
            Text(
                text = if (isFollowed) "Unfollow" else "Follow",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}