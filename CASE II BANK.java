
package tugasalgho;
import java.util.Scanner;
public class TUGASALGHO {
public static void main(String[] args) {
 int [] uang = new int [5];
       int sum =0;
       Scanner s = new Scanner (System.in);
       for (int a=0;a<5;a++){
       System.out.println("Masukkan jumlah uang : ");
       //uang[0]=1000
       //uang [1]=2000
       //dst
       uang [a]=s.nextInt();  
       System.out.println("uang  = " + uang [a]);   
        //seleksi nilai uang  
        if (uang [a]<= 15000){
            System.out.println("disimpan");
            if (uang [a]<10000){
            System.out.println("Mohon Tukar uang anda ke Bank Terdekat");    
        }
        } 
        else {
            uang [a]=0;
            System.out.println("uang tidak disimpan");
        }
         
        
    }
        s.close();
        System.out.println("hasil simpanan");
        for(int a = 0; a<uang.length; a++)
        {  
            System.out.println(uang[a]+ " ");
            sum = uang[a]+sum;         
}
        System.out.println("jumlah simpanan anda "+sum);
    }
}
    
   
    

