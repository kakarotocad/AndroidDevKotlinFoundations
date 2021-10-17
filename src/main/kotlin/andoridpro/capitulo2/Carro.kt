package andoridpro.capitulo2

class Carro(
    var cor: String,
    var ano: Int,
    var modelo: String
) : Veiculo(cor = cor, ano = ano, modelo = modelo), Dirigivel {
    init {
        println("Contruindo um novo carro")
    }

    fun abrirPorta(){
        println("Abrindo a porta do Carro")
    }

    override fun acelerar(speed: Long) {
        println("Acelerando seu $modelo a velocidade: $speed km/h")
    }

    override fun toString(): String {
        return """
            Cor: $cor
            Ano: $ano
            Modelo: $modelo
        """.trimIndent()
    }
}