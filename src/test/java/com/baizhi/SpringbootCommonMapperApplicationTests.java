package com.baizhi;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonMapperApplicationTests {
    @Autowired
    UserDao userDao;
    @Test
    public void Test(){
        User user=new User();
        user.setId(1);
        User user1 = userDao.selectByPrimaryKey(1);
        System.out.println(user1);
    }
}
