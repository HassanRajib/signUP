package com.example.signinwithbi

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.signinwithbi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.logBtn.setOnClickListener {
            val uname = binding.uNam.text.toString()
            val pass = binding.paSs.text.toString()
            
            if (uname.isEmpty() || pass.isEmpty()){
                Toast.makeText(this, "fill all the fildes", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "login completed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}