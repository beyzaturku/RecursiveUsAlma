
package recursiveusalma;
import java.util.*;

public class RecursiveUsAlma {

     static boolean UsAlma(int us, int taban){
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri giriniz:");
        taban = input.nextInt();
        System.out.println("Üs değerini giriniz:");
        us = input.nextInt();

        int sonuc = 1;

        if(us==0){
            sonuc = 1;
        }
        else if(us<0){
            System.out.println("Lütfen pozitif bir değer giriniz.");
        }
        else{
            for(int i=1; i<=us; i++){
                sonuc *= taban;
            }
        }

        System.out.println("Sonuç:" +sonuc);
        return true;

    }
    public static void main(String[] args) {
        do{
            UsAlma(0, 0);
        }
        while(true);
       
    }
    
}
