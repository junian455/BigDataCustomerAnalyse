package hut;

import hut.dao.TestAdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import hut.pojo.UserAction;

import java.util.List;

@SpringBootTest
class BigdatademoApplicationTests {



    @Autowired
    TestAdminMapper testAdminMapper;


    /**
     * mybatis查询数据库
     *
     * Admin(id=1, username=john, password=8888)
     * Admin(id=2, username=lyt, password=6666)
     * Admin(id=3, username=aaa, password=123)
     * Admin(id=4, username=bbb, password=123)
     */
    @Test
    void setTestAdminMapper () {
        List <UserAction> userActions = testAdminMapper.queryAll ( );
        for (UserAction userAction : userActions) {
            System.out.println ( userAction );
        }
    }


}
