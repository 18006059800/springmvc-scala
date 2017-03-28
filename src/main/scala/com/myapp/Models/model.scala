package com.myapp.Models

/**
  * Created by jackywong on 24/03/2017.
  */
case class Person(name:String,age:Int,address:String){
  override def toString=s"Person($name,$age,$address)"
}
