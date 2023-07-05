package com.techlabs.tictactoe;

public class ResultAnalyzer {
	 private Board board;

	    public ResultAnalyzer(Board board) {
	        this.board = board;
	    }

	    public ResultType analyzeResult() {
	        if (board.hasWon(MarkType.X)) {
	            return ResultType.WIN;
	        } else if (board.hasWon(MarkType.O)) {
	            return ResultType.WIN;
	        } else if (board.isBoardFull()) {
	            return ResultType.DRAW;
	        } else {
	            return ResultType.PROGRESS;
	        }
	    }
}
