package com.centroafuera.primerserverrest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController (private val studentRepository : StudentRepository){

    @GetMapping("/students")  //Tipo Get para ver
   fun getAllStudents () : List<Student> {
      return studentRepository.findAll()
    }

    @PostMapping("/students")  //tipo post para insertar
    fun insertStudent(@RequestBody student : Student){  //Rellenar con datos de un estudiante
        studentRepository.save(student)
    }
}