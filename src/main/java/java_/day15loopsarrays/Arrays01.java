package java_.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Array nasil olusturulur?
        String stdNames[] = new String[5];

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null] <== null'lar String'in default degerleridir.

        //Array'e nasil eleman eklenir?
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));// [Ajda, Ayhan, Kemal, Cuneyt, Filiz]

        //ex: stdNames arrayindeki her ismin sonuna yıldız koyun.
        for (int i = 0; i< stdNames.length; i++){
            System.out.println(stdNames[i]+ "*");
        }


        for(String w : stdNames){
            System.out.println(w+ "*");
        }


        int sayı[]= new int[5];
       sayı[0]=11;
       sayı[1]=12;
       sayı[2]=13;
       sayı[3]=14;
       sayı[4]=15;
        System.out.println(Arrays.toString(sayı));//[11, 12, 13, 14, 15]

        int sum=0;
        for(int w : sayı){

            sum = sum + w ;

        }
        System.out.println(sum);


        char initials[]= new char[3];
        initials[0]='A';
        initials[1]='B';
        initials[2]='C';
        System.out.println(Arrays.toString(initials));//[A, B, C]

        int carpim = 1;

        for(char w : initials){
            carpim = carpim * w;
        }
        System.out.println(carpim);





    }//main
}//class
