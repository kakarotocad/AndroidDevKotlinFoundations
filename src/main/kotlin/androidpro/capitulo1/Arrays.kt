package androidpro.capitulo1

fun main() {
    val estados = arrayOf("MG", "SP", "RJ", "SC", "RS")
    val arrayMisto = arrayOf("Thiguinha", 24, "Bibinha", 22)
    val numbers = arrayOf(1,2,3,4,5,6)

    //Impressao direta de um Array
    println(estados.contentToString())
    println(arrayMisto.contentToString())
    println(numbers.contentToString())

    println("================================")
    //Imprimindo por elemento
    estados.forEach {
        println(it)
    }
    println("=================================R")
    //somando arrays
    val outrosEstados = arrayOf("BA", "ES", "PA")
    val todosEstados = estados + outrosEstados
    println(todosEstados.contentToString())

    //toda string é um array
    var str = "Eu sou um array"
    println(str.length)
    println(str[5])
}