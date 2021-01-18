package id.phephen.tikettest.api

import id.phephen.tikettest.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * Created by phephen on 17,January,2021
 * https://github.com/fendysaputro
 */
interface ApiInterface {
    @GET("search/users")
    @Headers("Authorization: token b1bd29594b9c4b80c7aa87b0011e7d73570c221a")
    fun getSearchUser (@Query("q") query: String): Call<UserResponse>
}