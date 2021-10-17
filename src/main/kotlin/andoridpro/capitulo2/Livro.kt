package andoridpro.capitulo2

class Livro(
    val titulo: String,
    val autor: String,
    val ano: Int
)

data class DataLivro(
    val titulo: String,
    val autor: String,
    val ano: Int
)

fun main() {
    val livro = Livro("A vida e legado de devBibinha", "devTiguinha", 2025)
    val livro2 = Livro("A vida e legado de devBibinha", "devTiguinha", 2025)

    val dataLivro = DataLivro("Minha sogra Macumbeira", "DevBibinha", 2022)
    val dataLivro2 = DataLivro("Minha sogra Macumbeira", "DevBibinha", 2022)

    //Data classes possuem funçao toString já embutidas
    println(livro)
    println(dataLivro)

    //Com a funçao data CLasses os dados podem ser comparados de forma única
    println("Os livros 1 e 2 são iguais: ${livro.equals(livro2)}")
    println("Os dataLivros 1 e 2 são iguais: ${dataLivro.equals(dataLivro2)}")

}
