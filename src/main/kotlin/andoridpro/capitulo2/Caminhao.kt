package andoridpro.capitulo2

class Caminhao(
    var cor: String,
    var ano: Int,
    var modelo: String,
    protected var capacidade: Long
) : Veiculo(cor = cor, ano = ano, modelo = modelo) {
    init {
        println("Contruindo um novo carro")
    }

    override fun toString(): String {
        return """
            Cor: $cor
            Ano: $ano
            Modelo: $modelo
            Capacidade: $capacidade
        """.trimIndent()
    }
}