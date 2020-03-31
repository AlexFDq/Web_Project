package by.epam.jwd.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Question implements Serializable {
    private static final long serialVersionUID = 5L;

    private int number;
    private String name;
    private int testId;
    private List<Variant> variants;

    public Question() {

    }

    public Question(int number, String name, int testId, List<Variant> variants) {
        this.number = number;
        this.name = name;
        this.testId = testId;
        this.variants = variants;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return number == question.number &&
                testId == question.testId &&
                Objects.equals(name, question.name) &&
                Objects.equals(variants, question.variants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, testId, variants);
    }

    @Override
    public String toString() {
        return "Question{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", testId=" + testId +
                ", variants=" + variants +
                '}';
    }
}
