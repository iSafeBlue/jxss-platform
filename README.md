# jxss-platform
java版xss平台


简介
------
该项目由Spring + SpringMVC + Mybatis 框架开发<br/>
用于XSS漏洞测试，目前版本仅有简单的获取cookie功能。<br/>

搭建方式
------
下载后可以直接导入myeclipse或放在apache tomcat内。<br/>
修改config/db.properties内的数据库配置信息，再将xss.sql导入mysql数据库<br/>
启动tomcat并访问项目路径<br/>
http://host/Admin/Login.x<br/>
为后台登陆地址，默认账号密码：admin 123456，位于`xss_admin`表。<br/>
至此搭建成功。<br/>

