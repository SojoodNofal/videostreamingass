package com.example.videostreamingass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            var i = Intent(this,video::class.java)
            i.putExtra("video","videoOne")
            i.putExtra("One","https://firebasestorage.googleapis.com/v0/b/firstfirebas-cd69c.appspot.com/o/%D8%A3%D9%82%D8%B5%D8%A7%D9%86%D8%A7%20%D8%AE%D8%A7%D9%84%D8%AF%20%D8%A7%D9%84%D8%AD%D9%84%D8%A7%D9%82%20--%20(%20Khaled%20Alhallak%20aqsana%20)%202021.mp4?alt=media&token=19605d8b-6603-4151-9262-e4b4e048b66c")
            startActivity(i)
        }

        button2.setOnClickListener {
            var i = Intent(this,video::class.java)
            i.putExtra("video","videoTwo")
            i.putExtra("Two","https://firebasestorage.googleapis.com/v0/b/firstfirebas-cd69c.appspot.com/o/%D8%A7%D9%86%D8%B4%D9%88%D8%AF%D8%A9%20%D8%B9%D9%84%D9%89%20%D8%B1%D8%AC%D9%84%20%D9%88%D9%86%D8%B5.mp4?alt=media&token=143b8a92-2395-4759-bddf-8a9a545ffe52")
            startActivity(i)
        }

        button3.setOnClickListener {
            var i = Intent(this,video::class.java)
            i.putExtra("video","videoThree")
            i.putExtra("Three","https://firebasestorage.googleapis.com/v0/b/firstfirebas-cd69c.appspot.com/o/%D9%8A%D8%A7%20%D8%A7%D9%87%D9%84%20%D8%BA%D8%B2%D8%A9%20%D9%83%D8%A8%D8%B1%D9%88%D8%A7.mp4?alt=media&token=5f9e7492-bd8d-4dba-8fe9-72b141996e27")
            startActivity(i)
        }

        button4.setOnClickListener {
            var i = Intent(this,video::class.java)
            i.putExtra("video","videoFour")
            i.putExtra("Four","https://firebasestorage.googleapis.com/v0/b/firstfirebas-cd69c.appspot.com/o/%F0%9F%94%B4%20%D8%A7%D9%86%D8%B4%D9%88%D8%AF%D8%A9%20%D8%A7%D9%84%D9%88%D8%B9%D8%AF%20%D8%A7%D9%84%D9%85%D9%86%D8%AA%D8%B8%D8%B1%20-%20%D8%AC%D8%AF%D9%8A%D8%AF%202021.mp4?alt=media&token=f65f6f93-bfc4-4107-926e-1d2e6630c9bd")
            startActivity(i)
        }


    }
}