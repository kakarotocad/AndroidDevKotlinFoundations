package androidpro.capitulo3

enum class Direcao{
    NORTE,
    SUL,
    LESTE,
    OESTE
}

class Bussola{
    var direcao: Direcao = Direcao.NORTE
}

fun main() {
    val bussola = Bussola()

    println(bussola.direcao)

    bussola.direcao = Direcao.SUL

    println(bussola.direcao)
}