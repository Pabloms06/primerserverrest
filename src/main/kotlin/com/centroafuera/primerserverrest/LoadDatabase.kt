package com.centroafuera.primerserverrest

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Configurable
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean

@Configurable
class LoadDatabase {
    companion object{
        val logger = LoggerFactory.getLogger(LoadDatabase.javaClass)
    }

    @Bean
    fun initDatabase(studentRepository : StudentRepository) : CommandLineRunner{
        return CommandLineRunner { args: Array<String?>? ->
            logger.info("Preloading" + studentRepository.save(Student("Paco", "López")))
            logger.info("Preloading" + studentRepository.save(Student("Pablo", "Marcos")))
        }
    }
}