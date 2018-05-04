package id.kotlinlearning.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = getIntent()
        val NamaLengkap = intent.getStringExtra("NamaLengkap")
        val StatusHubungan = intent.getStringExtra("StatusHubungan")

        if (intent != null){
            tvNamaLengkap.text = NamaLengkap
            tvStatusHubungan.text = StatusHubungan
        } else {
            Log.d("Bermasalah ", "Data Null")
        }

        btnCekHasil.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
