import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class LearnJavaMain {
    public static void main(String[] args) {
        System.out.println("Application Started..");
        //patter1Print();
//        patter2Print();
        pattern3Print();
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter Principle (P): ");
//        double principle= sc.nextDouble();
//
//        System.out.println("Enter ROI (R): ");
//        float roi=sc.nextFloat();
//
//        System.out.println("Enter Tenure (N): ");
//        int tenure=sc.nextInt();

        // mFibonacciSeries();
        // V = P (1+r)^n

        // double v=powerFn(principle*(1+roi), tenure);


//        int count=0;
//        while(count < tenure) {
//            double v = principle * (1 + roi);
//            principle = v;
//            count++;
//        }
//        System.out.println(principle);


//        System.out.println("Using recursion");
//       double result= investment(principle,  roi,  tenure);
//
//        System.out.println(result);

    }

    static void patter1Print(){
        for (int row=0; row<5; row++){
            for (int column=0; column<=row; column++){
                System.out.print(row+1 +"\t");

            }
            System.out.println();
        }
    }

    static void pattern3Print(){
        for (int i = 0; i <= 5; i++) {
            // Print leading spaces
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            // Print stars followed by a space
            for (int j = 0; j <= ( i - 1); j++) {
                System.out.print(i+" ");
            }

            // Move to the next line
            System.out.println();
        }
    }
    static void patter2Print(){
        for (int row=0; row<5; row++){
            // print left space
            for(int leftSpace=0; leftSpace < row; leftSpace++){
                System.out.print("\t");
            }
            //print dollar symbol
            for (int column=5; column>row; column--){
                System.out.print("$\t");
            }

            System.out.println();
        }
    }


    static double investment(double principle, float roi, int tenure){
        if(tenure <=0){
            return principle;
        }
        double v = principle * (1 + roi);
        principle = v;
        tenure--;
        return investment(principle, roi, tenure);
    }


    static double powerFn(int num, int exp){
        int count=1;
        double result=1;

        while(count<=exp){
            result=result*num;
            count++;
        }
        System.out.println(result);

        return result;
    }

    static double powerFn(float num, int exp){
        int count=1;
        double result=1;

        while(count<=exp){
            result=result*num;
            count++;
        }
        System.out.println(result);

        return result;
    }

    static void mFibonacciSeries(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the count (m) to print fibonnaci series: ");
        int m=sc.nextInt();

        if(m<=0){
            System.out.println("Please enter a valid integer");
            return;
        }

        int first=0;
        int second=1;
        int count=0;

        do{
            int next=first+second;
            first=second;
            second=next;
            count++;
            System.out.println(first);
        }while(count<m);

    }
}
