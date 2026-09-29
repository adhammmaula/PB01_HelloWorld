package com.example.pb01_helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pb01_helloworld.ui.theme.PB01_HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PB01_HelloWorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// === 1. Tampilan Utama yang Menggabungkan Komponen Terpisah ===
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,         // Mengetengahkan Posisi Vertikal
        horizontalAlignment = Alignment.CenterHorizontally // Mengetengahkan Posisi Horisontal
    ) {
        // Komponen 1: Hello World
        GreetingSection(message = "Hello World!")

        Spacer(modifier = Modifier.height(24.dp)) // Jarak antar komponen

        // Komponen 2: Biodata
        BiodataSection(
            nama = "Adham Maula Tirtasaputra",
            nim = "0102524001",
            kelas = "IF24H"
        )

        Spacer(modifier = Modifier.height(24.dp)) // Jarak antar komponen

        // Komponen 3: Mata Kuliah
        MatkulSection(
            matkul = "Pemrograman Bergerak",
            pertemuan = "Pertemuan 1"
        )
    }
}

// === 2. Komponen Khusus Hello World ===
@Composable
fun GreetingSection(message: String) {
    Text(
        text = message,
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

// === 3. Komponen Khusus Biodata ===
@Composable
fun BiodataSection(nama: String, nim: String, kelas: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Nama  : $nama",
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "NIM   : $nim",
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "Kelas : $kelas",
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
    }
}

// === 4. Komponen Khusus Mata Kuliah ===
@Composable
fun MatkulSection(matkul: String, pertemuan: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = matkul,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
        Text(
            text = pertemuan,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}