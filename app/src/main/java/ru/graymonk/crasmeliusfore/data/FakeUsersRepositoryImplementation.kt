package ru.graymonk.crasmeliusfore.data

import ru.graymonk.crasmeliusfore.domain.entities.UserEntity
import ru.graymonk.crasmeliusfore.domain.repository.UsersRepository

class FakeUsersRepositoryImplementation : UsersRepository {

    private val data: List<UserEntity> =
        listOf(
            UserEntity("0", 0, "0"),
            UserEntity("1", 1, "1"),
            UserEntity("2", 2, "2")
        )


    override fun getUsers(): List<UserEntity> {
        return data
    }
}