package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Project1
{
    public static void main(String[] args) {
        System.out.println("Welcome to X-O game made by Ammar Yagoub");
        int playerWins = 0, botWins = 0, ties = 0;
        int[] score = new int[3];
        boolean play = true;
        XO();

    }

    public static String setEnd(int playerWins, int botWins, int ties){
        if (playerWins >=2 ){
            return "player";
        }else if (botWins >=2 ){
            return "bot";
        }else {
            return "tie";
        }
    }

    public static boolean playerO(Scanner sc, String[][] picks){
        System.out.println();
        System.out.println("|---|---|---|");
        System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
        System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
        System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
        System.out.println("|___|___|___|");
        System.out.print("pick a spot: ");
        try {
            String choice = sc.nextLine();
            // player picks
            if (choice.equals("1") && (!picks[0][0].equals("o") && !picks[0][0].equals("x"))){
                picks[0][0] = "o";
                return false;
            }else if (choice.equals("2")&& (!picks[0][1].equals("o") && !picks[0][1].equals("x"))){
                picks[0][1] = "o";
                return false;
            }else if (choice.equals("3")&& (!picks[0][2].equals("o") && !picks[0][2].equals("x"))){
                picks[0][2] = "o";
                return false;
            }else if (choice.equals("4")&& (!picks[1][0].equals("o")&&!picks[1][0].equals("x"))){
                picks[1][0] = "o";
                return false;
            }else if (choice.equals("5")&& (!picks[1][1].equals("o")&&!picks[1][1].equals("x"))){
                picks[1][1] = "o";
                return false;
            }else if (choice.equals("6")&& (!picks[1][2].equals("o")&&!picks[1][2].equals("x"))){
                picks[1][2] = "o";
                return false;
            }else if (choice.equals("7")&& (!picks[2][0].equals("o")&&!picks[2][0].equals("x"))){
                picks[2][0] = "o";
                return false;
            }else if (choice.equals("8")&& (!picks[2][1].equals("o")&&!picks[2][1].equals("x"))){
                picks[2][1] = "o";
                return false;
            }else if (choice.equals("9")&& (!picks[2][2].equals("o")&&!picks[2][2].equals("x"))) {
                picks[2][2] = "o";
                return false;
            } else{
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            System.out.println("Invalid choice");
            return true;
        }
    }

    public static boolean playerX(Scanner sc, String[][] picks){
        System.out.println();
        System.out.println("|---|---|---|");
        System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
        System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
        System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
        System.out.println("|___|___|___|");
        System.out.print("pick a spot: ");
        try {
            String choice = sc.nextLine();
            // player picks
            if (choice.equals("1") && (!picks[0][0].equals("o") && !picks[0][0].equals("x"))) {
                picks[0][0] = "x";
                return false;
            } else if (choice.equals("2") && (!picks[0][1].equals("o") && !picks[0][1].equals("x"))) {
                picks[0][1] = "x";
                return false;
            } else if (choice.equals("3") && (!picks[0][2].equals("o") && !picks[0][2].equals("x"))) {
                picks[0][2] = "x";
                return false;
            } else if (choice.equals("4") && (!picks[1][0].equals("o") && !picks[1][0].equals("x"))) {
                picks[1][0] = "x";
                return false;
            } else if (choice.equals("5") && (!picks[1][1].equals("o") && !picks[1][1].equals("x"))) {
                picks[1][1] = "x";
                return false;
            } else if (choice.equals("6") && (!picks[1][2].equals("o") && !picks[1][2].equals("x"))) {
                picks[1][2] = "x";
                return false;
            } else if (choice.equals("7") && (!picks[2][0].equals("o") && !picks[2][0].equals("x"))) {
                picks[2][0] = "x";
                return false;
            } else if (choice.equals("8") && (!picks[2][1].equals("o") && !picks[2][1].equals("x"))) {
                picks[2][1] = "x";
                return false;
            } else if (choice.equals("9") && (!picks[2][2].equals("o") && !picks[2][2].equals("x"))) {
                picks[2][2] = "x";
                return false;
            } else {
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            System.out.println("Invalid choice");
            return true;
        }
    }

    public static void XO(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String sign;
        int botWins = 0, playerWins = 0, ties = 0;
        String[][] picks =  {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        System.out.print("please pick your sign ( X / O ) : ");
        sign = sc.nextLine();


        //_______________________________Player sign is X here_____________________________\\

        if (sign.equals("X") || sign.equals("x")) {
            for(int i=0;i<5;i++){

                boolean go = true;
                while(go){
                   go =  playerX(sc,picks);
                }


                // bot picks

                for( ; ;){
                    String botChoice = rand.nextInt(0,9)+"";
                    if(i <= 3)
                    {
                        if (botChoice.equals("0") && (!picks[0][0].equals("x") && !picks[0][0].equals("o"))) {
                            picks[0][0] = "o";
                            break;
                        }
                        if (botChoice.equals("1") && (!picks[0][1].equals("x") && !picks[0][1].equals("o"))) {
                            picks[0][1] = "o";
                            break;
                        }
                        if (botChoice.equals("2") && (!picks[0][2].equals("x") && !picks[0][2].equals("o"))) {
                            picks[0][2] = "o";
                            break;
                        }
                        if (botChoice.equals("3") && (!picks[1][0].equals("x") && !picks[1][0].equals("o"))) {
                            picks[1][0] = "o";
                            break;
                        }
                        if (botChoice.equals("4") && (!picks[1][1].equals("x") && !picks[1][1].equals("o"))) {
                            picks[1][1] = "o";
                            break;
                        }
                        if (botChoice.equals("5") && (!picks[1][2].equals("x") && !picks[1][2].equals("o"))) {
                            picks[1][2] = "o";
                            break;
                        }
                        if (botChoice.equals("6") && (!picks[2][0].equals("x") && !picks[2][0].equals("o"))) {
                            picks[2][0] = "o";
                            break;
                        }
                        if (botChoice.equals("7") && (!picks[2][1].equals("x") && !picks[2][1].equals("o"))) {
                            picks[2][1] = "o";
                            break;
                        }
                        if (botChoice.equals("8") && (!picks[2][2].equals("x") && !picks[2][2].equals("o"))) {
                            picks[2][2] = "o";
                            break;
                        }
                    }else {
                        break;
                    }
                }

                if((picks[0][0].equals("x") && picks[0][1].equals("x")&& picks[0][2].equals("x"))
                        || (picks[1][0].equals("x") && picks[1][1].equals("x")&& picks[1][2].equals("x"))
                        || (picks[2][0].equals("x") && picks[2][1].equals("x")&& picks[2][2].equals("x"))
                        || (picks[0][0].equals("x") && picks[1][0].equals("x")&& picks[2][0].equals("x"))
                        || (picks[0][1].equals("x") && picks[1][1].equals("x")&& picks[2][1].equals("x"))
                        || (picks[0][2].equals("x") && picks[1][2].equals("x")&& picks[2][2].equals("x"))
                        || (picks[0][0].equals("x") && picks[1][1].equals("x")&& picks[2][2].equals("x"))
                        || (picks[0][2].equals("x") && picks[1][1].equals("x")&& picks[2][0].equals("x"))){
                    System.out.println();
                    System.out.println();
                    System.out.println("|---|---|---|");
                    System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
                    System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
                    System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
                    System.out.println("|___|___|___|");
                    System.out.println("Congrats! You won!");
                    playerWins++;
                    i =0;
                    picks[0][0] = "1";
                    picks[0][1] = "2";
                    picks[0][2] = "3";
                    picks[1][0] = "4";
                    picks[1][1] = "5";
                    picks[1][2] = "6";
                    picks[2][0] = "7";
                    picks[2][1] = "8";
                    picks[2][2] = "9";
                    System.out.println("the current score is ( you won "+playerWins+" time bot won "+botWins+" times and ties is "+ties+" times)");

                } else if ((picks[0][0].equals("o") && picks[0][1].equals("o")&& picks[0][2].equals("o"))
                        || (picks[1][0].equals("o") && picks[1][1].equals("o")&& picks[1][2].equals("o"))
                        || (picks[2][0].equals("o") && picks[2][1].equals("o")&& picks[2][2].equals("o"))
                        || (picks[0][0].equals("o") && picks[1][0].equals("o")&& picks[2][0].equals("o"))
                        || (picks[0][1].equals("o") && picks[1][1].equals("o")&& picks[2][1].equals("o"))
                        || (picks[0][2].equals("o") && picks[1][2].equals("o")&& picks[2][2].equals("o"))
                        || (picks[0][0].equals("o") && picks[1][1].equals("o")&& picks[2][2].equals("o"))
                        || (picks[0][2].equals("o") && picks[1][1].equals("o")&& picks[2][0].equals("o"))){
                    System.out.println();
                    System.out.println("|---|---|---|");
                    System.out.println("|---|---|---|");
                    System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
                    System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
                    System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
                    System.out.println("|___|___|___|");
                    System.out.println("|___|___|___|");
                    System.out.println("Sorry you lost! better luck next time");
                    i =0;
                    botWins++;
                    picks[0][0] = "1";
                    picks[0][1] = "2";
                    picks[0][2] = "3";
                    picks[1][0] = "4";
                    picks[1][1] = "5";
                    picks[1][2] = "6";
                    picks[2][0] = "7";
                    picks[2][1] = "8";
                    picks[2][2] = "9";
                    System.out.println("the current score is ( you won "+playerWins+" time bot won "+botWins+" times and ties is "+ties+" times)");

                }else if(i == 4){
                    System.out.println();
                    System.out.println("|---|---|---|");
                    System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
                    System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
                    System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
                    System.out.println("|___|___|___|");
                    i =0;
                    ties++;
                    picks[0][0] = "1";
                    picks[0][1] = "2";
                    picks[0][2] = "3";
                    picks[1][0] = "4";
                    picks[1][1] = "5";
                    picks[1][2] = "6";
                    picks[2][0] = "7";
                    picks[2][1] = "8";
                    picks[2][2] = "9";
                    System.out.print("It's a tie! ");
                    System.out.println("the current score is ( you won "+playerWins+" time bot won "+botWins+" times and ties is "+ties+" times)");
                }
            }
        }


        //_______________________________Player sign is O here_____________________________\\


        else if(sign.equals("O") || sign.equals("o")){
            for(int i=0;i<5;i++){
                boolean go = true;
                while(go){
                    go = playerO(sc,picks);
                }
                if (playerWins == 2){
                    System.out.println("you won the set congrats!");
                    break;
                }else if (botWins == 2){
                    System.out.println("the bot won the set better luck next time ");
                    break;
                }else if((botWins+playerWins+ties) == 3){
                    System.out.println("wow what a set even the set is a tie ");
                    break;
                }
                // bot picks

                for( ; ;){
                    String botChoice = rand.nextInt(0,9)+"";

                        if (botChoice.equals("0") && (!picks[0][0].equals("x") && !picks[0][0].equals("o"))) {
                            picks[0][0] = "x";
                            break;
                        }
                        if (botChoice.equals("1") && (!picks[0][1].equals("x") && !picks[0][1].equals("o"))) {
                            picks[0][1] = "x";
                            break;
                        }
                        if (botChoice.equals("2") && (!picks[0][2].equals("x") && !picks[0][2].equals("o"))) {
                            picks[0][2] = "x";
                            break;
                        }
                        if (botChoice.equals("3") && (!picks[1][0].equals("x") && !picks[1][0].equals("o"))) {
                            picks[1][0] = "x";
                            break;
                        }
                        if (botChoice.equals("4") && (!picks[1][1].equals("x") && !picks[1][1].equals("o"))) {
                            picks[1][1] = "x";
                            break;
                        }
                        if (botChoice.equals("5") && (!picks[1][2].equals("x") && !picks[1][2].equals("o"))) {
                            picks[1][2] = "x";
                            break;
                        }
                        if (botChoice.equals("6") && (!picks[2][0].equals("x") && !picks[2][0].equals("o"))) {
                            picks[2][0] = "x";
                            break;
                        }
                        if (botChoice.equals("7") && (!picks[2][1].equals("x") && !picks[2][1].equals("o"))) {
                            picks[2][1] = "x";
                            break;
                        }
                        if (botChoice.equals("8") && (!picks[2][2].equals("x") && !picks[2][2].equals("o"))) {
                            picks[2][2] = "x";
                            break;
                        }

                }
                System.out.println();
                System.out.println("|---|---|---|");
                System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
                System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
                System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
                System.out.println("|___|___|___|");
                System.out.print("pick a spot: ");
                String choice = sc.nextLine();

                // player picks
               if (i <= 3){
                go = true;
                while (go){
                    go = playerO(sc,picks);
                }

               }

                if((picks[0][0].equals("x") && picks[0][1].equals("x")&& picks[0][2].equals("x"))
                        || (picks[1][0].equals("x") && picks[1][1].equals("x")&& picks[1][2].equals("x"))
                        || (picks[2][0].equals("x") && picks[2][1].equals("x")&& picks[2][2].equals("x"))
                        || (picks[0][0].equals("x") && picks[1][0].equals("x")&& picks[2][0].equals("x"))
                        || (picks[0][1].equals("x") && picks[1][1].equals("x")&& picks[2][1].equals("x"))
                        || (picks[0][2].equals("x") && picks[1][2].equals("x")&& picks[2][2].equals("x"))
                        || (picks[0][0].equals("x") && picks[1][1].equals("x")&& picks[2][2].equals("x"))
                        || (picks[0][2].equals("x") && picks[1][1].equals("x")&& picks[2][0].equals("x"))){
                    System.out.println();
                    System.out.println("|---|---|---|");
                    System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
                    System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
                    System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
                    System.out.println("|___|___|___|");
                    System.out.println("Sorry you lost! better luck next time");
                    botWins++;
                    i = 0;
                    picks[0][0] = "1";
                    picks[0][1] = "2";
                    picks[0][2] = "3";
                    picks[1][0] = "4";
                    picks[1][1] = "5";
                    picks[1][2] = "6";
                    picks[2][0] = "7";
                    picks[2][1] = "8";
                    picks[2][2] = "9";
                    System.out.println("the current score is ( you won "+playerWins+" time bot won "+botWins+" times and ties is "+ties+" times)");

                } else if ((picks[0][0].equals("o") && picks[0][1].equals("o")&& picks[0][2].equals("o"))
                        || (picks[1][0].equals("o") && picks[1][1].equals("o")&& picks[1][2].equals("o"))
                        || (picks[2][0].equals("o") && picks[2][1].equals("o")&& picks[2][2].equals("o"))
                        || (picks[0][0].equals("o") && picks[1][0].equals("o")&& picks[2][0].equals("o"))
                        || (picks[0][1].equals("o") && picks[1][1].equals("o")&& picks[2][1].equals("o"))
                        || (picks[0][2].equals("o") && picks[1][2].equals("o")&& picks[2][2].equals("o"))
                        || (picks[0][0].equals("o") && picks[1][1].equals("o")&& picks[2][2].equals("o"))
                        || (picks[0][2].equals("o") && picks[1][1].equals("o")&& picks[2][0].equals("o"))){
                    System.out.println();
                    System.out.println("|---|---|---|");
                    System.out.println("|---|---|---|");
                    System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
                    System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
                    System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
                    System.out.println("|___|___|___|");
                    System.out.println("|___|___|___|");
                    System.out.println("Congrats! You won!");
                    playerWins++;
                    i = 0;
                    picks[0][0] = "1";
                    picks[0][1] = "2";
                    picks[0][2] = "3";
                    picks[1][0] = "4";
                    picks[1][1] = "5";
                    picks[1][2] = "6";
                    picks[2][0] = "7";
                    picks[2][1] = "8";
                    picks[2][2] = "9";
                    System.out.println("the current score is ( you won "+playerWins+" time bot won "+botWins+" times and ties is "+ties+" times)");

                }else if(i == 4){
                    System.out.println();
                    System.out.println("|---|---|---|");
                    System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
                    System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
                    System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
                    System.out.println("|___|___|___|");
                    ties++;
                    i = 0;
                    System.out.print("It's a tie! ");
                    picks[0][0] = "1";
                    picks[0][1] = "2";
                    picks[0][2] = "3";
                    picks[1][0] = "4";
                    picks[1][1] = "5";
                    picks[1][2] = "6";
                    picks[2][0] = "7";
                    picks[2][1] = "8";
                    picks[2][2] = "9";
                    System.out.println("the current score is ( you won "+playerWins+" time bot won "+botWins+" times and ties is "+ties+" times)");
                }
            }
        }


    }



}
