package com.zsl.service;

import com.zsl.pojo.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @Author:zsl
 * @Despriction:
 * @Date:Create in 2019/6/3 23:01
 * @Modify:
 */
@Path("rest")
@Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
public interface RestTestService{

    @GET
    @Path("{id : \\d+}")
    Student restGetTestMethod(@PathParam("id") Integer id);

    @POST
    @Path("post")
    String restPostTestMethod(Student student);

}
