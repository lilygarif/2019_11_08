public class NewTask {

    public static void main(String[] args) {

        String str = "ice-cream";
        char change = 'e';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == change) {
                System.out.print('E');
            } else {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println();

        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == change) {
                a[i] = '0';
            }
        }
        for (char b : a) {
            System.out.print(b);
        }
        System.out.println();

    }
}








