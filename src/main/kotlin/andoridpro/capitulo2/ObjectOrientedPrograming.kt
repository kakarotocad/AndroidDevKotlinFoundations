package andoridpro.capitulo2


fun main() {
    val uno = Carro("Amarelo", 2015, "Uno")
    println(uno)

    println("=====================")

    val mercedes = Carro("Preta", 2012, "Mercedes")
    println(mercedes)
    uno.acelerar()
    mercedes.acelerar()

    val scania = Caminhao("Preto", 2015, "Scania Optimus", 70000)
    println(scania)
    scania.acelerar()



}



