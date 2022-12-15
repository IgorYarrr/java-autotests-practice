package org.projectlombok;

import org.projectlombok.homework3.Dog;
import org.projectlombok.homework3.Owner;

public class App
{
    public static void main( String[] args )
    {
        Owner owner1 = new Owner("Сидоров Иван Петрович", "Ул. Пушкина, д.3, кв.45");
        Dog dog1 = new Dog("Собака1", 4, owner1);
        Dog dog2 = new Dog("Собака2", 5, owner1);
        System.out.println(dog1==dog2);
        /*Выдало false, т.к. при сравнении классовых данных еще сравнивается и
        * значение в памяти (но в целом еще и из-за разных данных, но тут это не главное) */
        System.out.println(dog1.equals(dog2)); //Логично, что выдало false, т.к. разные данные
//        dog1 = dog2;
//        System.out.println(dog1==dog2); // В такой вариации будет true,
//        т.к. мы полностью скопировали объект
        dog1.nickname=dog2.nickname;
        dog1.age=dog2.age;
        System.out.println(dog1==dog2);
        System.out.println(dog1.equals(dog2)); //Честно говоря хз почему false по итогу

        System.out.print("\n");
        String a = new String("Привет");
        String b = new String("Привет");
        System.out.println(a==b);
        //Здесь идет прямое сравнение объектов (и ссылок на объект в том числе) - false
        System.out.println(a.equals(b));
        //Здесь же сравниваются поля объектов, поэтому trueю
    }
}
