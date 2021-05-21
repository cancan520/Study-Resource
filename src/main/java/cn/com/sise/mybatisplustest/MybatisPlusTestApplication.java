package cn.com.sise.mybatisplustest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//扫描mapper文件夹
@MapperScan("cn.com.sise.mybatisplustest.mapper")
@SpringBootApplication
public class MybatisPlusTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusTestApplication.class, args);
    }

}
