package org.debug.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val target = findViewById<View>(R.id.toto) ?: findViewById(R.id.tata) ?: run {
            Log.e("AAA", "AA")
        }

    }
}
