package com.example.exercise_20.presentation.screen.users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.exercise_20.databinding.ItemUserBinding
import com.example.exercise_20.presentation.model.user.User

class UserRecyclerAdapter : ListAdapter<User, UserRecyclerAdapter.UserViewHolder>(UsersDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = UserViewHolder(
        ItemUserBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind()
    }

    inner class UserViewHolder(private val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root) {
            private lateinit var item : User
            fun bind() {
                item = currentList[adapterPosition]
                binding.apply {
                    tvFirstName.text = item.firstName
                }
            }
    }

    class UsersDiffUtil : DiffUtil.ItemCallback<User>() {
        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem == newItem
        }
    }
}