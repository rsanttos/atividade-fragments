package mobile.engsoft.ufrn.com.br.exercicio1fragments

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), FragmentMenu.OnItemClickBtn {
    private var fragmentVazio: FragmentVazio? = null
    private var fragmentMenu: FragmentMenu? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentVazio = supportFragmentManager.findFragmentById(R.id.frag_vazio) as FragmentVazio
        fragmentMenu = supportFragmentManager.findFragmentById(R.id.frag_menu) as FragmentMenu
    }

    override fun onClick(myBtn: MyBtn) {
        fragmentVazio?.setBackgroundColor(myBtn.codigoCor)
    }

}
