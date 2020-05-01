package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author anshul
 */
public class grade {
    public static void main(String args[]){
        int markA1[] = new int[5];
        int i;
        float total=0,avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks of 5 subject");
        for(i=0; i<5; i++){
            markA1[i] = sc.nextInt();
            total = total + markA1[i];    
        }
        avg = total/5;
        System.out.println("garde of students");
        if(avg>80){
            System.out.println("A");
        }
        else if(avg > 60 && avg <= 80){
            System.out.println("B");
        }
        else if(avg > 40 && avg <= 60){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
        Scanner.close();
    }
}
        }
    }
    
}
