package androidpro.capitulo1

fun main() {

    //Note que nesse exemplo o for conta de 1 a 20 incluindo o 20
    for(item in 1..20){
        println("Item: $item")
    }

    //Usando o step X o for irá de 1 ate 20 pulando de 2 em 2 começando pelo primeiro valor nesse caso o 1
    for(item in 1..20 step 2){
        println("Item: $item")
    }

    //O foreach pode ser usado para imprimir listas como no exemplo abaixo
    val frutas = listOf<String>("banana", "maca", "pera", "uva")

    frutas.forEach {
        println(it)
    }

}