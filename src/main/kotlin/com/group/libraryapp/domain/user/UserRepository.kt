package com.group.libraryapp.domain.user

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String): User? //Optional<User>

    /*
    * Optional
    * JDK8에서 등장한 optional은 어떤 값이 null이 될 수 있는지 없는지를 나타내줌
    * 코틀린은 어떤값이 null인지 아닌지 잘 알려주기 때문에 optional 필요 없음
    * */
}