package person

open class Person(private val id: String, private var name: String, private var lastName: String, private val sexe : Genre) {

    override fun toString(): String {
        return "Person(id='$id', name='$name', lastName='$lastName', sexe=$sexe)"
    }

    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) return false

        other as Person
        return id == other.id
    }


    fun getId(): String {
        return id
    }

    fun setName(name : String)  {
        this.name = name
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }



    fun getName() : String {
        return name
    }

    fun getLastName(): String {
        return lastName
    }

    fun getSexe() : Genre {
        return sexe
    }



}



class Employe(id:String, name : String, lasname: String, sexe: Genre, private var salary: Double) : Person(id, name, lasname, sexe) {

    fun getSalary() : Double {
        return salary;
    }
    fun setSalary(salary: Double) {
        this.salary = salary
    }

}


class Client(id:String, name : String, lasname: String, sexe: Genre, private val token: String): Person(id,name, lasname, sexe) {
    fun getToken() : String{
        return this.token
    }
}