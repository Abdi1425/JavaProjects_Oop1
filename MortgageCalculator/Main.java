import java.util.Scanner;
import java.text.NumberFormat;
 class  Main{
    public static void main(String args[]){
        double p;
        double r;
        int N;
        int n;
        double M;
        double R;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the following:");
        System.out.print("Principal:");
        p = s.nextDouble();
        System.out.print("Enter the Annual rate:");
        R = s.nextDouble();
        r = (R/100)/12;
        System.out.print("Enter the number of years:");
        N =s.nextInt();
        n = N * 12;
        M = p * (r * Math.pow(1+ r,n)) / (Math.pow(1+r ,n) -1);


       String Mortgage = NumberFormat.getCurrencyInstance().format(M);
        System.out.println("Mortgage:" +Mortgage);

    }
        }