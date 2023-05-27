package java_.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {
        
        short num = 260;
        byte numByte= (byte) num;
        System.out.println("numByte = " + numByte);
        
        short num2 = 1023;
        byte numByte2 = (byte) num2;
        System.out.println("numByte2 = " + numByte2);
        /*
Explicit Narrowing yaparken dikkat edilmeli .
Cunku Cok Ciddi Data kaybi hatta Datanin degismesine neden olabilir.
Eger sayimiz donusturmeye calistigimiz variable'in sinirlari
disinda ise; Java sayiyi mod islemine alir ve kalani yazdirir.
Kalan bolenin yarisindan fazlaysa kalan sayiyi Java kucultmek ister ve
 bolumu 1 buyuterek kalani (-)isaretli olacak sekilde yazdirir


*/


    }//main
    
}//class
