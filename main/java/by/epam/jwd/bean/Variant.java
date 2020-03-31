package by.epam.jwd.bean;

import java.io.Serializable;
import java.util.Objects;

public class Variant implements Serializable {
    private static final long serialVersionUID = 1L;

    private int number;
    private String name;
    private boolean isCorrect;
    private int questionNumber;

    public Variant() {

    }

    public Variant(int number, String name, boolean isCorrect, int questionNumber) {
        this.number = number;
        this.name = name;
        this.isCorrect = isCorrect;
        this.questionNumber = questionNumber;
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
        return number == variant.number &&
                isCorrect == variant.isCorrect &&
                questionNumber == variant.questionNumber &&
                Objects.equals(name, variant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, isCorrect, questionNumber);
    }

    @Override
    public String toString() {
        return "Variant{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", isCorrect=" + isCorrect +
                ", questionNumber=" + questionNumber +
                '}';
    }
}

