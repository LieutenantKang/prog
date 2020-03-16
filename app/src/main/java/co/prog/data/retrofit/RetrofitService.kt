package co.prog.data.retrofit

import co.prog.data.request.LoginRequest
import co.prog.data.response.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitService {
    @POST("/accounts/api-token-auth/")
    fun login(@Body request: LoginRequest) : Call<LoginResponse>
}