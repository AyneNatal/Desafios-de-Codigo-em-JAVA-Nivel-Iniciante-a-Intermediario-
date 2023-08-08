package desafios.codewars;

/*
    -> DESAFIO CODEWARS: The Office II - Boredom Score
    -> Link para o desafio no site: https://www.codewars.com/kata/57ed4cef7b45ef8774000014/train/java
*/


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Codewars36 {
    // Testando:
    public static void main(String[] args) {
        System.out.println(boredom(new Person[]{
                new Person("tim", "IS"),
                new Person("jim", "finance"),
                new Person("randy", "pissing about"),
                new Person("sandy", "cleaning"),
                new Person("andy", "cleaning"),
                new Person("katie", "cleaning"),
                new Person("laura", "pissing about"),
                new Person("saajid", "regulation"),
                new Person("alex", "regulation"),
                new Person("john", "accounts"),
                new Person("mr", "canteen")
        }));  // out: i can handle this
    }

    // método do desafio:
    public static String boredom(Person[] staff) {
        Map<String, Integer> departmentScore = new HashMap<>(){
            {
                put("accounts", 1);
                put("finance", 2);
                put("canteen", 10);
                put("regulation", 3);
                put("trading", 6);
                put("change", 6);
                put("IS", 8);
                put("retail", 5);
                put("cleaning", 4);
                put("pissing about", 25);
            }
        };

        int sumResult = Arrays.stream(staff).mapToInt(i -> departmentScore.get(i.department)).sum();

        if(sumResult <= 80) {
            return "kill me now";
        } else if(sumResult < 100) {
            return "i can handle this";
        } else {
            return "party time!!";
        }
    }
}

// Classe Person do Desafio:
class Person {
    public final String name;
    public final String department;

    public Person(String name, String department) {
        this.name = name;
        this.department = department;
    }
}
