package com.seamus.app.ui;

import com.seamus.app.domain.Board;

import java.util.Scanner;

public class ConsoleUI {

    Scanner scanner = new Scanner(System.in);
    private final Board board;
    public ConsoleUI (Board board){
        this.board = board;
    }

public void displayTurn(){
    System.out.println();
    System.out.println("***************");
        if(board.isP1Turn()){
            System.out.println("Player 1's Turn");
        } else {
            System.out.println("Player 2's Turn");
        }
    System.out.println("***************");
    System.out.println();
}

public void displayBoard() {
        int k = 0;
        for (int i = 0; i < 3; i++){
            if (i != 0) {
                System.out.println();
            }
            for (int j = 0; j < 3; j++){
                System.out.print("| " + board.getCell(k) + " ");
                if (j == 2) {
                    System.out.print("|");
                }
                k++;
            }
        }
    System.out.println();
    }

public void turnInput() {
        int choice;
    System.out.println(" ");
    while (true) {
        System.out.print("Pick Square (0-8) : ");
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            scanner.nextLine();
            continue;
        }
        if(choice < 0 || choice > 8) {
            System.out.println("Please pick a number 0-8");
            continue;
        }
        break;
    }

}
}


