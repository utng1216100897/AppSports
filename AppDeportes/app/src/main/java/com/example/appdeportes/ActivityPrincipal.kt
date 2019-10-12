package com.example.appdeportes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal.*

class ActivityPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        // manejo del evento
        btnFut.setOnClickListener{
            startActivity(Intent(this,ActivityFutball::class.java))
        }
        btnBasquet.setOnClickListener{
            startActivity(Intent(this,ActivityBasquetball::class.java))
        }
        btnBeis.setOnClickListener{
            startActivity(Intent(this,ActivityBeisball::class.java))
        }
        btnSalir.setOnClickListener{
            System.exit(0)
        }
    } // fin de OnCreate

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_simple, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var msg: Int = 1
        // swtich
        when (item.itemId){

            R.id.itmFut-> msg=1
            R.id.itmBasquet-> msg=2
            R.id.itmBeis->msg=3
            R.id.itmSalir->msg=4
        }

        when(msg){

            1 ->  startActivity(Intent(this,ActivityFutball::class.java))
            2->startActivity(Intent(this,ActivityBasquetball::class.java))
            3-> startActivity(Intent(this,ActivityBeisball::class.java))
            else -> System.exit(0)

        }
        //Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}
