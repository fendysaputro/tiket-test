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
    @Headers("Authorization: token 516a89771e2e83f39fd0779191cefb5584ed4254")
    fun getSearchUser (
        @Query("q") query: String
    ): Call<UserResponse>
}