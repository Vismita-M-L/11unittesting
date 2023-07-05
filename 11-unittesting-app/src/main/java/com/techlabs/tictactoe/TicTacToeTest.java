package com.techlabs.tictactoe;

import java.util.Scanner;

public class TicTacToeTest {
	
	    public static void main(String[] args) throws InvalidLocationException {
	    	
	    	        Scanner scanner = new Scanner(System.in);

	    	        // Create players
	    	        System.out.print("Enter Player 1 name: ");
	    	        String player1Name = scanner.nextLine();
	    	        Player player1 = new Player(player1Name, MarkType.X);

	    	        System.out.print("Enter Player 2 name: ");
	    	        String player2Name = scanner.nextLine();
	    	        Player player2 = new Player(player2Name, MarkType.O);

	    	        // Create board and result analyzer
	    	        Board board = new Board();
	    	        ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board);

	    	        // Game loop
	    	        Player currentPlayer = player1;
	    	        while (true) {
	    	            // Display board
	    	            board.displayBoard();

	    	            // Get current player's input
	    	            System.out.println(currentPlayer.getName() + ", select a cell number (0-8): ");
	    	            int cellNumber = scanner.nextInt();

	    	            try {
	    	                // Set cell mark
	    	                board.setCellMark(cellNumber, currentPlayer.getMark());

	    	                // Check game result
	    	                ResultType result = resultAnalyzer.analyzeResult();

	    	                if (result == ResultType.WIN) {
	    	                    // Player won
	    	                    System.out.println("\nCongratulations, " + currentPlayer.getName() + "! You win!");
	    	                    break;
	    	                } else if (result == ResultType.DRAW) {
	    	                    // Draw
	    	                    System.out.println("\nIt's a draw!");
	    	                    break;
	    	                }

	    	                // Switch players
	    	                currentPlayer = (currentPlayer == player1) ? player2 : player1;
	    	            } catch (CellAlreadyMarkedException e) {
	    	                System.out.println("Cell already marked! Please choose another cell.");
	    	            }
	    	        }

	    	        // Close scanner
	    	        scanner.close();
	    	    }
	    	}

	


