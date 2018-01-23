package online.shixun.project.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SimpleUser {

    @NotBlank(message = "注册失败，请检查数据的有效性！")
    @Size(min = 2,max = 8)
    private String name;

    @NotBlank
    private String passWord;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public SimpleUser(@NotBlank @Size(min = 2, max = 8) String name, @NotBlank String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public SimpleUser() {

    }
}
