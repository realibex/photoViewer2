package com.example.photoviewer2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
//import androidx.databinding.DataBindingUtil
//import com.example.photoviewer2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.img1.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","1")
            Toast.makeText(this,"데이터 바인딩", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        binding.img2.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)
        }

        binding.img3.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)
        }

        binding.img4.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)
        }

        binding.img5.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)
        }

        binding.img6.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","6")
            startActivity(intent)
        }

        binding.img7.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)
        }

        binding.img8.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","8")
            startActivity(intent)
        }

        binding.img9.setOnClickListener{
            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","9")
            startActivity(intent)
        }*/
        //데이터 바인딩 시도

        Log.e("MainActivity", "error로그 입니다")
        Log.w("MainActivity", "warn로그 입니다")
        Log.i("MainActivity", "info로그 입니다")
        Log.d("MainActivity", "debug로그 입니다")
        Log.v("MainActivity", "verbose로그 입니다")

        val btn1 = findViewById<ImageView>(R.id.img1)
        val btn2 = findViewById<ImageView>(R.id.img2)
        val btn3 = findViewById<ImageView>(R.id.img3)
        val btn4 = findViewById<ImageView>(R.id.img4)
        val btn5 = findViewById<ImageView>(R.id.img5)
        val btn6 = findViewById<ImageView>(R.id.img6)
        val btn7 = findViewById<ImageView>(R.id.img7)
        val btn8 = findViewById<ImageView>(R.id.img8)
        val btn9 = findViewById<ImageView>(R.id.img9)


        btn1.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","1")
            Log.d("MainActivity", "Img1 클릭")
            startActivity(intent)

        }

        btn2.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)

        }

        btn3.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","3")
            startActivity(intent)

        }

        btn4.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","4")
            startActivity(intent)

        }

        btn5.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","5")
            startActivity(intent)

        }

        btn6.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","6")
            startActivity(intent)

        }

        btn7.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","7")
            startActivity(intent)

        }

        btn8.setOnClickListener{

            val intent = Intent(this,ImageInsideActivity::class.java)
            intent.putExtra("data","8")
            startActivity(intent)

        }

        btn9.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)
        }


    }

}