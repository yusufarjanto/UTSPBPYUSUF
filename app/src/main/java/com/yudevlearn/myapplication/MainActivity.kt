package com.yudevlearn.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val satu = findViewById<EditText>(R.id.etSatu)
        val dua = findViewById<EditText>(R.id.etDua)
        val jumlahView = findViewById<EditText>(R.id.etJumlah)
        val tombol = findViewById<Button>(R.id.btnHitung)
        tombol.setOnClickListener {
            val teksSatu = satu.text.toString().trim()
            val teksDua = dua.text.toString().trim()
            val jumlah: Int? = jumlahView.text.toString().toIntOrNull() // mengkonversi menjadi int safe
            if (teksSatu.isEmpty()) {
                satu.error = "Nama wajib diisi!" // VALIDASI NAMA GABOLE KOSONG
                satu.requestFocus()

                Toast.makeText(
                    this,
                    "Silakan isi nama !",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }
            if (teksDua.isEmpty()) {
                dua.error = "event wajib diisi!" // VALIDASI NAMA EVENT GABOLE KOSONG
                dua.requestFocus()

                Toast.makeText(
                    this,
                    "Silakan isi nama event",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }
            if ( jumlah== null || jumlah !in 1..10) {     //VALIDASI JUMLAH TDK BOLE KOSONG DAN HARUS BERISI 1 SAMPAI 10
                jumlahView.error = "Masukkan jumlah valid (1-10)"
                jumlahView.requestFocus()

                Toast.makeText(
                    this,
                    "Jumlah harus berupa angka yang valid",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }
            val tarif: Int = 75000
            var total: Int = jumlah * tarif    // ARITMATIKA MENGHITUNG TOTAL BIAYA YANG HARUS DIBAYAR
            val intent = Intent(
                this,
                ResultActivity::class.java
            )
            intent.putExtra("EXTRA_NAMA", teksSatu)  // KIRIM EXTRA ISI NAMA
            intent.putExtra("EXTRA_EVENT", teksDua)  // KIRIM EXTRA ISI NAMA EVENT
            intent.putExtra("EXTRA_JUMLAH",jumlah)  // KIRIM EXTRA ISI JUMLAH
            intent.putExtra("EXTRA_TOTAL",total)    // KIRIM EXTRA ISI TOTAL
            startActivity(intent)   // START INTENT


        }
    }
}