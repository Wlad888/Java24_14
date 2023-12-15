public class Strin_3 {

    public static void main(String[] args) {

        String str1 = "The boy has got an apple";
        String str2 = " and he is giving it to me";
        System.out.println(str1.indexOf('a'));
        System.out.println(str1.indexOf("apple"));
        System.out.println(str1.indexOf("got", 11));
        System.out.println(str1.startsWith("he",1));
        System.out.println(str1.charAt(14));
        System.out.println(str1.endsWith("an"));
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(0,9));
        System.out.println(str1.replace('b', 'c'));
        System.out.println(str1.replace("boy", "girl"));
        System.out.println(str1.concat(str2));
        String str3 = str1.substring(0,3).toLowerCase().concat(str1.substring(3));
        System.out.println(str3);
        System.out.println(str1);
        System.out.println(str1.contains("its"));






    }
}
