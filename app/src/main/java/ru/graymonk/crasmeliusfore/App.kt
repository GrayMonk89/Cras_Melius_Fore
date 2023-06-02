package ru.graymonk.crasmeliusfore

import android.app.Application
import android.content.Context
import androidx.fragment.app.Fragment
import ru.graymonk.crasmeliusfore.data.FakeUsersRepositoryImplementation
import ru.graymonk.crasmeliusfore.domain.repository.UsersRepository

class App:Application() {
    val userRepository: UsersRepository by lazy { FakeUsersRepositoryImplementation() }
}

val Context.app: App get() = applicationContext as App
val Fragment.app: App get() = requireContext().applicationContext as App