package demo1.data.dao;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import demo1.data.model.UserEntity;

/**
 * ���� : �û�Dao��
 * ��Ȩ : Copyright-(c) 2016
 * ��˾ : Thinkive
 *
 * @author ���ӿ�
 * @version 2016-11-05 15:16
 */
@Transactional
public interface UserDao {
    void _test();

    void createCollection();

    void insertAll(List<UserEntity> entities);

    List<UserEntity> findList(int skip, int limit);

    List<UserEntity> findListByAge(int age);

    UserEntity findOne(String id);

    UserEntity findOneByUsername(String username);

    void insert(UserEntity entity);

    void update(UserEntity entity);

}
