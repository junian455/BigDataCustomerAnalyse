package hut.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 测试mybatis实体类
 * @author : zhw
 * @Date: 2020/5/8
 * @Description: bigdatademo
 * @version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private int id;
    private String username;
    private String password;
}
