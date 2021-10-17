package andoridpro.capitulo2


fun main() {
    val uno = Carro("Amarelo", 2015, "Uno")
    println(uno)

    println("=====================")

    val mercedes = Carro("Preta", 2012, "Mercedes")
    println(mercedes)
    mercedes.acelerar(155)

    println("======================")

    val scania = Caminhao("Preto", 2015, "Scania Optimus", 70000)
    println(scania)



}



