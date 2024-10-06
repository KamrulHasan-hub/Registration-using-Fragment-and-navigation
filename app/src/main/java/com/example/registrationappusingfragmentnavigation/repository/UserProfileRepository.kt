package com.example.registrationappusingfragmentnavigation.repository

import androidx.lifecycle.LiveData
import com.example.registrationappusingfragmentnavigation.UserProfile
import com.example.registrationappusingfragmentnavigation.dao.UserProfileDao

class UserProfileRepository(private val userProfileDao: UserProfileDao) {
    fun getUserProfiles(): LiveData<List<UserProfile>> {
        return userProfileDao.getAllUserProfiles()
    }

    suspend fun insert(userProfile: UserProfile) {
        userProfileDao.insert(userProfile)
    }


    suspend fun update(userProfile: UserProfile) {
        userProfileDao.update(userProfile)
    }

    suspend fun delete(userProfile: UserProfile) {
        userProfileDao.delete(userProfile)
    }
}