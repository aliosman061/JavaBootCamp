package java_.day14loops;

import java.util.Scanner;

public class loops03 {
    public static void main(String[] args) {
       /* int k=1;
        do{
            System.out.println("do while loop" );
            k++;
        }while(k>1);*/

        //kullanıcı bir sayı girsin sayi 100den küçük ise kullanici "kazandiniz" mesajı alsın
        // diğer durumlarda "kaybettiniz" mesajı alsın.

        Scanner input= new Scanner(System.in);



        do{
            System.out.println("Please enter an integer...");
            int n = input.nextInt();
            if(n<100){
                System.out.println("kazandınız");
            }else{
                System.out.println("kaybettiniz");
                break;
            }


        }while(true);


        //kullanicidan alinan bir cümlenin büyük harfle baslayip baslamadigini kontrol eden kodu yazınız.
            Scanner input2 =new Scanner(System.in);
        do{
            System.out.println("Please enter a word");
            String s = input2.nextLine();

            if(s.endsWith(".") &&(s.charAt(0)>= 'A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is coorect grammatically");
            }else{
                System.out.println("Your sentence has grammatical mistake");
                break;
            }
        }while(true);



    }//main
}//class
