package com.example.usuarios

data class User (val id:Long, var name:String, var lasName:String, var url:String){

    fun getFullName(): String = "$name $lasName"


}
