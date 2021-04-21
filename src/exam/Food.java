package exam;

public class Food {
     String name;
     float caloriesPer100g;
     boolean isVegan;
     FoodType type;

     public Food(String name, float caloriesPer100g, boolean isVegan, FoodType type) {
          this.name = name;
          this.caloriesPer100g = caloriesPer100g;
          this.isVegan = isVegan;
          this.type = type;
     }
}
