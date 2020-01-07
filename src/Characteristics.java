import java.util.Scanner;

public class Characteristics
{
    private String description;
    private int rating;
    private boolean isTrue;

    public Characteristics(String newCharacteristics, int initalRating)
    {
        description = newCharacteristics;
        rating = 0;
    }

    private boolean isValid(int aRating)
    {
        if((aRating <1)||(aRating >10))
        {
            System.out.println("Wrong parameter enter for rating");
            isTrue = false;

        }
        else
        {
            rating = aRating;
            isTrue = true;
        }
        return  isTrue;
    }

   public void setRating(int aRating)
   {
       if((aRating <1)||(aRating >10))
       {
           System.out.println("Wrong parameter enter for rating");
       }
       else
       {
           rating = aRating;
       }

   }
   public void setRating()
   {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("please enter the rating");
       rating = keyboard.nextInt();
       System.out.println("Rating entered by the user is: "+ rating);
       System.out.println("This rating is correct");

   }
}
