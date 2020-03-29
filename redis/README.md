# redis
> redis模块

# 目录
* [1 创建项目](#01)
* [2 启动redis](#02)
* [3 编写代码](#03)
* [4 redis管理session](#04)
* [5 redisson锁](#05)

## <div id="01"></div>
## 1 创建项目
> 右键->New->Module->Maven

## <div id="02"></div>
## 2 启动redis
    2.1、docker pull redis
    2.2、docker run -d -p 6379:6379 -v /F/data/docker/redis:/data redis --appendonly yes
    2.3、确认2.2挂载目录后执行，开启服务

## <div id="03"></div>
## 3 编写代码
    3.1、pom.xml文件引入依赖
    3.2、application.properties添加配置项
    3.3、编写配置类RedisConfig

## <div id="04"></div>
## 4 redis管理session
    4.1、pom.xml引入依赖
    4.2、application.properties配置cookie过期时间，默认值-1为“浏览会话结束时”过期

## <div id="05"></div>
## 5 redisson锁
    5.1、pom.xml引入依赖
    5.2、编写配置类RedisConfig