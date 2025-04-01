package com.dalmuina.showcaseMKT

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform