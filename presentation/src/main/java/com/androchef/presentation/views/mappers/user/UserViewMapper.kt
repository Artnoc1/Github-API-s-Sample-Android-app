package com.androchef.presentation.views.mappers.user

import com.androchef.domain.models.user.User
import com.androchef.presentation.mapper.Mapper
import com.androchef.presentation.views.views.UserView

class UserViewMapper : Mapper<UserView, User> {
    override fun mapToView(type: User): UserView {
        return UserView(
            userName = type.userName,
            profilePic = type.profilePic
        )
    }
}