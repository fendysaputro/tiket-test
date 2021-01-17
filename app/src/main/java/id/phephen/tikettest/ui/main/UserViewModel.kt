package id.phephen.tikettest.ui.main

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.phephen.tikettest.api.RetrofitClient
import id.phephen.tikettest.data.model.User
import id.phephen.tikettest.data.model.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by phephen on 17,January,2021
 * https://github.com/fendysaputro
 */
class UserViewModel : ViewModel() {
    val listUsers = MutableLiveData<ArrayList<User>>()

    fun setDataSearch(query: String) {
        RetrofitClient.apiInstance.getSearchUser(query)
            .enqueue(object : Callback<UserResponse> {
                override fun onResponse(
                    call: Call<UserResponse>,
                    response: Response<UserResponse>
                ) {
                    if (response.isSuccessful) {
                        listUsers.postValue(response.body()!!.items)
                    }
                }

                override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                    Log.d("Failure", t.message!!)
                }

            })
    }

    fun getSearchUsers(): LiveData<ArrayList<User>>{
        return listUsers
    }
}