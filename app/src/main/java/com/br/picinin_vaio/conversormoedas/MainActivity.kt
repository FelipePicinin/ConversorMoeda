package com.br.picinin_vaio.conversormoedas


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var campoValor: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoValor = edtValor


        var btnDolar: Button = btnDolar
        btnDolar.setOnClickListener(this)

        var btnEuro: Button = btnEuro
        btnEuro.setOnClickListener(this)

        var btnFranco: Button = btnFranco
        btnFranco.setOnClickListener(this)

    }

    override fun onClick(button: View?) {

        var valor: Double = 0.0

        if(button?.id == btnDolar.id){
            valor = campoValor!!.text.toString().toDouble()
            var dolar: Double = 3.83 * valor
            txtResultado.setText("O valor do dolar é: R$" + dolar)
        }

        else if(button?.id == btnEuro.id){
            valor  = campoValor!!.text.toString().toDouble()
            var euro: Double = 4.34 * valor
            txtResultado.setText("O valor do euro é: R$" + euro)
        }

        else if(button?.id == btnFranco.id){
            valor  = campoValor!!.text.toString().toDouble()
            var franco: Double = 3.84 * valor
            txtResultado.setText("O valor do franco é: R$" + franco)
        }




    }

}
