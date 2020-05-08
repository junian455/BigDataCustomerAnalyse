package hut.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : zhw
 * @Date: 2020/5/8
 * @Description: bigdatademo
 * @version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAction {


    private String id;
    private String uid;
    private String itemID;
    private String behaviorType;
    private String itemCategory;
    private String visitDate;
    private String province;

}
