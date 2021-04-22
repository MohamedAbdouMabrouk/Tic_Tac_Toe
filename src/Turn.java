import sun.security.pkcs11.P11Util;

import javax.swing.*;

public class Turn
{
    private static int toggle = 1;
    public static boolean isWinner(char letter)
    {
        // check if rows win
        for(int i = 0; i < 6; i++)
            for (int j = 0; j < 5; j++)
                    if(Bored.bored[i][j] == letter && Bored.bored[i][j + 1] == letter && Bored.bored[i][j + 2] == letter)
                        return true;

        // check if cols win
        for(int i = 0; i < 7; i++)
            for (int j = 0; j < 4; j++)
                    if(Bored.bored[j][i] == letter && Bored.bored[j + 1][i] == letter && Bored.bored[j + 2][i] == letter)
                        return true;

        // check if diagonal win
        for(int j = 0; j < 5; j++)
            for(int i = 0; i < 4; i++)
                if(Bored.bored[i][j] == letter && Bored.bored[i  + 1][j + 1] == letter && Bored.bored[i + 2][j + 2] == letter)
                   return true;
        for(int j = 2; j < 7; j++)
            for(int i = 0; i < 4; i++)
                if(Bored.bored[i][j] == letter && Bored.bored[i  + 1][j - 1] == letter && Bored.bored[i + 2][j - 2] == letter)
                    return true;
        return false;
    }
    public static int turnToggle() {
        toggle ^= 1;
        return toggle;
    }

}
