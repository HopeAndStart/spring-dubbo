package com.zsl.service.protocol;

import com.zsl.pojo.Student;
import org.apache.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.*;

/**
* TODO Dubbo发布Rest协议服务
* @author zsl
* @date: 2019/6/27 10:53
* @version 1.0
**/
@Path("rest")
@Consumes({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
public interface RestProtocolService {

    /**
    * TODO 测试Rest协议GET请求方法
    * @author zsl
    * @date 2019/6/27 10:56
    **/
    @GET
    @Path("{id : \\d+}")
    String restProtocolGetMethod(@PathParam("id") Integer id);

    /**
    * TODO 测试Rest协议POST请求方法
    * @author zsl
    * @date 2019/6/27 10:56
    **/
    @POST
    @Path("post")
    String restProtocolPostMethod(Student student);

}
