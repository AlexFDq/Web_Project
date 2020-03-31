package by.epam.jwd.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Group implements Serializable {
    private static final long serialVersionUID = 2L;

    private int id;
    private String name;
    private int amount_of_users;
    private List<User> users;

    public Group() {

    }

    public Group(int id, String name, int amount_of_users, List<User> users) {
        this.id = id;
        this.name = name;
        this.amount_of_users = amount_of_users;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount_of_users() {
        return amount_of_users;
    }

    public void setAmount_of_users(int amount_of_users) {
        this.amount_of_users = amount_of_users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id &&
                amount_of_users == group.amount_of_users &&
                Objects.equals(name, group.name) &&
                Objects.equals(users, group.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, amount_of_users, users);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount_of_users=" + amount_of_users +
                ", users=" + users +
                '}';
    }
}
