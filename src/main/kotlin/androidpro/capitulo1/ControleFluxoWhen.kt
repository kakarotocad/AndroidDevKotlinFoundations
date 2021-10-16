package androidpro.capitulo1

fun main() {

    val idade: Int = 36

    when (idade){

        in 0..17 -> println("Não tem idade ainda")
        in 18..20 -> println("Pode tirar carteira mas nao pode Beber")
        else -> println("Tá tudo liberado")
    }

    println("===== Calculadora =====")
    println("Entre com o valor 1: ")
    val a = readLine()!!.toInt()
    println("Enter operator either +, -, * or /")
    val operator = readLine()
    println("Entre com o valor 2: ")
    val b = readLine()!!.toDouble()

    when (operator) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operator is invalid")
    }

    println("===== Banking System =====")
    var opcao: Int = 2

    when(opcao){
        1 -> println("Checking Account")
        2 -> println("Saving Account")
        3 -> println("Credit Card")
        else ->{
            println("Any valid option entered")
            println("Please contact a clerk to further help")
        }
    }

}