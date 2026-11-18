package com.uteq.appsupabaseit_2026_3.Data


import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
object SupabaseManager {
    val client = createSupabaseClient(
        supabaseUrl = "https://zjxqtiikqvrjmqkwomvl.supabase.co",
        supabaseKey = ""
    ) {
        install(Postgrest)
    }
}

