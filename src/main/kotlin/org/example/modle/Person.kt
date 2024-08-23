package org.example.modle

open class Person(val name: String,
             var married: Boolean = false,
            age: Int=1) {
    var speed : Int = age;

    private  final

    val init:Boolean = false;

    val const: String= "const"

//    val object: String ="object"
//    val class:String = "class"

    val constructor:String? = null

    fun run(): Int {
        if(init.not()) {
            return speed * 10;
        }
        return speed;
    }
}