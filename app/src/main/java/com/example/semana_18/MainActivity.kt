package com.example.semana_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //se crea el evento clic para pasar a la activity addres
        buton_mapa.setOnClickListener {
            val intent= Intent(this,addres::class.java)
            startActivity(intent)
        }
        viewpage()

    }
    //se crea la funcion viewpage que contiene la lista (posee una mutablelist)
    private fun viewpage(){
        val list: MutableList<String> = ArrayList()
        list.add("Creador:Salvador Mauricio Chavarria Carranza")
        list.add("Boton para abrir Google Maps")
        list.add("Boton para abrir Google Maps")
        list.add("Boton para abrir Google Maps")
        list.add("Boton para abrir Google Maps")
        list.add("Boton para abrir Google Maps")

//se crea otra variable en donde se se almacenan los colores hexadecimales (cambia los colores del backgruond
        val backList: MutableList<String> = ArrayList()
        backList.add("#B6DCB6")
        backList.add("#D2E9E1")
        backList.add("#FBEDC9")
        backList.add("#F8DDA9")
        backList.add("#FCB6D0")
        backList.add("#FFDEE1")


        // adaptador del main activity con los datos de las dos variables anteriormente definidas vinculandolos
        // con la clase vista .
        pagina.adapter = vista(this, list, backList)
    }
    }

