package peaksoft.models;

import org.springframework.stereotype.Component;

@Component
public class Donkey implements Animal {

    private String breed;

    private String color;

    private int age;

    public Donkey() {
    }

    public Donkey(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println("AnimalPlus - Hardworking");

    }

    @Override
    public void animalMinus() {
        System.out.println("AnimalMinus - Voice is not nice");

    }

    @Override
    public String toString() {
        return "Donkey{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
