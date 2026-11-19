package com.yudevlearn.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
            val jumlah: Int? = jumlahView.text as Int?
            val tarif: Int = 75000
            var total: Int = 0
            if (teksSatu.isEmpty()){
                satu.error = "Name Required!"
            } else if (teksDua.isEmpty()){
                dua.error = "Name event Required!"
            } else {
                if (jumlah!! >= 10) {
                    jumlahView.error = "Isi hanya dengan 1 sampai 10"
                } else {
                    total = jumlah * tarif
                }
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",teksSatu)
                intent.putExtra("EXTRA_EVENT",teksDua)
                intent.putExtra("EXTRA_JUMLAH",jumlah)
                intent.putExtra("EXTRA_TOTAL",total)
                startActivity(intent)
            }
            // TODO-05: buat Explicit Intent menuju ResultActivity
            // TODO-06: kirim teksSatu sebagai String
            // TODO-07: kirim teksDua sebagai String
            // TODO-08: kirim jumlah sebagai Int
            // TODO-09: kirim total sebagai Int
            // TODO-10: buka Activity tujuan
        }
    }
}