package org.d3if3086.tabunganku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if3086.tabunganku.databinding.ActivityMain2Binding
import org.d3if3086.tabunganku.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var saldoku = intent.getIntExtra("saldo", 0)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tabung.setOnClickListener {
            tambahTabungan()
        }

    }

    private fun tambahTabungan(){
        var tambah = binding.tambahEditText.text.toString().toInt()
        var saldoku = intent.getIntExtra("saldo", 0)
        var jumlah = tambah + saldoku
        val kembali = Intent(this, MainActivity::class.java).also {
            it.putExtra("result", jumlah)
        }
        startActivity(kembali)
    }
}