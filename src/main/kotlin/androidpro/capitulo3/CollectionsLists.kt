package androidpro.capitulo3

fun main() {

    //ArrayListOf e seus comportamentos Básicos

    var arrayList = arrayListOf("Thamiris", "Tiguinha", "Bibinha", "Serginha", "Matheus")
    arrayList.add("Benjamin")

    println(arrayList)

    arrayList.remove("Benjamin")

    println(arrayList)

    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("Bibinha"))

    arrayList.forEach {
        print("$it ")
    }
    println()
    println("=================================================")

    //Introduçao a listas do tipo Hash que nao permitem itens duplicados

    var set = hashSetOf(1,2,4,4,60,60,70)
    set.add(20)
    set.add(30)
    set.remove(1)

    set.forEach {
        println(it)
    }

    println("=================================================")

    //Introducao a lista do tipo Map

    var map = hashMapOf(1 to "Tiguinha", 2 to "Bibinha", 3 to "Serginha")
    map.put(4,"Thamiris")
    println(map.get(4))

    map.forEach {
        println("Key: ${it.key} Valor: ${it.value}")
    }








}