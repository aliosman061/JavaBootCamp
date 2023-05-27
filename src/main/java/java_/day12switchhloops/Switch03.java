package java_.day12switchhloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ülke ismi giriniz");
        String ülke = input.nextLine().toUpperCase();

        switch (ülke) {
            case "TÜRKİYE":
                System.out.println("TR");
                break;
            case "İNGİLTERE":
                System.out.println("ENG");
                break;
            case "AMERİKA":
                System.out.println("USA");
                break;
            case "ALMANYA":
                    System.out.println("DE");
                    break;
            case "İSPANYA":
                System.out.println("ES");
                break;
            case "FRANSA":
                System.out.println("FR");
                break;
            default:
                System.out.println("unknown"
                );

        }
    }
}
