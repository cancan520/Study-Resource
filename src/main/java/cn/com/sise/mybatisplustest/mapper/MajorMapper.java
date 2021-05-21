package cn.com.sise.mybatisplustest.mapper;

import cn.com.sise.mybatisplustest.pojo.Major;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

//在对应的Mapper上继承基本的类BaseMapper
@Repository //表示持久层
public interface MajorMapper extends BaseMapper<Major> {

}
