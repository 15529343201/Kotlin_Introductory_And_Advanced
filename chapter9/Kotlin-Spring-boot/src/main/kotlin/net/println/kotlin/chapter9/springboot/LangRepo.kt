package net.println.kotlin.chapter9.springboot

import org.springframework.data.repository.CrudRepository


interface LangRepo: CrudRepository<Lang, Long>{
    fun findById(id: Long): Lang

    fun findByName(name: String): Iterable<Lang>
}