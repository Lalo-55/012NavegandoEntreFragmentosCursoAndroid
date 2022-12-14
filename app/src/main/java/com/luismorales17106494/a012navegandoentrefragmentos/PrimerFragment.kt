package com.luismorales17106494.a012navegandoentrefragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController

class PrimerFragment : Fragment(R.layout.fragment_primer) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton = view.findViewById<Button>(R.id.btnNavegar)
        val texto = view.findViewById<TextView>(R.id.TvTexto1)



        setFragmentResultListener("requestKey") { key, bundle ->
            val result = bundle.getString("bundleKey")
            texto.text = result

        }


        boton.setOnClickListener {

            //Navegando al Segundo fragmento con parametros  usando SafeArgs
            val action = PrimerFragmentDirections.actionPrimerFragmentToSegundoFragment("Lalo", 4, "55")
            findNavController().navigate(action)

            /*Forma de navegar al segundo Fragemento con parametros
            findNavController().navigate(
                R.id.action_primerFragment_to_segundoFragment,
                bundleOf("nombre" to "lalo", "apellido" to "55", "edad" to 30)
            )

             */

            /*
            //Forma de navegar al Segundo Fragmento

            requireActivity().supportFragmentManager.commit {
                //Agrega  encima sobre el fragment
                // add(R.id.fragment_container_view, SegundoFragment())

                //Remplaza el fragmento
                replace(R.id.fragment_container_view, SegundoFragment.newInstance("Lalo", "55", 26))
                addToBackStack("primerFragment")
            }

             */


        }


    }


}