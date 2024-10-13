package com.example.pertemuan1

fun ContohList () {
    println("=== List ====")
    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Muttable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus Data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())


    shape.removeAt(1)
    println(shape)

    //Mengubah data di dalam list Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun main () {
    ContohList()
}