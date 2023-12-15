public class SubString {

    int a = 0;
    int b = 0;
    int c = 0;

    public void subString(String s) {
        while(c < s.length()-1) {
            a = s.indexOf('@', c);
            b= s.indexOf('.',c);
            c= s.indexOf(';',c+1);
            System.out.println(s.substring(a+1,b));

        }

    }

    public static void main(String[] args) {

        SubString sub= new SubString();
        sub.subString("mail@yahoo.com;  bigpizza@mail.ru;   from@gmail.com;");
    }


}
