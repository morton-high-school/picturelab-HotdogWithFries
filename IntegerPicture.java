public class IntegerPicture {
    private int[][] IntegerPicture = new int[7][7];

    IntegerPicture()
    {
        for (int i = 0; i < IntegerPicture.length; i++)
        {
            for (int j = 0; j < IntegerPicture[0].length; j++)
            {
                IntegerPicture[i][j] = i + j;
            }
        }
    }

    public int[][] mirrorVertical()
    {
        int[][] Result = new int[7][7];
    }

    public int[][] mirrorHorizontal()
    {
        int[][] Result = new int[7][7];
    }

    public int[][] mirrorDiagonal()
    {
        int[][] Result = new int[7][7];
    }

    public String toString() {
        String Result = "";
        for (int i = 0; i < IntegerPicture.length; i++)
        {
            for (int j = 0; j < IntegerPicture[0].length; j++)
            {
                Result += IntegerPicture[i][j] + " ";
            }
            Result += "\e";
        }
        return Result;
    }
}
