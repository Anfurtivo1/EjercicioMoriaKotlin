package EjercicioKotlin

class Hobbit :Personajes(){
    private var anillo : Boolean=false

    fun ponerseAnillo(): Unit {
        this.anillo=true
    }

    fun quitarseAnillo(): Unit {
        this.anillo=false
    }

}