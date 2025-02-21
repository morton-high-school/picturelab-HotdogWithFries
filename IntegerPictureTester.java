public class IntegerPictureTester
{
    public static void main(String[] args) 
    {
        int[][] CoolArray = new int[7][7];

        for (int i = 0; i < CoolArray.length; i++)
        {
            for (int j = 0; j < CoolArray[0].length; j++)
            {
                CoolArray[i][j] = i + j;
            }
        }


    }
}