package com.zsl;

import com.zsl.pojo.Student;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Stream;

public class RestTestClass {



    public static void main(String args[]) throws IOException{

        System.out.println(111);



//        String methodTest = getMethodTest();
//        System.out.println(methodTest);

//        Student s = new Student();
//        s.setId(7);
//        s.setAge(18);
//        s.setName("jhs");
//        String s1 = postMethodTest(s);
//        System.out.println(s1);
    }
    
    public static String getMethodTest() throws IOException {
        // 创建客户端
        OkHttpClient client = new OkHttpClient();
        // 创建请求Request
        String url = "http://localhost:20882/rest/1";
        Request request = new Request.Builder().url(url).build();
        //  执行请求
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    
    public static String postMethodTest(Student student) throws IOException {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:20882/rest/post");
        javax.ws.rs.core.Response post = target.request().post(Entity.entity(student, MediaType.APPLICATION_JSON));
        String s = post.readEntity(String.class);
        return s;
    }

}