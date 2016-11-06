package demo1.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Arrays;
import java.util.Date;

/**
 * ���� : �û�ʵ����
 * ��Ȩ : Copyright-(c) 2016
 * ��˾ : Thinkive
 *
 * @author ���ӿ�
 * @version 2016-11-05 15:13
 */
@Document(collection = "user")
public class UserEntity {
    /**
     * ����
     */
    @Id
    private String id;
    /**
     * �������ݿ��ֶΣ��ֶ���Ϊ userName
     */
    @Field("userName")
    private NameEntity name;
    /**
     * �����ֶ�͸����age�������뵽���ݿ���
     */
    @Transient
    private int age;


    /**
     * �����ע�⣬Ĭ�ϴ������ݿ⣬���Ա�������Ϊ���ݿ��е��ֶ���
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
