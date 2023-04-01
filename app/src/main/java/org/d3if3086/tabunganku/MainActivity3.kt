package org.d3if3086.tabunganku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if3086.tabunganku.databinding.ActivityMain2Binding
import org.d3if3086.tabunganku.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tarik.setOnClickListener {
            tarikTabungan()
        }
    }

    private fun tarikTabungan(){
        var tarik = binding.tarikEditText.text.toString().toInt()
        var saldoku = intent.getIntExtra("saldo", 0)
        var jumlah = saldoku - tarik
        val kembali = Intent(this, MainActivity::class.java).also {
            it.putExtra("result", jumlah)
        }
        startActivity(kembali)
    }
}