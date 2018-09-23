package com.sinners.sin;

public class Sin {
    protected Integer weight;
    protected String message;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    protected Sin() {}

    public Sin(Integer weight) {
        this.weight = weight;
    }

    protected Sin(Integer weight, String message) {
        this.weight = weight;
        this.message = message;
    }
}
