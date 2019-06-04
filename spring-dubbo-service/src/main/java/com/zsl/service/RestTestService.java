package com.zsl.service;

import com.zsl.pojo.Student;
import org.apache.dubbo.rpc.protocol.rest.support.ContentType;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @Author:zsl
 * @Despriction:
 * @Date:Create in 2019/6/3 23:01
 * @Modify:
 */
@Path("rest")
@Consumes({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
public interface RestTestService{

    @GET
    @Path("{id : \\d+}")
    Student restGetTestMethod(@PathParam("id") Integer id);

    @POST
    @Path("post")
    String restPostTestMethod(Student student);

}
