package exam;

public abstract class Diet {
    int daysDuration;
    String purpose;
    Food[] allowedFood; // requirement 1B
    boolean IsVegan = true; // requirement 1A og 1B If a diet contains any non-vegan food, it is considered not vegan (i.e., isVegan = false)

    // 1 B er for loop If a diet contains only vegan food, it is considered vegan, even if it is not a
    //VeganDiet (e.g., it could be a LowCarbDiet).
    //1C
    public boolean checkIsVegan(Food[] allowedFood){
         for(int i = 0;i<allowedFood.length; i++){
             if (!allowedFood[i].isVegan){
                 return false;
             }
         }
         return true;
    }

    public Diet(int daysDuration,String purpose,Food[] allowedFood){
        this.daysDuration = daysDuration;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.IsVegan = checkIsVegan(allowedFood);
    }

    //3A
    public String writeDuration(){
        String dietType = this.getClass().toString();
        //fjerne "class exam." i strengen
        dietType = dietType.substring(11);
        if(daysDuration >= 365) {
            return "This " + dietType + " lasts for " + daysDuration/365 + " years, " + (daysDuration%365)/31 + " month and " + ((daysDuration%365)%31) +" days";
        }
        if(daysDuration >= 31) {
            return "This "+ dietType + " lasts for " + daysDuration/31 + " months and " + daysDuration%31 + " days";
        }
        return "This "+ dietType + " lasts for " + daysDuration + " days";
    }

    //3B
    public String writeAllowedFood(){
        String dietType = this.getClass().toString();
        //fjerne "class " i strengen
        dietType = dietType.substring(11);
        String Foods = "The following food is allowed in this " + dietType + ": ";

        for(int i = 0;i<allowedFood.length;i++){
            Foods += allowedFood[i].name+",";
        }
        return Foods;
    }

}





