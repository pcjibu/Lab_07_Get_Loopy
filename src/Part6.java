public class Part6
{
    public static void main(String[] args)
    {
        for (int x = 5; x > 0; x-- ) //Row(x)
        {
            for (int y = 5; y > 0; y-- ) //Column(y)
            {
                if (x >= y)
                {
                    System.out.print("*");
                }
            }
            System.out.println(); //Terminates current line and places a new one
        }
    }
}
