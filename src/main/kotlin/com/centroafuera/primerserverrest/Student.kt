package com.centroafuera.primerserverrest

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Student(var name: String, var surname : String) {
    @Id
    @GeneratedValue
    private val id: Long? = null //Genera el valor aleatoriamente

    override fun equals(other: Any?): Boolean {
        if (other is Student){
            return other.id == id && id != null  //tiene que ser distino de null y no pueden ser iguales
        }else{
            return false
        }
    }

    override fun hashCode(): Int {
        return Objects.hash(id, name, surname) //las variables
    }

    override fun toString(): String {
        return "Id:$id es un Alumno y se llama: $name $surname"
    }

}