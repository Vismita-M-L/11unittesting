package com.techlabs.tictactoe;

public class Board {
	private Cell[] cells;
	

    public Cell[] getCells() {
		return cells;
	}

	public void setCells(Cell[] cells) {
		this.cells = cells;
	}

	public Board() {
        cells = new Cell[9];
        for (int i = 0; i < 9; i++) {
            cells[i] = new Cell();
        }
    }

	public boolean isBoardFull() {
        for (Cell cell : cells) {
            if (cell.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void setCellMark(int loc, MarkType mark) throws CellAlreadyMarkedException {
        if (cells[loc].isEmpty()) {
            cells[loc].setMark(mark);
        } else {
            throw new CellAlreadyMarkedException("Cell already marked!");
        }
    }

    public MarkType getMark(int loc) throws InvalidLocationException {
        if (loc >= 0 && loc < cells.length) {
            return cells[loc].getMark();
        } else {
            throw new InvalidLocationException("Invalid cell location!");
        }
    }

    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("| " + cells[i] + " | " + cells[i + 1] + " | " + cells[i + 2] + " |");
            System.out.println("-------------");
        }
        System.out.println(); // Add an empty line for better readability
    }

    public boolean hasWon(MarkType mark) {
        // Check rows
        for (int i = 0; i < 9; i += 3) {
            if (cells[i].getMark() == mark && cells[i + 1].getMark() == mark && cells[i + 2].getMark() == mark) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (cells[i].getMark() == mark && cells[i + 3].getMark() == mark && cells[i + 6].getMark() == mark) {
                return true;
            }
        }

        // Check diagonals
        if (cells[0].getMark() == mark && cells[4].getMark() == mark && cells[8].getMark() == mark) {
            return true;
        }
        if (cells[2].getMark() == mark && cells[4].getMark() == mark && cells[6].getMark() == mark) {
            return true;
        }

        return false;
    }

}
