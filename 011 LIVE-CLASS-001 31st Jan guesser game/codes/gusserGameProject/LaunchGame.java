package gusserGameProject;

import java.util.*;

class Guesser {

  int guessNum;

  int guessingNumber() {
    System.out.print("Guesser! Kindly guess s number between 0 to 100 : ");
    Scanner sc = new Scanner(System.in);
    guessNum = sc.nextInt();
    if(guessNum >100 ){
        System.out.println("Number is greater than 100 I");
    }
    return guessNum;
  }
}

class Player {

  int guessNum;

  int guessingNumber() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Player Kindly guess the number : ");
    guessNum = sc.nextInt();
    return guessNum;
  }
}

class Umpaier {

  int numFormGuesser;
  int numFormPlayer1;
  int numFormPlayer2;
  int numFormPlayer3;

  void collectNumberFormGuesser() {
    Guesser g = new Guesser();
    numFormGuesser = g.guessingNumber();
  }

  void collectNumberFormPlayer() {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    numFormPlayer1 = p1.guessingNumber();
    numFormPlayer2 = p2.guessingNumber();
    numFormPlayer3 = p3.guessingNumber();
  }

  void compare() {
    if (numFormGuesser == numFormPlayer1) {
        if ((numFormGuesser == numFormPlayer2)&&(numFormGuesser == numFormPlayer3)) {
            System.out.println("Player 1 - Player - 2 Player 3 - won the game.");
          }else if(numFormGuesser == numFormPlayer2){
            System.out.println("Player 1 - Player - 2 won the game.");
          }else if(numFormGuesser == numFormPlayer3){
            System.out.println("Player 1 - Player - 3 won the game.");
          }else{
            System.out.println("Player 1 won the game.");
          }
    } else if (numFormGuesser == numFormPlayer2) {
        if(numFormGuesser == numFormPlayer3){
            System.out.println("Player 2 - Player - 3 won the game.");
        }else{
            System.out.println("Player 2 won the game.");
        }
    } else if (numFormGuesser == numFormPlayer3) {
      System.out.println("Player 3 won the game.");
    } else {
      System.out.println("Game Player Lost the game!");
    }
  }
}

public class LaunchGame {

  public static void main(String[] args) {
    System.out.println("Game Started!");
    Umpaier u1 = new Umpaier();
    u1.collectNumberFormGuesser();
    u1.collectNumberFormPlayer();
    u1.compare();
  }
}
