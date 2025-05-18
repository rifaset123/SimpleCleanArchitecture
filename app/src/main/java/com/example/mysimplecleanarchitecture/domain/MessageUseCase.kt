package com.example.mysimplecleanarchitecture.domain

interface MessageUseCase { // test case basis
    fun getMessage(name: String): MessageEntity
}