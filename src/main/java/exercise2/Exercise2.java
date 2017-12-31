package exercise2;

public class Exercise2 {

    static Person createPerson(int age){

        return new Person(age);

    }

    static int computePopulationSize(){

        return Person.computePopulationSize();

    }

    static float computeAveragePopulationAge(){

        return Person.computeAveragePopulationAge();

    }

    static void resetPopulation(){

        Person.resetPopulation();

    }

    /*public static void main(String[] args){

        Person p1,p2;
        int a;
        float b;

        p1=createPerson(20);
        p2=createPerson(21);

        a=computePopulationSize();
        System.out.println(a);
        b=computeAveragePopulationAge();
        System.out.println(b);

        resetPopulation();

        a=computePopulationSize();
        System.out.println(a);

    }*/

}
