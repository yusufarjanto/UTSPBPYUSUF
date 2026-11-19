package com.yudevlearn.myapplication
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        enableEdgeToEdge()
        val ringkasan = findViewById<TextView>(R.id.tvRingkasan)
        val totalView = findViewById<TextView>(R.id.tvTotal)
        val satu: String = intent.getStringExtra("EXTRA_NAMA").toString()  // GET STRING DARI EXTRA_NAME
        val dua: String = intent.getStringExtra("EXTRA_EVENT").toString()  // GET STRING DARI EXTRA EVENT
        val jumlah: Int = intent.getIntExtra("EXTRA_JUMLAH",0)  // GET INT DARI EXTRA JUMLAH
        val total: Int = intent.getIntExtra("EXTRA_TOTAL",0)  // GET INT DARI EXTRA TOTAL
        // TODO-15: tampilkan String dan jumlah pada ringkasan
        ringkasan.text = "$satu | $dua | Jumlah : $jumlah"  // PANGGIL VARIABEL SATU DUA DAN JUMLAH KEDALAM TEXT YANG NANTI AKAN MENGISI RINGKASAN
        // TODO-16: tampilkan total (konversi Int ke teks hanya di UI)
        totalView.text = "Total Biaya : Rp.${total}"   //PANGGIL VARIABEL SATU DUA DAN JUMLAH KEDALAM TEXT YANG NANTI AKAN MENGISI TOTAL
    }
}