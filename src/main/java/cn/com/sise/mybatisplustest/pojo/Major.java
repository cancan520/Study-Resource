package cn.com.sise.mybatisplustest.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_major")
public class Major {
    private int majorId;
    private String majorName;
    private int tuition;
    private int deptId;
}
