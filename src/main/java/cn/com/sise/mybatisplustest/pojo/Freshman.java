package cn.com.sise.mybatisplustest.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_freshman")
public class Freshman {
    private String ticketnumber;
    private String idCard;
    private String name;
    private int sex;
    private int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String nation;
    private int politic;
    private int deptId;
    private String majorId;
    private int dormId;
    private int roleId;
    private int userId;
    private int classId;
    private int stuno;
    private int status;
    private Date registerTime;
}
