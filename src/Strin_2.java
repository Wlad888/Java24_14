public class Strin_2 {

    public static void main(String[] args) {

        String str1 = "Big brother has gone, He came back, but was busted, So he went back again.";
        char c1;
        for (int i = 0; i < str1.length(); i++) {

            c1 = str1.charAt(i);

            if (c1 == 'B') {
                System.out.println();
                System.out.print(c1);


            } else if (c1 == 'H') {
                System.out.println();
                System.out.print(c1);


            } else if (c1 == 'S') {
                System.out.println();
                System.out.print(c1);

            } else {
                System.out.print(c1);
            }

        }
    }
}
