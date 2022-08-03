package com.luismorales17106494.a012navegandoentrefragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.setFragmentResult

class SegundoFragment : Fragment(R.layout.fragment_segundo) {
    private var nombre: String? = ""
    private var apellido: String? = " "
    private var edad: Int? = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nombre = requireArguments().getString(MI_NOMBRE)
        apellido = requireArguments().getString(MI_APELLIDO)
        edad = requireArguments().getInt(MI_EDAD)

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
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view, TercerFragment())
                addToBackStack("segundoFragment")

            }
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