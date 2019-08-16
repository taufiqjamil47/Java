package mainPackage;
import java.util.Scanner;

public class mainMatriks {
    private static Scanner masuk = new Scanner(System.in);

    private static void bacaMatriks(int[][] M, int i, int j) {
        for (i=1; i<=3; i++) {
            for (j=1; j<=3; j++) {
                System.out.print("Ketikan Elemen ["+i+","+j+"]: "); M[i][j] = masuk.nextInt();
            }
            System.out.println();
        }
    }

    private static void tulisMatriks(int[][] M, int i, int j) {
        for (i=1; i<=3; i++) {
            for (j=1; j<=3; j++) {
                System.out.print(M[i][j]+"   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Baca Inputan untuk Matriks: ");
        int p= 3, q=3;
        int[][] A = new int[20][20];
        int[][] B = new int[20][20];
        int[][] C = new int[20][20];
        System.out.println();
        System.out.println("Masukkan nilai matriks A");
        bacaMatriks(A, p, q);
        System.out.println("Masukkan nilai matriks B");
        bacaMatriks(B, p, q);

        System.out.println("Nilai Matrik A");
        tulisMatriks(A, p, q);
        System.out.println("Nilai Matrik B");
        tulisMatriks(B, p, q);

        System.out.println("Hasil Penjumlahan Matrik A dan Matrik B: ");
        for (int i=1; i<=p; i++) {
            for (int j=1; j<=q; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
