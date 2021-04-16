public class Test {

    public static void main(String[]args){

        Food M1 = new Food();

        M1.name = "Pizza";
        M1.caloriesPer100g = 250;
        M1.type = FoodType.Fat;
        M1.IsVegan = false;

        Food M2 = new Food();

        M2.name = "Lasagne";
        M2.caloriesPer100g = 250;
        M2.type = FoodType.Carb;
        M2.IsVegan = false;

        Food M3 = new Food();

        M3.name = "Kyllingsalat";
        M3.caloriesPer100g = 432;
        M3.type = FoodType.Protein;
        M3.IsVegan = false;

        Food M4 = new Food();

        M4.name = "Salat";
        M4.caloriesPer100g = 100;
        M4.type = FoodType.Protein;
        M4.IsVegan = true;


        FlexiarianDiet FlexiDiet = new FlexiarianDiet();


        LowCarbDiet LowCarb = new LowCarbDiet();

        LowCarb.minWeightKg = 2;
        LowCarb.daysDuration = 10;
        LowCarb.purpose ="Folk som vil gå ned i kg";

        Food[] tabell ={M2,M3,M4};

        LowCarb.allowedFood = tabell;
        LowCarb.IsVegan = false;

        System.out.println(LowCarb.writeDuration());
        System.out.println(LowCarb.writeAllowedFood());



        Person person1 = new Person();

        Food[] allergies={M1};


        person1.allergies = allergies;
        person1.diet = LowCarb;
        person1.weight = 75;

        DietManager DM =  new DietManager();






System.out.println(DM.areCompatible(person1,LowCarb));

    }









}
