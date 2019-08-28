package mobile.engsoft.ufrn.com.br.exercicio2fragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.widget.Toast

class MainActivity : AppCompatActivity(), OnClickBtn {

    var cont: Int = 0
    val fragmentLeft: FragmentContador1 = FragmentContador1()
    val fragmentRight: FragmentContador2 = FragmentContador2()

    override fun onClick() {
        cont++
        fragmentLeft.setContador(cont)
        fragmentRight.setContador(cont)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentUp: FragmentBotao = FragmentBotao()
        val ft : FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.add(R.id.layUp, fragmentUp)
        ft.add(R.id.layLeft, fragmentLeft)
        ft.add(R.id.layRight, fragmentRight)
        ft.commit()
    }
}
