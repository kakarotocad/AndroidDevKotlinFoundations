package androidpro.capitulo1

fun main() {
    var idade = 36

    if(idade<18){
        println("Nao pode beber nem tirar carteira")
    }else if (idade < 21){
        println("Pode tirar carteira, mas nao pode beeber")
    }else{
        println("Tá tudo liberado")
    }

    //fazendo o if em uma linha só

    var str: String = if(idade<18) "Menor de Idade" else "Maior de Idade"
    println(str)
}