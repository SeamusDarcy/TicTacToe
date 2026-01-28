package com.seamus.app.domain;

public class Board {

    public Board() {

    }


    char[][] boardArr = {
            {'-','-','-'},
            {'-','-','-'},
            {'-','-','-'}
    };
    int totalMoves = 0;
    private boolean p1Turn = true;
    private boolean isRunning = true;
    private boolean win = false;

    public boolean isRunning() {
        return isRunning;
    }

    public int getTotalMoves() {
        return totalMoves;
    }

    public boolean isP1Turn() {
        p1Turn = totalMoves % 2 == 0;
        return p1Turn;
    }


    public boolean isWin() {
        return win;
    }

    public char getCell (int i) {
        int row;
        int col;
        char state;
        col = i % 3;

        if (i <= 2){
            row = 0;
        } else if (i <= 5) {
            row = 1;
        } else {
            row = 2;
        }

        state = boardArr[row][col];
        return state;

    }




}
