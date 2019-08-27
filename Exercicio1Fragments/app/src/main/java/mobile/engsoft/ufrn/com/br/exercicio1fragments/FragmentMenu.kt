package mobile.engsoft.ufrn.com.br.exercicio1fragments

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.ListFragment
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class FragmentMenu: ListFragment() {

    private var adapter: ArrayAdapter<MyBtn>? = null
    private var listener: OnItemClickBtn? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_list_item_1)

        var titulosBtns = arrayOf("PRETO", "AZUL", "VERDE", "VERMELHO", "AMARELO")
        var codigosCores = arrayOf(Color.BLACK, Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW)
        for(t in titulosBtns.indices){
            var myBtn = MyBtn(titulosBtns[t], codigosCores[t])
            adapter?.add(myBtn)
        }
        listAdapter = adapter
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if(context !is OnItemClickBtn){
            throw RuntimeException("Não é OnItemClickBtn")
        }
        listener = context
    }


    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        super.onListItemClick(l, v, position, id)
        var btn = adapter?.getItem(position)
        listener?.onClick(btn!!)
    }


    interface OnItemClickBtn{
        fun onClick(myBtn: MyBtn)
    }
}