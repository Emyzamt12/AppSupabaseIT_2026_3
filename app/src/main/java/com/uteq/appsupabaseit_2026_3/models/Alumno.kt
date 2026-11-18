package com.uteq.appsupabaseit_2026_3.models

import kotlinx.serialization.Serializable
@Serializable
data class Alumno(
    val id: Long,
    val nombres: String,
    val paralelo: String,
    val correo: String? = null,
    val telefono: String? = null,
    val foto: String? = null,
    val created_at: String? = null
)

