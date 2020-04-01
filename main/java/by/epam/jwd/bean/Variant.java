package by.epam.jwd.bean;

import java.io.Serializable;
import java.util.Objects;

public class Variant implements Serializable {
    private static final long serialVersionUID = 4L;

    private int id;
    private String name;
    private boolean isCorrect;
    private int questionNumber;

    public Variant() {

    }

    public Variant(int id, String name, boolean isCorrect, int questionNumber) {
        this.id = id;
        this.name = name;
        this.isCorrect = isCorrect;
        this.questionNumber = questionNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int number) {
        this.id = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Variant variant = (Variant) o;
        return id == variant.id &&
                isCorrect == variant.isCorrect &&
                questionNumber == variant.questionNumber &&
                Objects.equals(name, variant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isCorrect, questionNumber);
    }

    @Override
    public String toString() {
        return "Variant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isCorrect=" + isCorrect +
                ", questionNumber=" + questionNumber +
                '}';
    }
}

