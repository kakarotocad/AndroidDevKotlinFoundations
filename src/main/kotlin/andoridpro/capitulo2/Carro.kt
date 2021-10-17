package andoridpro.capitulo2

class Carro(
    var cor: String,
    var ano: Int,
    var modelo: String
) : Veiculo(cor = cor, ano = ano, modelo = modelo) {
    init {
        println("Contruindo um novo carro")
    }

    fun acelerar() {
        println("Acelerando seu/sua $modelo")
    }

    fun abrirPorta(){
        println("Abrindo a porta do Carro")
    }

    override fun toString(): String {
        return """
            Cor: $cor
            Ano: $ano
            Modelo: $modelo
        """.trimIndent()
    }
}