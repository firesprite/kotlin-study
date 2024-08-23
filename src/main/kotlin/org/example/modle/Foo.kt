package org.example.modle

const val BAR = "bar"

fun baz() {
    println("baz message")
}

fun baz2(message: String = "message") {
    println("baz2 $message")
}