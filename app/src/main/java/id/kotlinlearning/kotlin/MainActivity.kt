package id.kotlinlearning.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCekHasil.setOnClickListener {
            if (etNamaLengkap.text.isEmpty() || etStatusHubungan.text.isEmpty()) {
                Toast.makeText(baseContext, "Maaf Jangan Ada Yang Kosong", Toast.LENGTH_LONG).show()
            } else {
                val NamaLengkap = etNamaLengkap.text.toString()
                val StatusHubungan = etStatusHubungan.text.toString()

                val intent = Intent(baseContext, DetailActivity::class.java)
                intent.putExtra("NamaLengkap", NamaLengkap)
                intent.putExtra("StatusHubungan", StatusHubungan)
                startActivity(intent)
                finish()
            }
        }
    }
}
