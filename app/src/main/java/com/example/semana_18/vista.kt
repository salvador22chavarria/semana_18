package com.example.semana_18

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.semana_18.databinding.ItemBinding

//se crea la clase vista para el contexto, el texto del textview y el background color
class vista (
    private val context:Context,
    private val textolista:MutableList<String>,
    private val colores:MutableList<String>,
    //se crea el recycleview adapter para adaptar la vista con la clase viewpagerholder
        ):RecyclerView.Adapter<vista.ViewPagerHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding= ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewPagerHolder(binding)
    }
//se cre la funcion para las variables de la posicion del texto que se muestra en el main y los colores del background
    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val texto=textolista[position]
        val col=colores[position]
    //llamamos el bind creada mas adelante
        holder.bind(texto,col)
    }
//esta funcion es para retornar el tamaño del texto de la lista
    override fun getItemCount(): Int {
        return textolista.size

    }
    //en esta clase (viewpager older se crea una variable privada que enlaza o vincula los items deel layout
    class ViewPagerHolder(private var itemHolderBinding: ItemBinding):
            RecyclerView.ViewHolder(itemHolderBinding.root){
        //esta funcion llama el texto y los colores del background del main activity y los
        //esta funcion llama el texto y colores que son las variables que se crean en esta funcion y dentro se usa el itemholder para almacenar y vincular la vista con el layout y poder manejar
        //los objetos que hay en ella
                fun bind(texto:String,col:String){
                    itemHolderBinding.texto.text=texto
                    itemHolderBinding.root.setBackgroundColor(Color.parseColor(col))
                }

            }
}
