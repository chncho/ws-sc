一个基于WS-Security标准的安全验证(CXF回调函数使用)
================================

生成Client端接口
-------------------------------
interface com.service.client.WebServiceSample需要使用CXF提供的wsdl2java工具来生成命令如下：
<pre>
wsdl2java -client -p com.service.client http://localhost:8080/services/WebServiceSample?wsdl
</pre>

生成的类
<pre>
└─service
    └─client
      └─ObjectFactory.java
        package-info.java
        Say.java
        SayResponse.java
        WebServiceSample.java
        WebServiceSampleImplService.java
        WebServiceSample_WebServiceSampleImplPort_Client.java
</pre>
删除掉多余的部分，只留下WebServiceSample.java，并把该文件中多余的annotation去掉。