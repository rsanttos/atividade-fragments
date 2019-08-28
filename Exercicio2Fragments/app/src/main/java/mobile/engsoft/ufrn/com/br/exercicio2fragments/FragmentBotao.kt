package mobile.engsoft.ufrn.com.br.exercicio2fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class FragmentBotao: Fragment() {

    private var btn: Button? = null
    var onClick: OnClickBtn? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v = inflater.inflate(R.layout.fragment_botao, container, false)
        btn = v.findViewById(R.id.btn_fragment)
        btn?.setOnClickListener {
            onClick?.onClick()
        }
        return v
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if(context !is OnClickBtn){
            throw RuntimeException("Não é OnClickBtn")
        }
        onClick = context
    }

}