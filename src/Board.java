
public class Board
{
    public static char board[][] = new char[6][7];
    
    public static void printBoard()
    {
        System.out.println("-------------------------------------------");
        for(int i = 0; i < 6; i++){
                System.out.println("|  " + board[i][0] + "  |  " + board[i][1] + "  |  " + board[i][2] + "  |  " + board[i][3] + "  |  " + board[i][4] + "  |  " + board[i][5] + "  |  " + board[i][6] + "  |");
                System.out.println("-------------------------------------------");
            }
    }
    //  Reset Board
    public static void initBoard()
    {
        for(int i = 0; i < 6; i++)
            for (int j = 0; j < 7; j++)
                board[i][j] = ' ';
    }
    // Insert letter in the board
    public static void updateBoard(char sig, int row, int col)
    {
        board[row - 1][col - 1] = sig;
    }

    // Check if the place is free to insert letter
    public static boolean spaceIsFree(int row, int col) {
            return board[row - 1][col - 1] == ' ';
    }

    // check if the board is complet
        public static Boolean isBoardFull()
    {
        for(int i = 0; i < 6; i++)
            for(int j = 0; j < 7; j++)
                if(board[i][j] == ' ')
                    return false;
        return true;
    }
}
