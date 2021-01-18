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
    @Headers("Authorization: token a0727a84f43a7b1f08880568284cb626ed63242b")
    fun getSearchUser (
        @Query("q") query: String
    ): Call<UserResponse>
}