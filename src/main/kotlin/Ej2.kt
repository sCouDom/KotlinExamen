import kotlin.random.Random

class Ej2 constructor(size: Int, init: (Int) -> Int) {
    val array1 = Array<Int>(size,init)
}

fun main(){
    val e2 = Ej2(10, {Random.nextInt(50,250)})
    e2.array1.forEach { println(it) } //Vemos que el array tiene tamaño 10, como se le dice e imprime la tabla del 6
}