package com.example.estudotrabalhofinal.data


import javax.inject.Inject

class UserRepository @Inject constructor(private val userDao: UserDao) {
    suspend fun insertUser(user: User) {
        userDao.insert(user)
    }

    suspend fun getUserByEmail(email: String): User? {
        return userDao.getUserByEmail(email)
    }
}