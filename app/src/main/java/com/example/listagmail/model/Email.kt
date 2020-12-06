package com.example.listagmail.model

data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder {

    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build () : Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block : EmailBuilder.()->Unit) : Email = EmailBuilder().apply(block).build()
fun fakeEmails() : MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "O mundo precisa de mais sonhos se transformando em realidade"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "24 set"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "Veja como tudo fica mais fácil quando você tem foco"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "25 set"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Se você acredita, você é capaz!"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "26 set"
        stared = false
    },
    email {
        user = "YouTube"
        subject = "Nunca se esqueça que Deus nunca dorme."
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "22 set"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "O mundo precisa de mais sonhos se transformando em realidade"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "24 set"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "Veja como tudo fica mais fácil quando você tem foco"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "25 set"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Se você acredita, você é capaz!"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "26 set"
        stared = false
    },
    email {
        user = "YouTube"
        subject = "Nunca se esqueça que Deus nunca dorme."
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "22 set"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "O mundo precisa de mais sonhos se transformando em realidade"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "24 set"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "Veja como tudo fica mais fácil quando você tem foco"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "25 set"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Se você acredita, você é capaz!"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "26 set"
        stared = false
    },
    email {
        user = "YouTube"
        subject = "Nunca se esqueça que Deus nunca dorme."
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "22 set"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "O mundo precisa de mais sonhos se transformando em realidade"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "24 set"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "Veja como tudo fica mais fácil quando você tem foco"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "25 set"
        stared = false
    },
    email {
        user = "Facebook"
        subject = "Se você acredita, você é capaz!"
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "26 set"
        stared = false
    },
    email {
        user = "YouTube"
        subject = "Nunca se esqueça que Deus nunca dorme."
        preview = "Olá, Vanessa! Você precisa aprender Kotlin"
        date = "22 set"
        stared = false
    },




    )

