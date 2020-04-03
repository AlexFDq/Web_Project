package by.epam.jwd.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Question implements Serializable {
    private static final long serialVersionUID = 379348644252443585L;

    private int id;
    private String name;
    private int testId;
    private List<Variant> variants;

    public Question() {

    }

    public Question(int id, String name, int testId, List<Variant> variants) {
        this.id = id;
        this.name = name;
        this.testId = testId;
        this.variants = variants;
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
        return id == question.id &&
                testId == question.testId &&
                Objects.equals(name, question.name) &&
                Objects.equals(variants, question.variants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, testId, variants);
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", testId=" + testId +
                ", variants=" + variants +
                '}';
    }
}
