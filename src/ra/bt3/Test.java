package ra.bt3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[][] arr = getArr();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();
        boolean result = searchNumber(arr, target);
        if (result) {
            System.out.println("Số " + target + " được tìm thấy tại các vị trí trong mảng.");
        } else {
            System.out.println("Số " + target + " không tồn tại trong mảng.");
        }
    }

    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;

    }

    private static boolean searchNumber(int[][] arr, int target) {
        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    rowList.add(i);
                    colList.add(j);
                    check = true;
                }
            }
        }

        if (check) {
            System.out.print("Số " + target + " được tìm thấy tại các vị trí: ");
            for (int k = 0; k < rowList.size(); k++) {
                System.out.print("(" + rowList.get(k) + ", " + colList.get(k) + ") ");
            }
            System.out.println();
        }

        return check;
    }
}
