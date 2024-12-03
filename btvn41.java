import java.util.Scanner;

public class btvn41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        caculate2ArrSum(scanner);
    }

    public static void caculate2ArrSum(Scanner scanner) {
        System.out.println("Nhap so dong A");
        int rowA = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot A");
        int columnA = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap so dong B");
        int rowB = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot B");
        int columnB = Integer.parseInt(scanner.nextLine());

        if (rowA!=rowB || columnA!=columnB ) {
            System.out.println("khong the thuc hien");
        }

        int [][] arrA = new int[rowA][columnA];
        int [][] arrB = new int[rowB][columnB];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                System.out.println("Moi b nhap arrA ["+i+"]["+j+"]");
                arrA[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.println("Moi b nhap arrB ["+i+"]["+j+"]");
                arrB[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        int [][] arrC = new int[rowA][columnA];
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                arrC[i][j] = arrA[i][j] + arrB[i][j];
                System.out.print(arrC[i][j]+"\t");
            }
        }
    }
}

