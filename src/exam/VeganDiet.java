package exam;

import java.lang.Exception;

public class VeganDiet extends Diet {
     float minWeightKg;

     public VeganDiet(int daysDuration, String purpose, Food[] allowedFood, float minWeightKg) throws Exception { //1C exeption
          super(daysDuration, purpose, allowedFood);
          this.minWeightKg = minWeightKg;
          // Oppgave 1C A VeganDiet cannot contain non-vegan food.
          if(!IsVegan) throw new Exception("This aint vegan");
     }
}
