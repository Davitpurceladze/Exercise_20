package com.example.exercise_20.presentation.screen.users

import androidx.lifecycle.ViewModel
import com.example.exercise_20.presentation.event.users.UsersEvent

class UsersViewModel: ViewModel() {

    fun onEvent(event: UsersEvent) {
        when (event) {
            is UsersEvent.AddUser -> addUserToList(id = event.id, firstName = event.firstName, lastName = event.lastName, age = event.age, email = event.email)
        }
    }

    private fun addUserToList(id: Int, firstName: String, lastName: String, age: String, email: String) {

        println("user -> $id $firstName $lastName $age $email")
    }
}