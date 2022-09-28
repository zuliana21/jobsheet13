package com.example.jobsheet13zuliana2
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    private lateinit var namaEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var NisEdit: EditText
    private lateinit var submitBtn: Button
    private val NAME_KEY: String = "Nama"
    private val kelas_KEY: String = "kelas"
    private val NIS_KEY: String = "NIS"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        namaEdit = findViewById(R.id.namaEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        NisEdit = findViewById(R.id.NisEdit)
        submitBtn = findViewById(R.id.submitBtn)
        submitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(kelas_KEY,kelasEdit.text.toString())
            intent.putExtra(NIS_KEY,NisEdit.text.toString())
            startActivity(intent)
        }
    }
}