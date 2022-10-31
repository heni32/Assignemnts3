package com.miu.assignemnts

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivityLab4  : AppCompatActivity() {

    private var users = arrayListOf<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutlab4)


      users= arrayListOf<User>( User("tomas","tomas"),User("abebe","tomas"),User("mike","tomas"))




    }

    fun click(view: View) {
        var editEmail=findViewById<EditText>(R.id.emilName)
        var editpass=findViewById<EditText>(R.id.TextPassword)
        var fnameis:String = editEmail.text.toString()
        var pnameis:String = editpass.text.toString()
        val userTry:User= User(fnameis,pnameis)

        if(users.contains(userTry)){
            Toast.makeText(this, "Welcome ${editEmail.text}.", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(this, "Wrong passowrd or email.", Toast.LENGTH_LONG).show()


    }
}