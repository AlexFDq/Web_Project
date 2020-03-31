package by.epam.jwd.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Test implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private int amount_of_questions;
    private String time;
    private int result;
    private int categoryId;
    private List<Question> questions;
    private List<User> users;

    public Test() {

    }

    public Test(int id, String name, int amount_of_questions, String time, int result, int categoryId, List<Question> questions, List<User> users) {
        this.id = id;
        this.name = name;
        this.amount_of_questions = amount_of_questions;
        this.time = time;
        this.result = result;
        this.categoryId = categoryId;
        this.questions = questions;
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

    public int getAmount_of_questions() {
        return amount_of_questions;
    }

    public void setAmount_of_questions(int amount_of_questions) {
        this.amount_of_questions = amount_of_questions;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
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
        Test test = (Test) o;
        return id == test.id &&
                amount_of_questions == test.amount_of_questions &&
                result == test.result &&
                categoryId == test.categoryId &&
                Objects.equals(name, test.name) &&
                Objects.equals(time, test.time) &&
                Objects.equals(questions, test.questions) &&
                Objects.equals(users, test.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, amount_of_questions, time, result, categoryId, questions, users);
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount_of_questions=" + amount_of_questions +
                ", time='" + time + '\'' +
                ", result=" + result +
                ", categoryId=" + categoryId +
                ", questions=" + questions +
                ", users=" + users +
                '}';
    }
}
