#### 一：服务协议
Dubbo中支持多种通信协议，项目中提供protocol-provider生产者、protocol-consumer消费者

#### 二：超时优化
为配合博客截取超时配置以及其优化建议提供timeout-provider生产者、timeout-consumer消费者

#### 三：基础模块
spring-dubbo-common为mapper接口与pojo类存在的模块，resources中存放操作SQL的mapper.xml文件
spring-dubbo-service用于定义服务接口的模块

#### 四：依赖引入
所有依赖版本控制都在父项目spring-dubbo中完成，子项目模块根据需求引入对应依赖

#### 五：版本问题
开发中使用JDK 1.8 + MySQL 8 + Spring 5 + Dubbo 2.7.0

#### 六：后期迭代
1、后期根据框架内容扩充项目结构，如并发控制调优、集群、注册中心等等方面的设置
2、关于SpringBoot集成问题将会使用某个项目模块展示，不会新开仓库

#### 七：CSDN博客
[CSDN博客]([官网传送门](http://dubbo.apache.org/zh-cn/docs/user/quick-start.html))地址传输门，配合博客内容在本项目提供模块上可以完成各情况测试
后期并发控制将会使用打包后运行不同容器测试

