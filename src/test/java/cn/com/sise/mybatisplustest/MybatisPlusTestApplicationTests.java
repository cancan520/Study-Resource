package cn.com.sise.mybatisplustest;

import cn.com.sise.mybatisplustest.mapper.FreshmanMapper;
import cn.com.sise.mybatisplustest.pojo.Freshman;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusTestApplicationTests {

    @Autowired
    private FreshmanMapper freshmanMapper;

    @Test
    void contextLoads() {
        //参数是一个Wrapper,条件构造器，这里不用，写null
        List<Freshman> freshmans= freshmanMapper.selectList(null);
        freshmans.forEach(System.out::println);
    }

}
