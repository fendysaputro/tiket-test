package id.phephen.tikettest.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by phephen on 17,January,2021
 * https://github.com/fendysaputro
 */
data class User(
    val login: String,
    val id: Int,
    @SerializedName("avatar_url")
    val avatarUrl: String
)
