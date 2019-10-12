
package namabulanislam;

import java.util.Scanner;

public class Namabulanislam {

    public static void main(String[] args) {
        Scanner a = new  Scanner (System.in);
         System.out.println("            BELAJAR NAMA BULAN ISLAM                  ");
        System.out.println(" ************************************************ ");
        System.out.println(" Masukan BulanIslam (1-12:");
        int BulanIslam;
        BulanIslam =a.nextInt();
        
        
          if(BulanIslam > 12) 
            System.out.println("Bulan MAKSIMAL 12!!!");
        if (BulanIslam==1)
               System.out.println("Muharram");
            else if (BulanIslam==2)
                       System.out.println("Safar");
           else if (BulanIslam==3)
                       System.out.println("Rabi'ul Awal");
            else if (BulanIslam==4)
                       System.out.println("Rabi'ul Akhir");
           else if (BulanIslam==5)
                       System.out.println("Jumadil Awal");
            else if (BulanIslam==6)
                       System.out.println("Jumadil Akhir");
            else if (BulanIslam==7)
                       System.out.println("Rajab");
            else if (BulanIslam==8)
                       System.out.println("Sya'ban");
            else if (BulanIslam==9)
                       System.out.println("Ramadhan");
            else if (BulanIslam==10)
                       System.out.println("Syawal");
           else if (BulanIslam==11)
                       System.out.println("Dzulka'idah");
          else if (BulanIslam==12)
                       System.out.println("Dzulhijah");   
  
          }
    
}
