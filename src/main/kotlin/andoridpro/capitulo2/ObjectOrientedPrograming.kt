package andoridpro.capitulo2

class Carro(
    var cor: String,
    var ano: Int,
    var modelo: String
){
    override fun toString(): String {
        return """
            Cor: $cor
            Ano: $ano
            Modelo: $modelo
        """.trimIndent()
    }
}

fun main() {
    val uno = Carro("Amarelo", 2015, "Uno")
    println(uno)
    println("=====================")
    val mercedes = Carro("Preta", 2012, "Mercedes")
    println(mercedes)
}