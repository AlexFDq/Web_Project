package by.epam.jwd.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private int amount_of_tests;
    private List<Test> tests;

    public Category(int id, String name, int amount_of_tests, List<Test> tests) {
        this.id = id;
        this.name = name;
        this.amount_of_tests = amount_of_tests;
        this.tests = tests;
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

    public int getAmount_of_tests() {
        return amount_of_tests;
    }

    public void setAmount_of_tests(int amount_of_tests) {
        this.amount_of_tests = amount_of_tests;
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
        Category category = (Category) o;
        return id == category.id &&
                amount_of_tests == category.amount_of_tests &&
                Objects.equals(name, category.name) &&
                Objects.equals(tests, category.tests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, amount_of_tests, tests);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount_of_tests=" + amount_of_tests +
                ", tests=" + tests +
                '}';
    }
}
