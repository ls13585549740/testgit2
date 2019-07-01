## 简介
funong new erp

## 特征&提供
- SpringBoot最佳实践的项目结构、配置文件、精简的POM
   - Spring Boot
   - MySQL、MyBatis、Droid
   - RestWeb
   - lombok(需要idea插件)、FastJson、Guava、HuTool
   - Swagger
- 统一响应结果封装（//TODO）
- 统一异常处理（//TODO）
- 统一日志打印（//TODO）
- 简单的接口签名认证（//TODO）
- 常用基础方法抽象封装（//TODO）
- 使用Druid Spring Boot Starter 集成Druid数据库连接池与监控
- 使用FastJsonHttpMessageConverter，提高JSON序列化速度
- 集成MyBatis、通用Mapper插件、PageHelper分页插件，实现单表业务零SQL


## 开发规范
- JDK 1.8
- 阿里巴巴JAVA开发手册
- 表名，建议使用小写，多个单词使用下划线拼接
- Entity、DAO、DTO放在dal文件夹中，分别代表基本的与数据库一一对应的Bean、数据访问接口、业务数据传输对象
- 接口以Facade结尾，接口的实现以FacadeImpl结尾，具体的业务逻辑放在Service中
- 需要工具类的话建议先从```Hutool```中找，实在没有再继承```Hutool```中相应的工具类造轮子或引入类库，尽量精简项目
 
## 技术选型&文档
- Spring Boot（[查看Spring Boot学习&使用指南](https://blog.csdn.net/lsy0903/article/category/6413992)）
- MyBatis（[查看官方中文文档](http://www.mybatis.org/mybatis-3/zh/index.html)）
- MyBatisb通用Mapper插件（[查看官方中文文档](https://mapperhelper.github.io/docs/)）
- MyBatis PageHelper分页插件（[查看官方中文文档](https://pagehelper.github.io/)）
- Druid Spring Boot Starter（[查看官方中文文档](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter/)）
- Fastjson（[查看官方中文文档](https://github.com/Alibaba/fastjson/wiki/%E9%A6%96%E9%A1%B5)）
- Hutool工具包（[查看官方文档](https://hutool.cn/docs/)）
- Swagger API管理（[查看文档](https://github.com/SpringForAll/spring-boot-starter-swagger)）
- 其他略

## 代码生成
- 可以使用funong_codehusky生成后copy到项目中
- 未来会做成maven工具
