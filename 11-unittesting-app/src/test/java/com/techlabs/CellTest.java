package com.techlabs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.techlabs.tictactoe.Cell;
import com.techlabs.tictactoe.CellAlreadyMarkedException;
import com.techlabs.tictactoe.MarkType;

class CellTest {

	private Cell cell;

    @BeforeEach
    void init() {
        cell = new Cell();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(cell.isEmpty());
    }

    @Test
    public void testGetMark() {
        assertEquals(MarkType.EMPTY, cell.getMark());
    }

    @Test
    public void testSetMark() throws CellAlreadyMarkedException {
        cell.setMark(MarkType.X);
        assertEquals(MarkType.X, cell.getMark());
    }

}
