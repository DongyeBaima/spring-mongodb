package demo1.data.model;

/**
 * ���� : ����ʵ����
 * ��Ȩ : Copyright-(c) 2016
 * ��˾ : Thinkive
 *
 * @author ���ӿ�
 * @version 2016-11-05 15:14
 */
public class NameEntity {
    private String username;

    private String nickname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "NameEntity{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
