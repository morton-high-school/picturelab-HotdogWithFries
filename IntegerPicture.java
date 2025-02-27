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

    public void mirrorVerticalRL()
    {
        for (int i = 0; i < IntegerPicture.length; i++)
        {
            for (int j = 0; j < IntegerPicture[0].length / 2 + 1; j++)
            {
                IntegerPicture[i][j] = IntegerPicture[i][IntegerPicture[i].length - j - 1];
            }
        }
    }

    public void mirrorHorizontalBT()
    {
        for (int i = 0; i < IntegerPicture.length / 2 + 1; i++)
        {
            for (int j = 0; j < IntegerPicture[0].length; j++)
            {
                IntegerPicture[i][j] = IntegerPicture[IntegerPicture.length - i - 1][j];
            }
        }
    }

    public void mirrorVerticalLR()
    {
        for (int i = 0; i < IntegerPicture.length; i++)
        {
            for (int j = 0; j < IntegerPicture[0].length / 2 + 1; j++)
            {
                IntegerPicture[i][IntegerPicture[i].length - j - 1] = IntegerPicture[i][j];
            }
        }
    }

    public void mirrorHorizontalTB()
    {
        for (int i = 0; i < IntegerPicture.length / 2 + 1; i++)
        {
            for (int j = 0; j < IntegerPicture[0].length; j++)
            {
                IntegerPicture[IntegerPicture.length - i - 1][j] = IntegerPicture[i][j];
            }
        }
    }

    public void mirrorDiagonal()
    {
        int resultLength = 0;

        if (IntegerPicture.length < IntegerPicture[0].length)
        {
            resultLength = IntegerPicture.length;
        } else {
            resultLength = IntegerPicture[0].length;
        }

        for (int i = 0; i < resultLength; i++)
      {
        for (int j = 0; j < resultLength; j++)
        {
          IntegerPicture[i][j] = IntegerPicture[j][i];
        }
      }  
    }

    public String toString() {
        String Result = "";
        for (int i = 0; i < IntegerPicture.length; i++)
        {
            for (int j = 0; j < IntegerPicture[0].length; j++)
            {
                Result += IntegerPicture[i][j] + " ";
            }
            Result += "\n";
        }
        return Result;
    }
}
