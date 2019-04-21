# MAIN
A repository contains all the files for our project, including the revision history. 

# TARGET
Our target is to build a platform for people working together, so that they can create a workflow for their team work on the platform. A workflow consists of many parts, each of which is assigned to a specific person. Different parts are isolate but connected, which means that everyone can only charge for his own part but all parts will be finished in order.

**new add**
i add my name here. Simon

# 基本情况
## 一些讨论点
代码现在实现了最基本的登陆注册，没有实现完全的前后端分离，需要讨论是否彻底分离前后端。
pros & cons
* 分离前后端，前端可以专注前端工作，不需要了解后端基本架构，而且不需要在本地部署，与后端交互即可（如果前端不闲累个人倾向于这种开发方式）
* 不分离，前端不需要控制路由逻辑，而且（可能，我也不太清楚）会有一些行为后端能给予更多帮助

## 部署设置
我push到repo到代码已经可以在我的本地跑起来，下面写一下基本的环境和部署步骤。

### 环境及版本

* 数据库我用的是mysql Ver 8.0.15(数据库版本最好统一因为与数据库连接的驱动用的是最新版本)

* 我用的Java版本为10.0.2（个人认为使用java版本影响应该不会太大，所以直接使用最新版的jdk应该也没有问题）

* 开发软件是IntelliJ IDEA，需要使用Ultimate，因为Community没法开发web项目

* tomcat我也使用最新版本

### 数据库设置
数据库需要将新建一个user
username: springTest1
password: mysql123456
如果不想新建的话可以在 MAIN-1/config/db.properties 中修改

此外需要运行mysqlInit.sql中的sql语句配置数据库、schema和插入数据

### 本地部署
* 将项目在IDEA中import
* 可能需要重新配置tomcat路径和lib
* 其他配置（应该）不需要
