package ra.bt2;

public class Main {
    private static int[] getArr() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    private static int findSecondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        return secondMin;
    }
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mảng số nguyên");
        printArray(arr);

        int min = findMin(arr);
        System.out.println("Số nhỏ nhất " + min);
        int secondMin =findSecondMin(arr);
        System.out.println("số nhỏ thứ hai " +secondMin);
    }
}
