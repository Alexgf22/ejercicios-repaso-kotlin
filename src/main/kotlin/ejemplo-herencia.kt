open class Animal(var p: Int) {

    open fun pMetodo()  {
        println("Funcion base")
    }


    override fun toString(): String {
        return "El animal tiene $p años"
    }
}

class Persona(p: Int): Animal(p) {

    override fun pMetodo() {
        println("Funcion derivada")
    }

    override fun toString(): String {
        return "La persona tiene $p años"
    }
}



fun main() {
    var a: Animal = Persona(2)
    a.pMetodo()
}