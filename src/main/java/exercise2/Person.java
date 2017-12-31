package exercise2;

class Person {
	
	private int age;
    private static int populationSize=0, totalAge=0;
    private static float averagePopulationAge=0.0F;

    // ASTUCE sur IntelliJ : Après avoir défini les variables membres, utiliser le raccourci ALT+INSERT pour générer automatiquement constructeur, getters, setters ou toStrings !

    public Person(int age) {

        this.age = age;
        populationSize++;
        totalAge=totalAge+age;

    }

    static int computePopulationSize(){

        return populationSize;

    }

    static float computeAveragePopulationAge(){

        averagePopulationAge=(float)totalAge/populationSize; // Au moins une des deux variables "totalAge" ou "populationSize" doit être précédée de "(float)" sinon la réponse est arrondie !

        return averagePopulationAge;

    }

    static void resetPopulation(){

        populationSize=0;
        totalAge=0;
        averagePopulationAge=0;

    }
	
}
