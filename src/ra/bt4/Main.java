package ra.bt4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] arr = {2,3,8,5,33,7,55,9,11,42,13};
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập giá trị cần tìm");
        int target =scanner.nextInt();

        int position = linearSearch(arr, target);
        if (position != -1) {
            System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + position + " trong mảng.");
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Trả về vị trí nếu tìm thấy
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }
}