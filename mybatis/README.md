# mybatis
> mybatis模块

# 目录
* [1 启动数据库](#01)
* [2 编写代码](#02)

## <div id="01"></div>
## 1 启动数据库
    1.1、docker pull mysql
    1.2、docker run -d -p 3306:3306 -v /F/data/docker/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 mysql
    1.3、确认2.2挂载目录后执行，开启服务
    1.4、数据库增加zglu库
    1.5、zglu库增加user表

## <div id="02"></div>
## 2 编写代码
    2.1、pom.xml文件引入依赖
    2.2、application.properties添加配置项
    2.3、编写实体类User
    2.4、编写mapper类UserMapper
    2.5、编写dao类UserDao
    2.6、编写README.md，描述开发或使用流程
    2.7、引用此模块的Application需指定要扫描的mapper包