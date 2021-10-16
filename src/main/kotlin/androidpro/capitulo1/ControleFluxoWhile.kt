package androidpro.capitulo1

fun main() {

    var cont: Int = 1

    println("Usando o while primeiro é checada a condiçao para depois entrar no loop")
    while(cont<=20){
        print("$cont ")
        cont++
    }
    println()
    println("=============================================================")
    cont=1
    println("Usando o doWhile ele executa tudo antes de validar a condiçao para entrar no loop")
    do{
       print("$cont ")
       cont++
    }while(cont<=20)
}