public abstract class Diet {
    int daysDuration;
    String purpose;
    Food[] allowedFood;
    boolean IsVegan;







    public String writeDuration(){
        return "this is duration" + daysDuration;
    }


    public String writeAllowedFood(){
        String Foods = "";

        for(int i = 0;i<allowedFood.length;i++){
            Foods += allowedFood[i].name+",";



        }



        return Foods;
    }

}





