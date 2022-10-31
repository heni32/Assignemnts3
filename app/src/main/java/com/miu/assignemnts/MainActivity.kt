package com.miu.assignemnts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







    }

    fun clicked(view: View) {
        var androidName=findViewById<EditText>(R.id.androidVersionName)
        var androidCode=findViewById<EditText>(R.id.androidCodeName)

        val tableLayoutid: TableLayout  = findViewById(R.id.myTable);
        val tableRow = TableRow(getApplicationContext()) // this
//        // Set new table row layout parameters.
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)

        tableRow.setLayoutParams(layoutParams)
        var newText1 = TextView(this)
        newText1.setText(androidName.text)
        var newText2 = TextView(this)
        newText2.setText(androidCode.text)

        tableRow.addView(newText1,0)
        tableRow.addView(newText2,1)
        tableLayoutid.addView(tableRow)
    }


}