package by.epam.jwd.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class User implements Serializable {
    private static final long serialVersionUID = 3439006601606329478L;

    private int id;
    private String login;
    private String password;
    private String email;
    private float progress;
    private int roleId;
    private List<Group> groups;
    private List<Test> tests;

    public User() {

    }

    public User(int id, String login, String password, String email, float progress, int roleId, List<Group> groups, List<Test> tests) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.progress = progress;
        this.roleId = roleId;
        this.groups = groups;
        this.tests = tests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Float.compare(user.progress, progress) == 0 &&
                roleId == user.roleId &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email) &&
                Objects.equals(groups, user.groups) &&
                Objects.equals(tests, user.tests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, email, progress, roleId, groups, tests);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", progress=" + progress +
                ", roleId=" + roleId +
                ", groups=" + groups +
                ", tests=" + tests +
                '}';
    }
}
