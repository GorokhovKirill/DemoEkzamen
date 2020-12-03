package com.example.demoekzamen;

import android.telecom.Call;

public interface UserService {
@POST("authenticate/")
   Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);

}
