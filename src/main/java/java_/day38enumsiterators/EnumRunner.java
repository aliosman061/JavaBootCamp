package java_.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {

       String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);

        String abbreviatonOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviatonOfFlorida);

        UsStatesEnum alaska = UsStatesEnum.ALASKA;
        System.out.println(alaska);

        String stateName =UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName);

        String abbreviationOfAlaska=UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);


    }
}
