package cn.cxh; /*
 ClassName:cn.cxh
 Description:
 User: myischenxiaohua@163.com
 Date: 2019-04-24
 Time: 8:52
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.cxh.dao")//扫描mybatis的接口所在的包
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
