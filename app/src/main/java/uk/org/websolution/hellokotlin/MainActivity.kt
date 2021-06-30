package uk.org.websolution.hellokotlin

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var startButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startButton = findViewById(R.id.start_button)
        startButton?.setOnClickListener{
            Toast.makeText(this, startButton?.text, Toast.LENGTH_SHORT).show()
        }
    }
}