package peaksoft.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.models.Donkey;
import peaksoft.models.Horse;
import peaksoft.models.Person;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class MyConfig {

    @Bean(name = "horse")
    public Horse getHorse(){
        Horse horse = new Horse("Arabian Horse", "black", 4);
        return horse;
    }

    @Bean(name = "donkey")
    public Donkey getDonkey(){
        Donkey donkey = new Donkey("Mammoth donkey", "write", 7);
        return donkey;
    }

    @Bean(name = "personOne")
    public Person getPerson(){
        Person person = new Person();
        person.setName("Muhammed");
        person.setAge(25);
        person.setFavoriteAnimal(getDonkey());
        return person;
    }

    @Bean(name = "personTwo")
    public Person getPerson_(){

        Person person = new Person("Berdibek", 26, getHorse());

        return person;

    }

}
