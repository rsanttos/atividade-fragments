package mobile.engsoft.ufrn.com.br.exercicio1fragments

import android.widget.Button

data class MyBtn (var nomeCor: String, var codigoCor: Int) {
    override fun toString(): String {
        return this.nomeCor
    }
}