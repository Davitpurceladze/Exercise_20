package com.example.exercise_20.presentation.event.users

sealed class UsersEvent {
    data class AddUser(
        val id: Int,
        val firstName: String,
        val lastName: String,
        val age: String,
        val email: String
    ) : UsersEvent()
}
