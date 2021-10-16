package androidpro.capitulo1

import java.util.*

fun main() {

    //funçao que nao recebe nem retorna nenhum valor
    olaMundo()
    //funcao que não recebe nada mas retorna um parametro/valor
    println(currentTime())

    //funcao que recebe parametros mas nao retorna nada
    somaSemRetorno(2,5)

    //funcao que recebe parametros e retorna um resultado
    println(somaComRetorno(2,5))
}

fun somaSemRetorno(a: Int, b:Int){
    val soma = a + b
    println("A soma de $a + $b é $soma")
}

fun somaComRetorno (a: Int, b:Int): Int{
    return a+b
}

fun olaMundo(){
    println("Ola Mundo!")
}

fun currentTime(): Date{
    return Date()
}