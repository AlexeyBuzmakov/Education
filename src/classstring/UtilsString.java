package classstring;

public class UtilsString {
    public static void iterationString(String str) {
        int a = 0;
        while(a < str.length()) {
            System.out.print(str.charAt(a) + " ");
            a++;
        }
        System.out.println();
    }

    public static void splitString(String str) {
        System.out.print(str.substring(0,str.lastIndexOf(".")) + " ");
        System.out.println(str.substring(str.lastIndexOf(".") + 1));
    }

    public static void outputArrayTxtElements(String[]str) {
        int n = 0;
        for (int i = 0; i < str.length; i++) {
            boolean end = str[i].endsWith(".txt");
            if (end) {
                n++;
            }
        }

        int m = 0;
        String[]str2 = new String[n];
        for(int i = 0; i < str.length; i++) {
            boolean end = str[i].endsWith(".txt");
            if(end) {
                str2[m] = str[i];
                System.out.print(str2[m] + " ");
                m++;
            }
        }
        System.out.println();
    }

    public static void outputArrayWithoutTxtElements(String[]str) {
        int n = 0;
        for (int i = 0; i < str.length; i++) {
            boolean end = str[i].endsWith(".txt");
            if (!end) {
                n++;
            }
        }

        int m = 0;
        String[]str2 = new String[n];
        for(int i = 0; i < str.length; i++) {
            boolean end = str[i].endsWith(".txt");
            if(!end) {
                str2[m] = str[i];
                System.out.print(str2[m] + " ");
                m++;
            }
        }
        System.out.println();
    }

    public static void createStringRepeatingElements() {
        String oneHundredOnes = "1".repeat(100);
        System.out.println(oneHundredOnes);
    }

    public static void removeCertainArrayElements(String numbers) {
        System.out.println(numbers.substring(numbers.indexOf("3") + 1));

    }
}

