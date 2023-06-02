package ru.graymonk.crasmeliusfore.domain.repository

import ru.graymonk.crasmeliusfore.domain.entities.UserEntity

interface UsersRepository {
    //CRUD
    //Create
    //Read
    //Update
    //Delete

     fun getUsers(): List<UserEntity>
}