package com.seamus.app;

import com.seamus.app.domain.Board;
import com.seamus.app.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        ConsoleUI ui = new ConsoleUI(board);

        ui.displayTurn();
        ui.displayBoard();
        ui.turnInput();


    }
}
