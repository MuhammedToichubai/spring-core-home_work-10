package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.config.MyConfig;
import peaksoft.models.Person;

import java.util.Scanner;

/**
 * @author Muhammed
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            commands();
            switch (scanner.nextInt()){
                case 1 -> applicationContextXmlFile();

                case 2 -> javaCodeAnnotation();

                default -> System.out.println("Do not select except \"1 or 2\"");
            }
        }
    }

    public static void applicationContextXmlFile(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Person person1 = context.getBean("personOne", Person.class);
        System.out.println(person1);

        Person person2 = context.getBean("personTwo", Person.class);
        System.out.println(person2);

        context.close();

    }

    public static void javaCodeAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person1 = context.getBean("personOne", Person.class);
        System.out.println(person1);
        person1.callYourFavoriteAnimal();

        Person person2 = context.getBean("personTwo", Person.class);
        System.out.println(person2);
        person2.callYourFavoriteAnimal();

        context.close();
    }

    public static void commands(){
        System.out.println("|>>>>>>>>>>>>Commands<<<<<<<<<<<<<<<|");
        System.out.println("+-----------------------------------+");
        System.out.println("|Press \"1\" works with xml file.     |");
        System.out.println("|___________________________________|");
        System.out.println("|Press \"2\" works with annotations.  |");
        System.out.println("|___________________________________|");

    }
}
