import java.util.*;
public class Squre_rec {
    public static void printstar(int c)
    {
        if(c==0)
        return;
        System.out.print("*");
        printstar(c-1);
    }
    public static void  nrows(int r,int c)
    {
        if(r==0)
        return ;
        printstar(c);
        System.out.println();
        nrows(r-1, c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nrows(n, n);

    }
}
    

