package com.example.jobsheet13zuliana2
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
class MainActivity2 : AppCompatActivity() {
    private lateinit var namaView: TextView
    private lateinit var NisView: TextView
    private lateinit var kelasView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        namaView = findViewById(R.id.namaView)
        NisView = findViewById(R.id.NisView)
        kelasView = findViewById(R.id.kelasView)
        val extras = intent.extras
        namaView.text = extras?.getString("Nama")
        NisView.text = extras?.getString("NIS")
        kelasView.text = extras?.getString("kelas")
    }
}