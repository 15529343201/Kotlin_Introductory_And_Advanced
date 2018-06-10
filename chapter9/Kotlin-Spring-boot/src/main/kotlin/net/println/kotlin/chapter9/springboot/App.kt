package net.println.kotlin.chapter9.springboot

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class App{

    @Bean
    fun init(repo: LangRepo) = CommandLineRunner{
            repo.save(Lang("Kotlin"))
            repo.save(Lang("Java"))
            repo.save(Lang("C"))
            repo.save(Lang("Cpp"))
            repo.save(Lang("C#"))
            repo.save(Lang("Python"))
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}