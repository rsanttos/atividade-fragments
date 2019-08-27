package mobile.engsoft.ufrn.com.br.exercicio1fragments

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.graphics.ColorUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class FragmentVazio: Fragment() {

    private var v: View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_vazio, container, false)
        return v
    }

    fun setBackgroundColor(color: Int){
        v?.setBackgroundColor(color)
    }
}