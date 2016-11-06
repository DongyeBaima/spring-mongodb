package demo1.data.dao.impl;


import com.mongodb.DB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

import demo1.data.dao.UserDao;
import demo1.data.model.UserEntity;

/**
 * 描述 :
 * 版权 : Copyright-(c) 2016
 * 公司 : Thinkive
 *
 * @author 王嵊俊
 * @version 2016-11-05 15:18
 */
@Service
public class UserDaoImpl implements UserDao {
    public static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    @Autowired
    private MongoTemplate mongoTemplate;


    public void _test() {
        Set<String> colls = mongoTemplate.getCollectionNames();
        for (String coll : colls) {
            logger.info("CollectionName=" + coll);
        }
        DB db = mongoTemplate.getDb();
        logger.info("db=-" + db.toString());
    }

    public void createCollection() {
        if (!mongoTemplate.collectionExists(UserEntity.class)) {
            this.mongoTemplate.createCollection(UserEntity.class);
        }
    }

    /**
     * 查找
     *
     * @param skip  跳过的个数
     * @param limit 查询记录个数
     */
    public List<UserEntity> findList(int skip, int limit) {
        Query query = new Query();
        query.with(new Sort(new Sort.Order(Sort.Direction.ASC, "_id")));
        query.skip(skip).limit(limit);
        return this.mongoTemplate.find(query, UserEntity.class);
    }

    public List<UserEntity> findListByAge(int age) {
        return null;
    }

    public UserEntity findOne(String id) {
        return null;
    }

    public UserEntity findOneByUsername(String username) {
        return null;
    }

    public void insert(UserEntity entity) {
        this.mongoTemplate.insert(entity);
    }

    public void insertAll(List<UserEntity> entities) {
        this.mongoTemplate.insertAll(entities);
    }

    public void update(UserEntity entity) {
        Query query = new Query();
        query.addCriteria(new Criteria("_id").is(entity.getId()));
        Update update = new Update();
        update.set("age", entity.getAge());
        update.set("password", entity.getPassword());
        update.set("regionName", entity.getRegionName());
        update.set("special", entity.getSpecial());
        update.set("works", entity.getWorks());
        update.set("name", entity.getName());
        this.mongoTemplate.updateFirst(query, update, UserEntity.class);
    }


    public void dropTable(UserEntity entity) {
        mongoTemplate.dropCollection(UserEntity.class);
    }

    public void remove(String id) {
        Query query = new Query();
        query.addCriteria(new Criteria("_id").is(id));
        this.mongoTemplate.remove(query, UserEntity.class);
    }
}
