/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author thetkhine
 */
enum Gender
{
    MALE,FEMALE
}

public class MapDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Aung Aung");
        names.add("Mg Mg");
        names.add("Kyaw Thu");
        
        Stream<String> uppercaseName = names.stream()
                                        .map(str->str.toUpperCase());
        uppercaseName.forEach(s->System.out.println(s+" "));
        
         ArrayList<Human> humans = new ArrayList<>();
         
         humans.add(new Human("Aung Aung",33,Gender.MALE));
         humans.add(new Human("Mg Mg",40,Gender.MALE));
         humans.add(new Human("Kyaw Thu",50,Gender.MALE));
         humans.add(new Human("Daw Tin",42,Gender.FEMALE));
         
         
         Predicate<Human> overForty = (h)-> h.age>=40;
         Predicate<Human> isMale = (h)-> h.gender == Gender.MALE;
         Function<Human,String> mapToU = h-> "U "+h.name;
         BinaryOperator<Human> youngest = (a,b)-> a.age < b.age?a : b;
         Optional<Human> results = humans.stream()
                                        .filter(isMale)
                                        .filter(overForty)
                                        .reduce(youngest);
                                        //.map(mapToU);
         System.out.println("Process");
         System.out.println("Yongest "+ results.get());
    }
}
