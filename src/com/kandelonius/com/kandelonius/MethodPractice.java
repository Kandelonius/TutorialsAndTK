package com.kandelonius;

public class MethodPractice
{
    public static void main(String[] args)
    {
        int highScore = calculateScore(true,
            800,
            5,
            100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true,
            10000,
            8,
            200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Richmond",
            calculateHighScorePosition(400));
        displayHighScorePosition("Jen",
            calculateHighScorePosition(900));
        displayHighScorePosition("Moss",
            calculateHighScorePosition(1500));
        displayHighScorePosition("Roy",
            calculateHighScorePosition(50));
    }

    public static int calculateScore(
        boolean gameOver,
        int score,
        int levelCompleted,
        int bonus)
    {
        int finalScore;
        if (gameOver)
        {
            finalScore = score + (levelCompleted * bonus);
            //            System.out.println("Your final score was "+finalScore);
            return finalScore;
        } else
        {
            return -1;
        }
    }

    public static void displayHighScorePosition(
        String pName,
        int rankPos)
    {
        System.out.println(pName + " managed to get into position " + rankPos + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score)
    {
        //        if (score >= 1000)
        //        {
        //            return 1;
        //        } else if (score >= 500)
        //        {
        //            return 2;
        //        } else if (score >= 100)
        //        {
        //            return 3;
        //        }
        //        return 4;
        int position = 4; // this solution is neat but I think it uses more processing power than the above
        // 4 return  method.
        if (score >= 1000)
        {
            position = 1;
        } else if (score >= 500)
        {
            position = 2;
        } else if (score >= 100)
        {
            position = 3;
        }
        return position;
    }
}
