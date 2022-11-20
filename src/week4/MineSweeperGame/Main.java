package week4.MineSweeperGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row, col;
        Scanner scan = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        row = scan.nextInt();
        System.out.print("Sütun sayısını girin: ");
        col = scan.nextInt();
        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
    }
}
