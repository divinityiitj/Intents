package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
const val KEY_1= "Name"
const val KEY_2= "Age"
const val KEY_3= "isStudent"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener{
            val i = Intent(this,MainActivity2::class.java)
            i.putExtra(KEY_1,"Satvik")
            i.putExtra(KEY_2,20)
            i.putExtra(KEY_3,false)
            startActivity(i)
        }
        mailBtn.setOnClickListener{
            val email = editText.text.toString() //reads data from edittext
            val i = Intent()
            i.action = Intent.ACTION_SENDTO   //used for sending mail
            i.data = Uri.parse("mailto:$email") //uniform resource identifier
            startActivity(i)
        }
        browBtn.setOnClickListener{
            val address = editText.text.toString() //reads data from edittext
            val i = Intent()
            i.action = Intent.ACTION_VIEW   //used for viewing in browser
            i.data = Uri.parse("http://$address") //uniform resource identifier
            startActivity(i)
        }
        dialBtn.setOnClickListener{
            val mobile = editText.text.toString() //reads data from edittext
            val i = Intent()
            i.action = Intent.ACTION_DIAL  //used for calling
            i.data = Uri.parse("tel:$mobile") //uniform resource identifier
            startActivity(i)
        }
    }
}