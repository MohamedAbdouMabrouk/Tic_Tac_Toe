

public class Bored
{
    public static char bored[][] = new char[6][7];
    public static void printBored()
    {
        System.out.println("-------------------------------------------");
        for(int i = 0; i < 6; i++){
                System.out.println("|  " + bored[i][0] + "  |  " + bored[i][1] + "  |  " + bored[i][2] + "  |  " + bored[i][3] + "  |  " + bored[i][4] + "  |  " + bored[i][5] + "  |  " + bored[i][6] + "  |");
                System.out.println("-------------------------------------------");
            }
    }
    public static void initBored()
    {
        for(int i = 0; i < 6; i++)
            for (int j = 0; j < 7; j++)
                bored[i][j] = ' ';
    }
    public static void updateBorad(char sig, int row, int col)
    {
        bored[row - 1][col - 1] = sig;
    }
    public static boolean spaceIsFree(int row, int col) {
            return bored[row - 1][col - 1] == ' ';
    }
        public static Boolean isBoredFull()
    {
        for(int i = 0; i < 6; i++)
            for(int j = 0; j < 7; j++)
                if(bored[i][j] == ' ')
                    return false;
        return true;
    }
}
