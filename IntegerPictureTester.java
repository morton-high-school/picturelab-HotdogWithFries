public class IntegerPictureTester
{
    public static void main(String[] args) 
    {
        IntegerPicture Picture = new IntegerPicture();

        System.out.println(Picture);

        Picture.mirrorVerticalRL();

        System.out.println(Picture);

        Picture.mirrorHorizontalBT();

        System.out.println(Picture);

        Picture.mirrorVerticalLR();

        System.out.println(Picture);

        Picture.mirrorHorizontalTB();

        System.out.println(Picture);

        Picture.mirrorDiagonal();

        System.out.println(Picture);
    }
}