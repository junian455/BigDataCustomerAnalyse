package hut.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import hut.pojo.UserAction;

import java.util.List;

/**
 * 映射接口，会将从数据库中的查询结果映射成对象,这只是一个测试而已。
 * @author : zhw
 * @Date: 2020/5/8
 * @Description: bigdatademo
 * @version: 1.0
 */
@Mapper
public interface TestAdminMapper {

    //@Select ( "select * from admin;" )
    //List<Admin> queryAll();


    /**
     * 测试返回用户行为的50条信息,如果内存足够可以跑完30万条
     * @return
     */
    @Select ( "select * from user_action limit 50;" )
    List<UserAction> queryAll();
}
