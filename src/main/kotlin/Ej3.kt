import kotlin.random.Random

class Ej3 {
    fun imprimirPares(arreglo: Array<Int>){
        val elementosFiltrados = arreglo.filter { it % 2 != 0 }
        println(elementosFiltrados)
    }
}

fun main(){
    val e3 = Ej3()
    val e2 = Ej2(10, { Random.nextInt(50,250)})
    e3.imprimirPares(e2.array1)
}