package com.shahir.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//create a function to perform the specified arithmetic calculation

sealed class Operation(val x: Long) {
    abstract fun calculate(y: Long): Long

    //addition
    class add(x: Long): Operation(x) {
        override fun calculate(y: Long): Long {
            return x + y
        }
    }

    //subtraction
    class subtract(x: Long): Operation(x) {
        override fun calculate(y: Long): Long {
            return x - y
        }
    }

    //multiplication
    class multiply(x: Long): Operation(x) {
        override fun calculate(y: Long): Long {
            return x * y
        }
    }


    //division
    class divide(x: Long): Operation(x) {
        override fun calculate(y: Long): Long {
            return x / y
        }
    }
}  //end operation
