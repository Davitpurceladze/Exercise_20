package com.example.exercise_20.presentation.screen.users

import androidx.fragment.app.viewModels
import com.example.exercise_20.databinding.FragmentUsersBinding
import com.example.exercise_20.presentation.base.BaseFragment
import com.example.exercise_20.presentation.event.users.UsersEvent
import com.example.exercise_20.presentation.model.user.User


class UsersFragment : BaseFragment<FragmentUsersBinding>(FragmentUsersBinding::inflate) {

    private val viewModel: UsersViewModel by viewModels()
    private lateinit var userRecyclerAdapter: UserRecyclerAdapter

    private val list: List<User> = listOf(
        User(1, "dato", "purceladze", "25", "randmo@gmail.com"),
        User(1, "ana", "purceladze", "25", "randmo@gmail.com"),
        User(1, "sandro", "purceladze", "25", "randmo@gmail.com")
    )

    override fun bind() {
        userRecyclerAdapter = UserRecyclerAdapter()
        binding.apply {
            userRecycler.adapter = userRecyclerAdapter
        }
        handleUsersState()
        println("everything works nice")
        println(Math.random() * Math.random() * 1000000)
    }

    private fun handleUsersState() {
        userRecyclerAdapter.submitList(list)
    }

    override fun bindViewActionListeners() {
        binding.btnAddUser.setOnClickListener {
            addUser()
        }
    }


    private fun addUser() {
        viewModel.onEvent(
            UsersEvent.AddUser(
                id = (Math.random() * Math.random()* 100000000).toInt(),
                firstName = binding.etFirstName.text.toString(),
                lastName = binding.etLastName.text.toString(),
                age = binding.etAge.text.toString(),
                email = binding.etEmail.text.toString()
            )
        )
    }
}