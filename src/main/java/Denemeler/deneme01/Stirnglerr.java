package Denemeler.deneme01;

public class Stirnglerr {


    public static void main(String[] args) {

        String cumle="Ah java vah javsa sen ne güzelsin java";

        System.out.println(cumle.indexOf("java"));
        System.out.println(cumle.split(" ")[3]);
        System.out.println(cumle.contains("a"));
        System.out.println(cumle.startsWith("A"));
        System.out.println(cumle.endsWith("a"));
        System.out.println(cumle.substring(5));
        System.out.println(cumle.length());
        System.out.println(cumle.trim());
        System.out.println(cumle.lastIndexOf("a"));
        System.out.println(cumle.replace("a", "*"));
        System.out.println(cumle.replaceAll("[\\s]", "*"));
        System.out.println(cumle.charAt(13));

    }
}
