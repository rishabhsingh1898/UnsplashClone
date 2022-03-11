package com.rishabh.unsplashclone.api

import com.rishabh.unsplashclone.data.UnsplashPhoto

data class UnsplashResponse(
    val results :List<UnsplashPhoto>
)