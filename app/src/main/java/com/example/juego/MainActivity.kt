package com.example.juego

import android.content.DialogInterface
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.graphics.Color
import android.os.Handler
import android.app.AlertDialog
import android.content.Intent


class MainActivity : AppCompatActivity() {

    //<editor-fold desc="IMAGENES">
    lateinit var iv_11:ImageView
    lateinit var iv_12:ImageView
    lateinit var iv_13:ImageView
    lateinit var iv_14:ImageView

    lateinit var iv_21:ImageView
    lateinit var iv_22:ImageView
    lateinit var iv_23:ImageView
    lateinit var iv_24:ImageView

    lateinit var iv_31:ImageView
    lateinit var iv_32:ImageView
    lateinit var iv_33:ImageView
    lateinit var iv_34:ImageView

    //</editor-fold>

    //<editor-fold desc="OTROS">
    lateinit var tv_j1:TextView
    lateinit var tv_j2:TextView

    lateinit var ib_sonido:ImageButton

    lateinit var mp: MediaPlayer
    lateinit var mpFondo: MediaPlayer
    lateinit var imagen1: ImageView
    lateinit var imagen2: ImageView
    //</editor-fold>

    //<editor-fold desc="VARIABLES">
    var imagenesArray =
        arrayOf(11,12,13,14,15,16, 21,22,23,24,25,26)
    var pibe = 0
    var toloteli = 0
    var teofilo = 0
    var escudo = 0
    var viera = 0
    var cariaco = 0

    var turno = 1
    var puntosj1 = 0
    var puntosj2 = 0
    var numeroImagen = 1
    var escuchar = true
    //</editor-fold>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}