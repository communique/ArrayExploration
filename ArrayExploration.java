import java.util.Random;
/**
 * ArrayExploration.java explores possibilities for DiceRoller class
 * in the CharacterGenerator project.
 * 
 */

public class ArrayExploration
{
    int [] array;
    int baseStat;
    int smallest;
   
    Random randomGenerator = new Random();

    public static void main(String [] args)
    {

    }

    public void baseStat()
    {
        arrayCreation();
        arraySmallest();
        arraySum();
        baseStat = arraySum() - arraySmallest();
    }

    public int randomCast()
    {
        int number;
        number = randomGenerator.nextInt(6) + 1;
        return number;
    }

    public void arrayCreation()
    {
        int i = 0;
        array = new int[4];

        for (i = 0; i < array.length; i++)
        {
            array[i] = randomCast();
        }
    }

    public int arraySum()
    {
        int i;
        int sum = 0;
        for (i = 0; i < array.length; i++)
            sum = sum + array[i];
        return sum;
    }

    public int arraySmallest()
    {
        if (array.length > 0)
        {
            smallest = array[0];
            for (int i = 1; i < array.length; i++)
                if(array[i] < smallest)
                    smallest = array[i];
        }
        return smallest;
    }
}