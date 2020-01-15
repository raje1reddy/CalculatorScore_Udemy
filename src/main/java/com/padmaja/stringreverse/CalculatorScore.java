package com.padmaja.stringreverse;

import java.lang.String;
import java.util.Scanner;


public class CalculatorScore {

        public static int CalculatorScore() {

            boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;

            int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
            System.out.println("your final score was " + highScore);

            score = 1000;
            levelCompleted = 8;
            bonus = 200;

            int highScore1 = calculateScore(gameOver, score, levelCompleted, bonus);
            System.out.println("your final score was " + highScore);
/*
            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition(“Tim”, highScorePosition);
            int highScorePosition = calculateHighScorePosition(900);
            displayHighScorePosition(“one”, highScorePosition);
            int highScorePosition = calculateHighScorePosition(400);
            displayHighScorePosition(“Two”, highScorePosition);
            int highScorePosition = calculateHighScorePosition(50);
            displayHighScorePosition(“Three”, highScorePosition);
            int highScorePosition = calculateHighScorePosition(1000);
            displayHighScorePosition(“Tim”, highScorePosition);
            int highScorePosition = calculateHighScorePosition(500);
            displayHighScorePosition(“Tim”, highScorePosition);

            int highScorePosition = calculateHighScorePosition(100);
            displayHighScorePosition(“five”, highScorePosition);

*/
            return score;
        }


        public static void displayHighScorePosition(String playerName, int highScorePosition) {
            System.out.println(playerName + "managed to get into position"
                    + highScorePosition + "on the high score table");
        }

        public static int calculateHighScorePosition(int playerScore) {

            if (playerScore > 1000) {
                return 1;
            } else if (playerScore > 500 && playerScore < 1000) {
                return 2;
            } else if (playerScore > 100 && playerScore < 500) {
                return 3;
            } else {
                return 4;
            }
        }


        public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                return finalScore;
            }

            return -1;

        }
        //return 0;
    }


/*
}



public class Main {

	public static void main(String[] args){

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
                       System.out.println(“your final score was “ + highScore);

		score = 1000;
		levelCompleted = 8;
		bonus = 200;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
                       System.out.println(“your final score was “ + highScore);

		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition(“Tim”, highScorePosition);
		int highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition(“one”, highScorePosition);
                        int highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition(“Two”, highScorePosition);
                        int highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition(“Three”, highScorePosition);
int highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition(“Tim”, highScorePosition);
int highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition(“Tim”, highScorePosition);

		int highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition(“five”, highScorePosition);


}


public static  void displayHighScorePosition(String playerName, int highScorePosition){
	System.out.println(playerName + “ managed to get into position “
+ highScorePosition + “ on the high score table”);
}

public static int calculateHighScorePosition(int playerScore) {

	if(playerScore > 1000) {
		return 1;
} else if(playerScore > 500 && playerScore < 1000) {
	return 2;
}else if(playerScore > 100 && playerScore < 500) {
	return 3;
}else{
	return 4;
}
}





public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus) {

if(gmaeOver) {
	int finalScore = score + (levelCompleted * bonus);
	 finalScore += 2000;
	  return finalScore;
}

return -1;

}

}

       /* if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line

            System.out.println("Enter your name");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + "years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
            return name;

        }else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
        return null;
    }
}*/