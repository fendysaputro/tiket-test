package id.phephen.tikettest.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by phephen on 17,January,2021
 * https://github.com/fendysaputro
 */
object RetrofitClient {

    private const val BASE_URL = "https://api.github.com/"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiInstance = retrofit.create(ApiInterface::class.java)

}