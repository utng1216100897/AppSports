package com.example.appdeportes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_futball.*

class ActivityFutball : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futball)
        btnRegresarFut.setOnClickListener { finish() }


        rbOpcion1.setOnClickListener {
            var op: Boolean = rbOpcion1.isSelected()
            var msg: String = ""
            // swtich
            if (op){
                msg = "Me gusta"
            }else{
                msg = "No me gusta"
            }
            Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
        }
        rbOpcion2.setOnClickListener {
            var op: Boolean = rbOpcion1.isSelected()
            var msg: String = ""
            // swtich
            if (op){
                msg = "Me gusta"
            }else{
                msg = "No me gusta"
            }
            Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
        }


    }
}
