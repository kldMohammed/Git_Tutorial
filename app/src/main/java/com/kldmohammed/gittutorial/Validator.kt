package com.kldmohammed.gittutorial

object Validator {


    fun validatePhone(phone:String):Boolean{
      return  if (phone.length.equals(9)) true else false;

    }


    fun validatePassword(phone:String){

    }


}