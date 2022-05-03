import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        int[] box= new int [3];
        box[0]= 1;
        box[1]=2;
        box[2]=3;
        for(int i=0;i<box.length;i++){
            if(i!=box.length-1)
                System.out.print(box[i]+",");
            else
                System.out.print(box[i]);
        }
        System.out.println();

        for (int i = box.length-1; i>=0; i--) {
            if(i!=0)
                System.out.print(box[i]+",");
            else
                System.out.print(box[i]);
        }



        System.out.println("\n");






        double[] cAse = {1.57, 7.654, 9.986};
            cAse[0] = 1.57;
            cAse[1] = 7.654;
            cAse[2] = 9.986;
            for (int i = 0; i < cAse.length; i++) {
                System.out.print(cAse[i]);
                if (i < (cAse.length - 1))
                    System.out.print(",");
            }
            System.out.println();


            for(int i =cAse.length-1;i>=0;i--){
            if(i!=0)
                System.out.print(cAse[i]+",");
            else
                System.out.print(cAse[i]);
        }


            System.out.println("\n");

            int[] week = new int[]{1, 2, 3, 4, 5, 6, 7};
            week[0] = 1;
            int monday = week[0];
            int mon = 0;
            for (int i = 0; i < week.length; i++) {
                System.out.print(week[i]);
                if (i < (week.length - 1))
                    System.out.print(", ");
            }

           System.out.println();


            for (int i =week.length-1;i>=0;i--){
                if(i!=0)
                    System.out.print(week[i]+", ");
                else
                    System.out.println(week[i]);
            }




             //Задание 4
        int[] bOx= new int [3];
        bOx[0]= 1;
        bOx[1]= 2;
        bOx[2]= 3;
        for(int i=0;i<bOx.length;i++){
            if (bOx[i]%2 !=0){
                System.out.println(bOx[i]+1);
                bOx[i]++;
            }
            if(i!=bOx.length-1)
                System.out.print(bOx[i]+ ", ");
            else
                System.out.println(bOx[i]);
        }
        System.out.println();

        System.out.println(Arrays.toString(bOx));
        }}





