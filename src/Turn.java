
public class Turn
{
    public static boolean isWinner(char letter) {
        // check if rows win "-"
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 5; j++)
                if (Board.board[i][j] == letter && Board.board[i][j + 1] == letter && Board.board[i][j + 2] == letter)
                    return true;

        // check if columns win "|"
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 4; j++)
                if (Board.board[j][i] == letter && Board.board[j + 1][i] == letter && Board.board[j + 2][i] == letter)
                    return true;

        // check if diagonal win "\"
        for (int j = 0; j < 5; j++)
            for (int i = 0; i < 4; i++)
                if (Board.board[i][j] == letter && Board.board[i + 1][j + 1] == letter && Board.board[i + 2][j + 2] == letter)
                    return true;
        // check if diagonal win "/"
        for (int j = 2; j < 7; j++)
            for (int i = 0; i < 4; i++)
                if (Board.board[i][j] == letter && Board.board[i + 1][j - 1] == letter && Board.board[i + 2][j - 2] == letter)
                    return true;
        return false;
    }
}
