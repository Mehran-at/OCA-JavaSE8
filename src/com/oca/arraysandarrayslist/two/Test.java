package com.oca.arraysandarrayslist.two;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {

        char[][] grid = new char[3][3];// [[0,0,0],[0,0,0],[0,0,0]]
        grid[0][0] = '0';// [['0','0','0'],['0','0','0'],['0','0','0']]
        grid[0][1] = '0';// [['0','0','0'],['0','0','0'],['0','0','0']]
        grid[0][2] = '?';// [['0','0','?'],['0','0','0'],['0','0','0']]
        grid[1][1] = 'X';// [['0','0','?'],['0','X','0'],['0','0','0']]
        grid[1][0] = '?';// [['0','0','?'],['?','X','0'],['0','0','0']]
        grid[1][2] = '0';// [['0','0','?'],['?','X','0'],['0','0','0']]
        grid[2][0] = '?';// [['0','0','?'],['?','X','0'],['?','0','0']]
        grid[2][1] = 'X';// [['0','0','?'],['?','X','0'],['?','X','0']]
        grid[2][2] = 'X';// [['0','0','?'],['?','X','0'],['?','X','X']]
//        D. grid[2][0] = ‘X’;
        System.out.println(Arrays.deepToString(grid));
//        A. grid[1][3] = ‘X’;
//        B. grid[3][1] = ‘X’;
//        C. grid[0][2] = ‘X’;
//        D. grid[2][0] = ‘X’;
//        E. grid[1][2] = ‘X’;
    }
}
//  _____________________________________
//  |_____0_____|_____0_____|___________|
//  |___________|_____X_____|_____0_____|
//  |___________|_____X_____|_____X_____|
