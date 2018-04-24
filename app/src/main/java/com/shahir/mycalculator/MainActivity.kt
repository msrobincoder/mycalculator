package com.shahir.mycalculator

// Using R.layout.activity_main from the 'main' source set
import android.os.Bundle
import android.support.v7.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//create a function to perform the specified arithmetic calculation
//
        fun addTwoNumbers(x:Int, y:Int):Int{
            val sum = x + y
            println("The sum is $sum")
            return x + y
        } //end function
        addTwoNumbers(3,4)
    }

    //add.setOnClickListener{(println("Done")}
} //end MainActivity
