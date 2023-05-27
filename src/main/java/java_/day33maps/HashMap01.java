package java_.day33maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        //Ex: Verilan bir stirngde hangi harfin kaç defa kullanıldığını veren method oluşturunuz.
        //   "Hello Henry!"==> h=2, e=2. l=2. o =1,, n=1,r=1, y=1

        String s="Hello Henry!";

        System.out.println(getTheNumOfOccurenceOfLetters(s));


    }//main

    public static HashMap<String, Integer> getTheNumOfOccurenceOfLetters(String s){

        s=s.replaceAll("[^A-Za-z]","");
        //görünüm sayilerını depolamak için map oluştur77harf sırası olsun istiyorsak Treemap yaparız
        HashMap<String, Integer> numOfOccurence=new HashMap<>();
        //Harfleri al
       String letters[]= s.split("");
       //for each loop
        for(String w : letters){
            Integer numOfOcc= numOfOccurence.get(w);
            if(numOfOcc==null){
                numOfOccurence.put(w,1);
            }else{
                numOfOccurence.put(w,numOfOcc+1);
            }

        }
        return numOfOccurence;




    }

}//class
