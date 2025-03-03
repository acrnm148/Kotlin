package com.group.libraryapp.dto.user.response

import com.group.libraryapp.domain.user.User
import com.group.libraryapp.domain.user.UserRepository

// data클래스 -> equals 사용가능
data class UserResponse(
        val id: Long,
        val name: String,
        val age: Int?,
) {

    // constructor를 사용하는 생성자 방식 -> 정적팩토리메소드패턴으로 변경
    companion object {
        fun of(user: User): UserResponse {
            return UserResponse(
                    id = user.id!!,
                    name = user.name,
                    age = user.age
            )
        }
    }
}