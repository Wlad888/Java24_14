public class Strin {
    public static void main(String[] args) {

        String str1 = "Big brother has gone, He came back, but was busted, So he went back again.";
        String str2 = str1.toUpperCase();
        char c1;
        char c2;

        for (int i = 0; i < str1.length(); i++) {

             c1 = str1.charAt(i);
             c2= str2.charAt(i);

             if(c1 != ' ' &&  c1 != ',' && c1 != '.' && c1==c2) {
                 System.out.println();
                 System.out.print(c1);
                 continue;
             }
            System.out.print(c1);
        }
    }
}