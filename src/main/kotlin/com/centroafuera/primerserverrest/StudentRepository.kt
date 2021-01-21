package com.centroafuera.primerserverrest

import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long>{

}