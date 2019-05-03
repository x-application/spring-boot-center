package x.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class SpringBootCenterApplication

fun main(args: Array<String>) {
    runApplication<SpringBootCenterApplication>(*args)
}
