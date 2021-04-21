package exam;

public class Food {
     String name;
     float caloriesPer100g;
     boolean IsVegan;
     FoodType type;

     public Food(String name, float caloriesPer100g, boolean isVegan, FoodType type) {
          this.name = name;
          this.caloriesPer100g = caloriesPer100g;
          IsVegan = isVegan;
          this.type = type;
     }
}
