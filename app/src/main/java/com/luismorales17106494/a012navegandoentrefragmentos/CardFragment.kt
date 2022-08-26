package com.luismorales17106494.a012navegandoentrefragmentos

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class CardFragment : Fragment(R.layout.fragment_card) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val botonNavProduct = view.findViewById<Button>(R.id.btnIrAProduct)

        botonNavProduct.setOnClickListener {
            findNavController().navigate(Uri.parse("cursoAndroid://product"))
        }

    }
}