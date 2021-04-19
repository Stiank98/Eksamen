package exam;

public class HypercaloricDiet extends Diet{
     float MaxWeightKg;
     float minCaloriesPerDay;

     public HypercaloricDiet(int daysDuration, String purpose, Food[] allowedFood, float maxWeightKg, float minCaloriesPerDay) {
          super(daysDuration, purpose, allowedFood);
          MaxWeightKg = maxWeightKg;
          this.minCaloriesPerDay = minCaloriesPerDay;
     }
}
