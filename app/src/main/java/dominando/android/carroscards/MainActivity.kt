package dominando.android.carroscards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val vehicles = mutableListOf(
        Vehicle("Onix", 2018, 1, true, true),
        Vehicle("Uno", 2002, 2, true, false),
        Vehicle("Del Rey",1988,3,false,true ),
        Vehicle("Gol",2014,0,true,true),
        Vehicle("Prisma", 2018, 1, true, true),
        Vehicle("Brava", 2002, 2, true, false),
        Vehicle("Ka",1988,3,false,true ),
        Vehicle("Polo",2014,0,true,true)

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                val listView = ListView(this)
        setContentView(listView)
        val adapter = VehicleAdapter(this,vehicles)
        listView.adapter = adapter

        listView.setOnItemClickListener{
            parent,view,position, id ->
            val(model,year)= vehicles[position]
            Toast.makeText(this,"$model $year", Toast.LENGTH_SHORT).show()
        }
    }
}