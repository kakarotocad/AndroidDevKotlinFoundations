package androidpro.capitulo3

fun main() {

    try {
        print("Digite um numero: ")
        val numero: Int = readLine()!!.toInt()
        val divisao: Int = 100 / numero

        println("O resultado da operaçao é: $divisao")
    } catch (e: Exception) {
        println("Erro :$e.message")
        println("Trace: $e.stackTrace")
        println("Causa: $e.cause")
    } finally {
        println("Código finalizado!")
    }

}