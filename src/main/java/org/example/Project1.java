package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Project1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to X-O game made by Ammar Yagoub");
        int[] score = new int[3];
        boolean play = true;
        while (play){
            String result = XO();
            System.out.println(result);
            System.out.print("do you want to try for another set?(yes / no) : ");
            String ans = input.nextLine();
            if (result.startsWith("Congrats")){
                score[0] += 1;
            }else if (result.startsWith("better")){
                score[1] += 1;
            }else {
                score[2] += 1;
            }
            if (ans.equals("yes")||ans.equals("y")){
                play = true;
            }else {
                play = false;
            }
        }
        System.out.println("final score \n you have won "+score[0]+" sets and lost "+score[1]+" sets and tied "+score[2]+" sets");

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


    public static String XO(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String sign;
        int botWins = 0, playerWins = 0, ties = 0;
        String[][] picks =  {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};



        for (int i = 0 ; i <= 2 ; i++){

            System.out.print("please pick your sign ( X / O ) : ");
            sign = sc.nextLine();
            if (!sign.equalsIgnoreCase("x") && !sign.equalsIgnoreCase("o")){
                System.out.println("invalid sign");
                i--;
                continue;
            }


            //_______________________________Player sign is X here_____________________________\\
            if (sign.equals("X") || sign.equals("x")) {
                for(int j=0;j<5;j++){

                    boolean go = true;
                    while(go){
                        go =  playerX(sc,picks);
                    }


                    // bot picks
                    for( ; ;){
                        String botChoice = rand.nextInt(0,9)+"";
                        if(j <= 3)
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
                        break;
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
                        break;
                    }else if(j == 4){
                        System.out.println();
                        System.out.println("|---|---|---|");
                        System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
                        System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
                        System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
                        System.out.println("|___|___|___|");
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
                        break;
                    }
                }



            }//_______________________________Player sign is O here_____________________________\\
            else if(sign.equals("O") || sign.equals("o")){
                for(int j=0;j<5;j++){
                    boolean go = true;

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

                    // player picks
                    if (j <= 3){
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
                        j=0;
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
                        break;
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
                        break;
                    }else if(j == 4){
                        System.out.println();
                        System.out.println("|---|---|---|");
                        System.out.println("|_"+picks[0][0]+"_|_"+picks[0][1]+"_|_"+picks[0][2]+"_|");
                        System.out.println("|_"+picks[1][0]+"_|_"+picks[1][1]+"_|_"+picks[1][2]+"_|");
                        System.out.println("|_"+picks[2][0]+"_|_"+picks[2][1]+"_|_"+picks[2][2]+"_|");
                        System.out.println("|___|___|___|");
                        ties++;
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
                        break;
                    }
                }
            }
            if(playerWins > 1 || botWins > 1){
                break;
            }
        }
        if (playerWins >= 2){
            return "Congrats you won the set :)";
        }else if(botWins >= 2) {
            return "better luck next time the bot won the set ;(";
        }else {
            return "its a tie set try harder next time";
        }
    }



}
