package com.zsl;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RestTestClass {

    public static void main(String args[]) throws IOException {
        // 创建客户端
        OkHttpClient client = new OkHttpClient();
        // 创建请求Request
        String url = "http://localhost:20882/rest/1";
        Request request = new Request.Builder().url(url).build();
        //  执行请求
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }

}