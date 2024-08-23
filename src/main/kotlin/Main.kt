package org.example
import org.example.modle.*
import org.example.modle.Person
import org.example.modle.baz as fooBaz
import org.example.modle.baz as fooBaz2
//import org.example.modle.BAR

fun main(args: Array<String>) {
    val person = Person("psj")
    //person.name = "aa";
    person.married = true;

    val list = ArrayList<String>();
    list += "aa"
    list.add("ad");
    list -= "aa"
    println(list)
    println(BAR.length)

    fooBaz()
    fooBaz2()
    baz2()
    
    println("Hello World! ${person.name}")
}

/*
fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}*/
