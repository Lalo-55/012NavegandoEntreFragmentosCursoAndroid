package com.luismorales17106494.a012navegandoentrefragmentos

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class TercerFragment : Fragment(R.layout.fragment_tercer) {
    private var numero1: Int? = 0
    private var numero2: Int? = 0
    private val args: TercerFragmentArgs by navArgs()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        numero1 = args.numero1
        numero2 = args.numero2

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val texto = view.findViewById<TextView>(R.id.tvSuma)
        val botonNavegar = view.findViewById<Button>(R.id.btnIrAFragmentProduct)

        texto.text = "numero 1: $numero1\nnumero 2: $numero2\nSuma : ${numero1?.plus(numero2!!)}"


        botonNavegar.setOnClickListener {
            //Ir a productGraph
            //findNavController().navigate(R.id.product_graph)

            //Ir a Directament a Card Fragment con Deeplink
            findNavController().navigate(Uri.parse("cursoAndroid://card"))
        }


    }


}