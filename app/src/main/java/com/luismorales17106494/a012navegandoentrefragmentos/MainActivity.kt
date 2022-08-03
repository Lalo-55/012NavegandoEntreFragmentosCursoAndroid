package com.luismorales17106494.a012navegandoentrefragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*//Acceder a un fragmento desde el main activity
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, PrimerFragment())
        }

        //Desde el xml, se pone en el fragment container
        //android:name="com.luismorales17106494.a012navegandoentrefragmentos.PrimerFragment"
         */


    }
}