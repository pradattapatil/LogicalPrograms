package LogicalPrograms;

import java.util.Scanner;

public class StopwatchProgram {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println(" Start ");
        long starttime=0;
        long stoptime=0;
        int start =s.nextInt();
        if(start ==1) {
            starttime =System.currentTimeMillis();
        }
        else {
            System.out.println("For Starting stopwatch type 1");
        }
        System.out.println("Stop");
        int stop=s.nextInt();
        if(stop ==0) {
            stoptime=System.currentTimeMillis();
        }
        else {
            System.out.println("For Stoppin Stopwatch type 0");
        }

        System.out.println("The Elapsed Time is");
        long Elapsedtime= stoptime  - starttime ;
        System.out.println(Elapsedtime + "MiliSeconds");

    }
}
