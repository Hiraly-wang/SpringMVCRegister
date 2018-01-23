package online.shixun.project.entity;

import javax.validation.constraints.NotBlank;

public class DefaultUser extends SimpleUser{

    @NotBlank(message = "注册失败，请检查数据的有效性！")
    private String email;

    @NotBlank
    private String profession;

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    public DefaultUser(@NotBlank String email, @NotBlank String profession) {
        this.email = email;
        this.profession = profession;
    }

    public DefaultUser() {

    }

    @Override
    public String toString() {
        return "DefaultUser{" +
                "email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
