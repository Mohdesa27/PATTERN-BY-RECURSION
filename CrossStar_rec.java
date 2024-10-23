import java.util.*;
public class CrossStar_rec {
        static void printX(int n, int r) {
            if (r == n) return;
            printRow(n, r, 0);
            System.out.println();
            printX(n, r + 1);
        }
    
        static void printRow(int n, int r, int c) {
            if (c == n) return;
            if (c == r || c == n - r - 1) System.out.print("* ");
            else System.out.print("  ");
            printRow(n, r, c + 1);
        }
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            printX(n, 0);
        }
    }
