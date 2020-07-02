package com.example.pneumoniaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.pneumoniaapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding//binding object
    private val myData:MyData=
        MyData("Have you heard of Pneumonia?","Click the buttons to know about pneumonia")//instance of myData data class
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main) //using dataBinding to setContentView
        binding.myData=myData
        binding.doctor.setOnClickListener {
           val toast=Toast.makeText(applicationContext,"Hey pal,I have something for you",Toast.LENGTH_LONG)
                   toast.setGravity(Gravity.END,200,-304)
               toast.show()
             }

        var clickCounter=0

        binding.aboutBtn.setOnClickListener(object :View.OnClickListener {

            override fun onClick(v: View?) {
               clickCounter++
                about_text.setBackgroundResource(android.R.color.holo_blue_bright)
               if (clickCounter==3){
                   Toast.makeText(applicationContext,"Bravo,now you know what Pneumonia is:)",Toast.LENGTH_LONG).show()
               }
                else{
                   Toast.makeText(applicationContext,"Keep Learning",Toast.LENGTH_SHORT).show()
               }
            }
        })
        binding.signsBtn.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                clickCounter++
                signs_text.setBackgroundResource(android.R.color.holo_orange_light)

                if (clickCounter==3){
                    Toast.makeText(applicationContext,"Bravo,now you know what Pneumonia is:)",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(applicationContext,"Keep Learning",Toast.LENGTH_SHORT).show()
                }

            }})
                binding.prevBtn.setOnClickListener(object :View.OnClickListener{
                    override fun onClick(v: View?) {
                       clickCounter++
                        prev_text.setBackgroundResource(android.R.color.holo_green_light)//v?
                        if (clickCounter==3){
                            Toast.makeText(applicationContext,"Bravo,now you know what Pneumonia is:)",Toast.LENGTH_LONG).show()
                        }
                        else{
                            Toast.makeText(applicationContext,"Keep Learning",Toast.LENGTH_SHORT).show()
                        }
                    }
                })

            }}

