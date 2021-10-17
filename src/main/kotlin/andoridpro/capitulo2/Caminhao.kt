package andoridpro.capitulo2

class Caminhao(
    var cor: String,
    var ano: Int,
    var modelo: String,
    protected var capacidade: Long
) : Veiculo(cor = cor, ano = ano, modelo = modelo), Carregavel, Dirigivel {
    init {
        println("Contruindo um novo carro")
    }

    override fun carregar(quantidade: Int) {
        println("O total de $quantidade kg foi carregado em seu Caminhão.")
    }

    override fun acelerar(speed: Long) {
        println("Acelerando seu $modelo a velocidade: $speed km/h")
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