package peaksoft.models;

public class Person {

    private String name;

    private int age;

    private Animal favoriteAnimal;

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.favoriteAnimal = animal;
    }

    public Person() {
    }
    public Person( Donkey animal, Horse animal1) {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public void setFavoriteAnimal(Animal favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }

    public  void callYourFavoriteAnimal(){
        favoriteAnimal.animalPlus();
        favoriteAnimal.animalMinus();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favoriteAnimal=" + favoriteAnimal +
                '}';
    }
}
