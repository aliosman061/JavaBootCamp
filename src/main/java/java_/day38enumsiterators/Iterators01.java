package java_.day38enumsiterators;

import java.util.*;

/*
ListIterator kullanmak icin yeni bir List yaptik. Elemanlarini add methodu ile ekledik.
yourList. yapinca methodlari gorduk ve ListIterator'i sectik. Bu bize String verecek. Listimizi ListIterator'a
cevirecek.
ListIterator<String> konteynerina yourListItr'yi assign ettik.
While loop kullandik ve parantez icinde listIterator'imizin ismini yazip nokta koyunca methodlari gorduk.
Methodlardan has.Next() methodunu secip condition olarak yazdik. Daha sonra ListItaretor'imizi kullanarak
baska methodlara baktik, Iterator'a oranla daha fazla method oldugunu gorduk.
Oradaki next methodunu aldik, next methodumuzu el isimli String'e assign ettik.ve devaminda yine
ListIterator'imiz ismini yazip nokta koyduk ve set methodunu aldik.
set methodu icine el + "!" yazarak her elamanin onundeki pointeri alip o elemanin uzerinden atlayip bir sonrakinin
onune poiter'i koymasini sagladik. Ancak her atlayista uzerinden atlanan elemanin yanina ! isareti eklenecek, cunku
biz set methodu ile bunu istedik. Set methodu icinde concatination yaptik.
Sout icine listimizin ismini yazinca ekrana [Tom!, Jim!, Clara!] yazildi. has.Next nethodu calisirken son elemandan
sonra bir eleman olmadigi anlasilinca false olur ve loop kirilir. Pointer en saga gelmeden hasPrevious methodunu
kullanamayiz. Kullanirsak bastaki elemanin oncesinde eleman olmadigindan loop kirilir.
 */

public class Iterators01 {

         /*
        1)Iterator'lar loop'larin yaptigi ayni isi yapar.
        2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
        3)Iterator'lar ile loop'lar arasinda performan farki yoktur.
        4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basrilidir.
        5)Iki tip iterator var; i)Iterator: Bu sadece eleman silmede kullanilir,
                                            eleman eklemek veya elemani degistirmek mumkun degildir.
                                ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.
                                Note:"Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
                                     "ListIterator" ise iki yonlu calisabilir.
     */

        public static void main(String[] args) {

            List<String> myList = new ArrayList<>();
            myList.add("Tom");
            myList.add("Jim");
            myList.add("Clara");
            myList.add("Angie");
            myList.add("Mark");
            System.out.println(myList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

            //"Iterator" kullanalim
            Iterator<String> myItr = myList.iterator();    // [ Tom,   Jim,   Clara,   Angie,   Mark ]

            while(myItr.hasNext()){//hasNext() pointer'a "Senden sonra eleman var mi?" diye sorar.
                //Eleman varsa "true" yoksa "false" return eder.
                myItr.next();//next() pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
                myItr.remove();//next() methodunun return ettigi elemani siler.
            }
            System.out.println(myList);// [ ]

            //ListIterator kullanalim
            List<String> yourList = new ArrayList<>();
            yourList.add("Tom");
            yourList.add("Jim");
            yourList.add("Clara");
            System.out.println(yourList);// [ Tom,   Jim,   Clara ]

            ListIterator<String> yourListItr = yourList.listIterator();

            while (yourListItr.hasNext()){
                String el = yourListItr.next();
                yourListItr.set(el + "!");//set() methodu list'i update etmeye yarar.
            }
            System.out.println(yourList);// [ Tom!,   Jim!,   Clara! ]

            //hasPrevious() ve previous() nasil kullanilir?
            while(yourListItr.hasPrevious()){

                String el = yourListItr.previous();
                System.out.println(el);
                yourListItr.set("?" + el);

            }
            System.out.println(yourList);// [ ?Tom!,   ?Jim!,   ?Clara! ]

            //En sondan en basa nasil iterate edebiliriz?
            LinkedList<String> ourList = new LinkedList<>();
            ourList.add("Tom");
            ourList.add("Jim");
            ourList.add("Clara");
            ourList.add("Angie");
            ourList.add("Mark");
            System.out.println(ourList);

            Iterator<String> ourListItr = ourList.descendingIterator();// descendingIterator() ancak LinkedList ile kulanilabilir.

            while(ourListItr.hasNext()){
                String el = ourListItr.next();
                System.out.println(el);
            }
    }
    }



