package org.example.org.example.modle

object Score {
    private val students = arrayListOf<Student>()
    fun printScores() {
        for (student in students) {
            println("${student.name} score : ${student.score}")
        }
    }

    fun addStudents(arrayList: ArrayList<Student>) {
        students.addAll(arrayList)
    }
}

class Student(val name: String, var score: Int, var group: String)