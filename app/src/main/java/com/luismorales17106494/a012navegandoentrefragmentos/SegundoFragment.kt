package com.luismorales17106494.a012navegandoentrefragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SegundoFragment : Fragment(R.layout.fragment_segundo) {
    private var nombre: String? = ""
    private var apellido: String? = " "
    private var edad: Int? = 0
    private val args: SegundoFragmentArgs by navArgs()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nombre = args.nombre
        edad = args.edad
        apellido = args.apellido



        /*
        //recibir argumentos a traves del bundle
        arguments?.let { bundle ->


            nombre = bundle.getString(MI_NOMBRE)
            apellido = bundle.getString(MI_APELLIDO)
            edad = bundle.getInt(MI_EDAD)


            /*
            nombre = requireArguments().getString(MI_NOMBRE)
            apellido = requireArguments().getString(MI_APELLIDO)
            edad = requireArguments().getInt(MI_EDAD)

             */
        }

         */


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btnNavegar3)
        val texto = view.findViewById<TextView>(R.id.tvTexto2)
        val enviarDatos = view.findViewById<Button>(R.id.btnEnviarDatos)

        enviarDatos.setOnClickListener {
            val result = "Resultado "
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
        }
        texto.text = "Nombre : $nombre\nApellido: $apellido\nEdad: $edad"

        button.setOnClickListener {


            val action = SegundoFragmentDirections.actionSegundoFragmentToTercerFragment( )
            findNavController().navigate(action)
            //Navegando al Tercer fragmento con parametros  usando SafeArgs


            //findNavController().navigate(R.id.action_segundoFragment_to_tercerFragment)


            /*Forma de navegar al tercer Fragmento
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view, TercerFragment())
                addToBackStack("segundoFragment")

            }

             */
        }
    }

    companion object {

        private const val MI_NOMBRE = "nombre"
        private const val MI_EDAD = "edad"
        private const val MI_APELLIDO = "apellido"

        fun newInstance(nombre: String, edad: Int): Fragment {
            return SegundoFragment().apply {
                arguments = bundleOf(MI_NOMBRE to nombre, MI_EDAD to edad)
            }

        }

        fun newInstance(nombre: String, apellido: String, edad: Int) = SegundoFragment().apply {
            arguments = bundleOf(MI_NOMBRE to nombre, MI_EDAD to edad, MI_APELLIDO to apellido)
        }

    }

}