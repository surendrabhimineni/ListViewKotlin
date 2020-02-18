package com.example.listviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var array = arrayOf(
        "Melbourne",
        "Vienna",
        "Vancouver",
        "Toronto",
        "Calgary",
        "Adelaide",
        "Perth",
        "Auckland",
        "Helsinki",
        "Hamburg",
        "Munich",
        "New York",
        "Sydney",
        "Paris",
        "Cape Town",
        "Barcelona",
        "London",
        "Bangkok"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, R.layout.list_item, array)

        val listView: ListView = findViewById(R.id.listview_1)
        listView.setAdapter(adapter)


        listView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>, view: View,
                position: Int, id: Long
            ) {

                // value of item that is clicked
                val itemValue = listView.getItemAtPosition(position) as String

                // Toast the values
                Toast.makeText(applicationContext, "Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG).show()
            }
        }

    }
}
