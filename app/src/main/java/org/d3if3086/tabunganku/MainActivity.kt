package org.d3if3086.tabunganku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if3086.tabunganku.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = intent.getIntExtra("result", 0)

        var saldoku = result


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nabung.setOnClickListener {
            val nabung = Intent(this, MainActivity2::class.java).also {
                it.putExtra(
                    "saldo",
                    saldoku
                )
            }
            startActivity(nabung)
        }

        binding.tarik.setOnClickListener {
            val tarik = Intent(this, MainActivity3::class.java).also {
                it.putExtra(
                    "saldo",
                    saldoku
                )
            }
            startActivity(tarik)
        }

        binding.saldo.text = "Jumlah Tabungan: Rp." + saldoku
    }
}