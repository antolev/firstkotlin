package leva.com.firstkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //PAGINA 30

    private val items = listOf(
        "Mon 6/23 - Sunny - 31/17",
        "Tue 6/24 - Foggy - 21/8",
        "Wed 6/25 - Cloudy - 22/17",
        "Thurs 6/26 - Rainy - 18/11",
        "Fri 6/27 - Foggy - 21/10"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Qui era presente un TextBox che ora ho reso invisibile.
        message.text = "Ciao"
        toast("Ciao")
        toast("Ciao", Toast.LENGTH_LONG)
        var totale: Int = add(2,3)


        //Inizializzo la mia RecyclerView
        var forecastList = findViewById(R.id.forecast_list) as RecyclerView
        forecastList.layoutManager = LinearLayoutManager(this)
        forecastList.adapter = ForecastListAdapter(items)


    }

    //Funzione semplice
    fun add(x: Int, y: Int) : Int {
        return x + y
    }

    //Se la funzione ha una sola istruzione, è possibile scriverla in questo modo
    fun addSingleLine(x: Int, y: Int) : Int = x + y

    //è possibile creare funzioni con proprietà che di default hanno un determinato valore.
    //Se l'utente non valorizza la proprietà, questa prende il valore di default
    fun toast(message: String, lenght: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, lenght).show();
    }


    //Ho la possibilta di prendere, tramite alcune espressioni, elementi facenti parti di determinate classi
    //In questo caso, ho preso
    fun toast(message: String, tag: String = MainActivity::class.java.simpleName, lenght: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "[$tag $message]", lenght).show()
    }


    open class Animal(firstname: String)

    class Person(name: String, surname: String)


}
