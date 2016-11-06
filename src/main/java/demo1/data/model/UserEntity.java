package demo1.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;
import java.util.Date;

/**
 * 描述 : 用户实体类
 * 版权 : Copyright-(c) 2016
 * 公司 : Thinkive
 *
 * @author 王嵊俊
 * @version 2016-11-05 15:13
 */
@Document(collection = "user")
public class UserEntity {
    /**
     * 主键
     */
    @Id
    private String id;
    /**
     * 存入数据库字段：字段名为 userName
     */
    @Field("userName")
    private NameEntity name;
    /**
     * 设置字段透明，age将不存入到数据库中
     */
    @Transient
    private int age;


    /**
     * 不添加注解，默认存入数据库，并以变量名作为数据库中的字段名
     */
    private int works;
    private Date birth;
    private String password;
    private String regionName;
    private String[] special;

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", age=" + age +
                ", works=" + works +
                ", birth=" + birth +
                ", password='" + password + '\'' +
                ", regionName='" + regionName + '\'' +
                ", special=" + Arrays.toString(special) +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NameEntity getName() {
        return name;
    }

    public void setName(NameEntity name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorks() {
        return works;
    }

    public void setWorks(int works) {
        this.works = works;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String[] getSpecial() {
        return special;
    }

    public void setSpecial(String[] special) {
        this.special = special;
    }
}
