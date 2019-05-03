package x.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootCenterApplication

fun main(args: Array<String>) {
    runApplication<SpringBootCenterApplication>(*args)
}
