import java.util.Scanner;

public class btvn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=caculateArrSum(scanner); ;
        System.out.println("tong la "+sum);
    }

    public static int caculateArrSum(Scanner scanner) {
        System.out.println("Nhap vao so dong");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao so cot");
        int column = Integer.parseInt(scanner.nextLine());

        int [][] arr = new int[row][column];
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Moi b nhap arr [" + i + "][" + j + "]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
