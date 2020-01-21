package com.example.nioto.loginregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nioto on 23/07/2018.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://www.nioto-keepintouch.fr/dashboard/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, int age, String password, Response.Listener<String> listener){
        // Constructor
        super(Method.POST, REGISTER_REQUEST_URL, listener,null);

        //Obtain param from Json and Php
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("password", password);
        params.put("age", age + "");
    }

    // GetParams from Json with VOLLEY
    @Override
    public Map<String, String> getParams(){
        return params;
    }
}
