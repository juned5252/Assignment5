package StringsDemo;

public class StringsDemo {

    public static void main(String[] args) {

        String str = "Welcome To Jurassic Park";

        System.out.println(str.isEmpty());
        System.out.println(str.charAt(5));
        System.out.println(str.contains("To"));
        System.out.println(str.length());
        System.out.println(str.compareTo(str.toLowerCase()));
        System.out.println(str.concat(" : The Lost World"));
        System.out.println(str.endsWith("Park"));
        System.out.println(str.equals("Get to the Choppa"));
        System.out.println(str.equalsIgnoreCase(str.toLowerCase()));
        System.out.println(str.hashCode());
        System.out.println(str.getClass());
        System.out.println(str.subSequence(8,str.length()));
        System.out.println(str.substring(str.indexOf("Jurassic"),str.indexOf("Park")-1));
        System.out.println(str.toCharArray());

        for (String s:str.split("")) {
            System.out.println(s);
        }

        System.out.println(str.replace("Park","World"));
        System.out.println(str.contentEquals(new StringBuffer("Welcome To Jurassic Park")));


    }

}
