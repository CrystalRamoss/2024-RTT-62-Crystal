package org.example.GLAB_303_9_1;

public class HumanBeing {

    private float weight;
    private float height;
    private float bmi;

    public HumanBeing(){

    }

    public HumanBeing(float weight, float height, float bmi){
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        this.bmi = bmi;
    }
}
