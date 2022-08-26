
package com.luismorales17106494.a012navegandoentrefragmentos

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class ProductFragment : Fragment(R.layout.fragment_productc) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val botonIRPrimerFragme = view.findViewById<Button>(R.id.btnIrAPrimerFragment)

        botonIRPrimerFragme.setOnClickListener {
            findNavController().navigate(Uri.parse("cursoAndroid://primer"))
        }

    }


}