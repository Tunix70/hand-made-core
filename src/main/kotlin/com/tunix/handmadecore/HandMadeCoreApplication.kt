package com.tunix.handmadecore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories
class HandMadeCoreApplication

fun main(args: Array<String>) {
    runApplication<HandMadeCoreApplication>(*args)
}
