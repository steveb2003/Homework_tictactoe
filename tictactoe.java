//package com.csc;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class tictactoe

{
    public static ArrayList<String> grid = new ArrayList<>();
    public static int counter = 0;
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        grid.add("1");
        grid.add("|");
        grid.add("2");
        grid.add("|");
        grid.add("3");

        Collections.addAll(grid,"_", "_", "_", "_","_");

        grid.add("4");
        grid.add("|");
        grid.add("5");
        grid.add("|");
        grid.add("6");

        Collections.addAll(grid, "_", "_", "_", "_","_");

        grid.add("7");
        grid.add("|");
        grid.add("8");
        grid.add("|");
        grid.add("9");
        
        tictactoe_score();
        boolean running = true;
        while (running)
            {
                System.out.print("Please select the number to make your move. You cannot select the same number twice. Type 'Clear' to end the game: ");
                String entry = in.next();
                switch (entry)
                {
                    case "1":
                        one();
                        break;
                    case "2":
                        two();
                        break;
                    case "3":
                        three();
                        break;
                    case "4":
                        four();
                        break;
                    case "5":
                        five();
                        break;
                    case "6":
                        six();
                        break;
                    case "7":
                        seven();
                        break;
                    case "8":
                        eight();
                        break;
                    case "9":
                        nine();
                        break;
                    case "Clear":
                        clear_score();
                        running = false;
                        break;
                    default:
                        System.out.println("Please enter a valid position");
                }

            }
        in.close();
            
    }
    
    public static void tictactoe_score()
    {
        for (int i=0; i<=4; i++)
        {
            System.out.print(grid.get(i));
        }
        
        System.out.println(" ");
        
        for (int i=5; i<=9; i++)
        {
            System.out.print(grid.get(i));
        }
        System.out.println(" ");
        
        
        for (int i=10; i<=14; i++)
        {
            System.out.print(grid.get(i));
        }
        System.out.println(" ");

        for (int i=15; i<=19; i++)
        {
            System.out.print(grid.get(i));
        }
        System.out.println(" ");

        for (int i = 20; i<=24; i++)
        {
            System.out.print(grid.get(i));
        }
        System.out.println(" ");
    }


    public static void one()
    {
        counter +=1;
        //set the move
        if (counter % 2 == 0 && grid.get(0).equals("1"))
        {
            //look at possible win positions
            grid.set(0,"X");
            tictactoe_score();
            if (grid.get(0).equals("X") && grid.get(2).equals("X") && grid.get(4).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(0).equals("X") && grid.get(10).equals("X") && grid.get(20).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(0).equals("X") && grid.get(12).equals("X") && grid.get(24).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        //set the move
        else if (counter % 2 != 0 && grid.get(0).equals("1"))
        {
            //look at possible win positions
            grid.set(0,"O");
            tictactoe_score();
            if (grid.get(0).equals("O") && grid.get(2).equals("O") && grid.get(4).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(0).equals("O") && grid.get(10).equals("O") && grid.get(20).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(0).equals("O") && grid.get(12).equals("O") && grid.get(24).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        
        else
        {
            counter -=1;
            System.out.println("This position is not available. Please choose an available position.");
        }
        
    }


    public static void two()
    {
        counter +=1;
        //set the move
        if (counter % 2 == 0 && grid.get(2).equals("2"))
        {
            //look at possible win positions
            grid.set(2,"X");
            tictactoe_score();
            if (grid.get(0).equals("X") && grid.get(2).equals("X") && grid.get(4).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(2).equals("X") && grid.get(12).equals("X") && grid.get(22).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        //set the move
        else if (counter % 2 != 0 && grid.get(2).equals("2"))
        {
            //look at possible win positions
            grid.set(2,"O");
            tictactoe_score();
            if (grid.get(0).equals("O") && grid.get(2).equals("O") && grid.get(4).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(2).equals("O") && grid.get(12).equals("O") && grid.get(22).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        

        else
        {
            counter -=1;
            System.out.println("This position is not available. Please choose an available position.");
        }
        
    }


    public static void three()
    {
        counter +=1;
        //set the move
        if (counter % 2 == 0 && grid.get(4).equals("3"))
        {
            //look at possible win positions
            grid.set(4,"X");
            tictactoe_score();
            if (grid.get(0).equals("X") && grid.get(2).equals("X") && grid.get(4).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("X") && grid.get(14).equals("X") && grid.get(24).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("X") && grid.get(12).equals("X") && grid.get(20).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        //set the move
        else if (counter % 2 != 0 && grid.get(4).equals("3"))
        {
            //look at possible win positions
            grid.set(4,"O");
            tictactoe_score();
            if (grid.get(0).equals("O") && grid.get(2).equals("O") && grid.get(4).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("O") && grid.get(14).equals("O") && grid.get(24).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("O") && grid.get(12).equals("O") && grid.get(20).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        
        else
        {
            counter -=1;
            System.out.println("This position is not available. Please choose an available position.");
        }
        
    }

    public static void four()
    {
        counter +=1;
        //set the move
        if (counter % 2 == 0 && grid.get(10).equals("4"))
        {
            //look at possible win positions
            grid.set(10,"X");
            tictactoe_score();
            if (grid.get(0).equals("X") && grid.get(10).equals("X") && grid.get(20).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(10).equals("X") && grid.get(12).equals("X") && grid.get(14).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        //set the move
        else if (counter % 2 != 0 && grid.get(10).equals("4"))
        {
            //look at possible win positions
            grid.set(10,"O");
            tictactoe_score();
            if (grid.get(0).equals("O") && grid.get(10).equals("O") && grid.get(20).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(10).equals("O") && grid.get(12).equals("O") && grid.get(14).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        
        else
        {
            counter -=1;
            System.out.println("This position is not available. Please choose an available position.");
        }
        
    }

    public static void five()
    {
        counter +=1;
        //set the move
        if (counter % 2 == 0 && grid.get(12).equals("5"))
        {
            //look at possible win positions
            grid.set(12,"X");
            tictactoe_score();
            if (grid.get(0).equals("X") && grid.get(12).equals("X") && grid.get(24).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(2).equals("X") && grid.get(12).equals("X") && grid.get(22).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("X") && grid.get(12).equals("X") && grid.get(20).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(10).equals("X") && grid.get(12).equals("X") && grid.get(14).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        //set the move
        else if (counter % 2 != 0 && grid.get(12).equals("5"))
        {
            //look at possible win positions
            grid.set(12,"O");
            tictactoe_score();
            if (grid.get(0).equals("O") && grid.get(12).equals("O") && grid.get(24).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(2).equals("O") && grid.get(12).equals("O") && grid.get(22).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("O") && grid.get(12).equals("O") && grid.get(20).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(10).equals("O") && grid.get(12).equals("O") && grid.get(14).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        
        else
        {
            counter -=1;
            System.out.println("This position is not available. Please choose an available position.");
        }
        
    }

    public static void six()
    {
        counter +=1;
        //set the move
        if (counter % 2 == 0 && grid.get(14).equals("6"))
        {
            //look at possible win positions
            grid.set(14,"X");
            tictactoe_score();
            if (grid.get(4).equals("X") && grid.get(14).equals("X") && grid.get(24).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(10).equals("X") && grid.get(12).equals("X") && grid.get(14).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        //set the move
        else if (counter % 2 != 0 && grid.get(14).equals("6"))
        {
            //look at possible win positions
            grid.set(14,"O");
            tictactoe_score();
            if (grid.get(4).equals("O") && grid.get(14).equals("O") && grid.get(24).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(10).equals("O") && grid.get(12).equals("O") && grid.get(14).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        
        else
        {
            counter -=1;
            System.out.println("This position is not available. Please choose an available position.");
        }
        
    }

    public static void seven()
    {
        counter +=1;
        //set the move
        if (counter % 2 == 0 && grid.get(20).equals("7"))
        {
            //look at possible win positions
            grid.set(20,"X");
            tictactoe_score();
            if (grid.get(0).equals("X") && grid.get(10).equals("X") && grid.get(20).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(20).equals("X") && grid.get(22).equals("X") && grid.get(24).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("X") && grid.get(12).equals("X") && grid.get(20).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        //set the move
        else if (counter % 2 != 0 && grid.get(20).equals("7"))
        {
            //look at possible win positions
            grid.set(20,"O");
            tictactoe_score();
            if (grid.get(0).equals("O") && grid.get(10).equals("O") && grid.get(20).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(20).equals("O") && grid.get(22).equals("O") && grid.get(24).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("O") && grid.get(12).equals("O") && grid.get(20).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }

        
        else
        {
            counter -=1;
            System.out.println("This position is not available. Please choose an available position.");
        }
        
    }

    public static void eight()
    {
        counter +=1;
        //set the move
        if (counter % 2 == 0 && grid.get(22).equals("8"))
        {
            //look at possible win positions
            grid.set(22,"X");
            tictactoe_score();
            if (grid.get(20).equals("X") && grid.get(22).equals("X") && grid.get(24).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(2).equals("X") && grid.get(12).equals("X") && grid.get(22).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        //set the move
        else if (counter % 2 != 0 && grid.get(22).equals("8"))
        {
            //look at possible win positions
            grid.set(22,"O");
            tictactoe_score();
            if (grid.get(20).equals("O") && grid.get(22).equals("O") && grid.get(24).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(2).equals("O") && grid.get(12).equals("O") && grid.get(22).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        
        else
        {
            counter -=1;
            System.out.println("This position is not available. Please choose an available position.");
        }
        
    }

    public static void nine()
    {
        counter +=1;
        //set the move
        if (counter % 2 == 0 && grid.get(24).equals("9"))
        {
            //look at possible win positions
            grid.set(24,"X");
            tictactoe_score();
            if (grid.get(0).equals("X") && grid.get(12).equals("X") && grid.get(24).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("X") && grid.get(14).equals("X") && grid.get(24).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(20).equals("X") && grid.get(22).equals("X") && grid.get(24).equals("X"))
            {
                System.out.println("Player 1 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        //set the move
        else if (counter % 2 != 0 && grid.get(24).equals("9"))
        {
            //look at possible win positions
            grid.set(24,"O");
            tictactoe_score();
            if (grid.get(0).equals("O") && grid.get(12).equals("O") && grid.get(24).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(4).equals("O") && grid.get(14).equals("O") && grid.get(24).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (grid.get(20).equals("O") && grid.get(22).equals("O") && grid.get(24).equals("O"))
            {
                System.out.println("Player 2 wins! Please enter 'Clear' to start new game.");
            }

            else if (counter == 9)
            {
                System.out.println("Draw. Please enter 'Clear' to start new game.");
            }
        }
        
        else
        {
            counter -=1;
            System.out.println("This position is not available. Please choose an available position.");
        }
        
    }

    public static void clear_score()
    {
        grid.set(0, "1");
        grid.set(2, "2");
        grid.set(4, "3");
        grid.set(10, "4");
        grid.set(12, "5");
        grid.set(14, "6");
        grid.set(20, "7");
        grid.set(22, "8");
        grid.set(24, "9");
        counter = 0;
    }

}