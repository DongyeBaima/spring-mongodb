package demo1.data.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import demo1.data.model.UserEntity;

/**
 * Created by SHENG on 2016/11/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mongodb.xml")
public class UserDaoImplTest {

    @Autowired
    private UserDaoImpl userDao;

    @Test
    public void _test() throws Exception {
        userDao._test();
    }

    @Test
    public void createCollection() throws Exception {
        userDao.createCollection();
    }

    @org.junit.Test
    public void findList() throws Exception {
        for (UserEntity user : userDao.findList(5, 12)) {
            System.out.println(user);
        }
    }

    @org.junit.Test
    public void findListByAge() throws Exception {

    }

    @org.junit.Test
    public void findOne() throws Exception {

    }

    @org.junit.Test
    public void findOneByUsername() throws Exception {

    }

    @org.junit.Test
    public void insert() throws Exception {
        UserEntity entity1 = new UserEntity();
        entity1.setId("5");
        entity1.setAge(1);
        entity1.setBirth(new Date());
        entity1.setPassword("asdfasdf");
        entity1.setRegionName("北京");
        entity1.setWorks(1);

        userDao.insert(entity1);
    }

    @Test
    public void insertAll() throws Exception {
        List<UserEntity> list = new ArrayList<UserEntity>();
        for (int i = 6; i < 16; i++) {
            UserEntity entity1 = new UserEntity();
            list.add(entity1);
            entity1.setId(i + "");
            entity1.setAge(1);
            entity1.setBirth(new Date());
            entity1.setPassword("asdfasdf");
            entity1.setRegionName("北京");
            entity1.setWorks(1);
        }
        userDao.insertAll(list);
    }

    @org.junit.Test
    public void update() throws Exception {
        UserEntity entity1 = new UserEntity();
        entity1.setId("5");
        entity1.setAge(1);
        entity1.setBirth(new Date());
        entity1.setPassword("asdfasdf");
        entity1.setRegionName("上海");
        entity1.setWorks(1);
        userDao.update(entity1);
    }

    @Test
    public void drop() {
        userDao.dropTable(null);
    }

    @Test
    public void remove() {
        userDao.remove("6");
    }

}