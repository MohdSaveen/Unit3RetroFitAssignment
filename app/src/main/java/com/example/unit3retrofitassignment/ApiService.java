package com.example.unit3retrofitassignment;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {


    @Headers("Authorization: Client-ID 3897293e57ba29c")
    @Multipart
    @POST("/3/image")
    Call<ResponseDTO> uploadImage(
            @Part MultipartBody.Part image
    );

}
