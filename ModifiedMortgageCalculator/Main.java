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
        while (true){
        System.out.print("Principal between 10k-1M:");
        p = s.nextDouble();
        if(p >= 10000 && p<= 1000000)
        break;
            System.out.println("Enter a value between 10k-1m");
        };
        while (true) {

            System.out.print("Enter the Anual rate between 30 to 45:");
            R = s.nextDouble();
            r = (R / 100) / 12;
            if (R >= 30 && R <= 45)
                break;
            System.out.println("Enter the correct Anual rate ");
        }
        while(true) {
            System.out.print("Enter the number of years lees than 9 years:");
            N = s.nextInt();
            n = N * 12;
            if(N >0 && N <= 9)
                break;
            System.out.println("Enter the right number of yrs");
        }
        M = p * (r * Math.pow(1+ r,n)) / (Math.pow(1+r ,n) -1);
        String Mortgage = NumberFormat.getCurrencyInstance().format(M);
        System.out.println("Mortgage:" +Mortgage);

    }
}