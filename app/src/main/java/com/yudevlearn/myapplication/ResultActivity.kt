package com.yudevlearn.myapplication
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val ringkasan = findViewById<TextView>(R.id.tvRingkasan)
        val totalView = findViewById<TextView>(R.id.tvTotal)
        val satu: String = "" // TODO-11: terima String pertama
        val dua: String = "" // TODO-12: terima String kedua
        val jumlah: Int = 0 // TODO-13: terima Int (bukan getStringExtra)
        val total: Int = 0 // TODO-14: terima Int total
        // TODO-15: tampilkan String dan jumlah pada ringkasan
        // TODO-16: tampilkan total (konversi Int ke teks hanya di UI)
    }
}