package classstring;

public class UtilsString {
    public static void iterationString(String str) {                             //1
        int a = 0;
        while(a < str.length()) {
            System.out.print(str.charAt(a));
            a++;
        }
        System.out.println();
    }

    public static void splitString(String str) {                                //2
        System.out.print(str.substring(0,str.lastIndexOf(".")) + " ");
        System.out.println(str.substring(str.lastIndexOf(".") + 1));
    }

    public static void outputArrayTxtElements(String[]str) {                     //3
        int n = 0;
        for (String value : str) {
            boolean end = value.endsWith(".txt");
            if (end) {
                n++;
            }
        }

        int m = 0;
        String[]str2 = new String[n];
        for (String s : str) {
            boolean end = s.endsWith(".txt");
            if (end) {
                str2[m] = s;
                System.out.print(str2[m] + " ");
                m++;
            }
        }
        System.out.println();
    }

    public static void outputArrayWithoutTxtElements(String[]str) {             //4
        int n = 0;
        for (String value : str) {
            boolean end = value.endsWith(".txt");
            if (!end) {
                n++;
            }
        }

        int m = 0;
        String[]str2 = new String[n];
        for (String s : str) {
            boolean end = s.endsWith(".txt");
            if (!end) {
                str2[m] = s;
                System.out.print(str2[m] + " ");
                m++;
            }
        }
        System.out.println();
    }

    public static void createStringRepeatingElements() {                          //5
        String oneHundredOnes = "1".repeat(100);
        System.out.println(oneHundredOnes);
    }

    public static void removeCertainArrayElements(String str) {        //6
        StringBuilder newStr = new StringBuilder(str);
        while (newStr.indexOf("3") != newStr.lastIndexOf("3")) {
            newStr.deleteCharAt(newStr.lastIndexOf("3"));
        }

        String str1 = str.substring(0, (str.indexOf("3") + 3));
        int n = 0;
        while(n + 8  <= str.length()) {
           str1 = str1.concat(str.substring((str.indexOf("3") + 1 + n), (str.indexOf("3") + 3 + n)));
            n += 3;
        }
        System.out.println(str1);
        System.out.println(newStr);


    }

    public static void convertIntArrayString(int[]arr) {           //7
        StringBuilder str = new StringBuilder();
        for (int j : arr) {
            str.append(j).append(" ");
        }
        System.out.println(str);
    }

    public static void sortStringAlphabetically(String str1, String str2, String str3) {       //8
        boolean resultCompare1 = str1.compareTo(str2) > 0;
        boolean resultCompare2 = str1.compareTo(str3) > 0;
        boolean resultCompare3 = str2.compareTo(str3) > 0;
        if(resultCompare1 && resultCompare2 && resultCompare3) {
            System.out.println(str3 + " " + str2 + " " + str1);
        }
        else if(resultCompare1 && resultCompare2) {
            System.out.println(str2 + " " + str3 + " " + str1);
        }
        else if(!resultCompare1 && resultCompare3 && resultCompare2) {
            System.out.println(str3 + " " + str1 + " " + str2);
        }
        else if(!resultCompare1 && resultCompare3) {
            System.out.println(str1 + " " + str3 + " " + str2);
        }
        else if(!resultCompare2 && !resultCompare3 && !resultCompare1) {
            System.out.println(str2 + " " + str1 + " " + str3);
        }
        else {
            System.out.println(str1 + " " + str2 + " " + str3);
        }
    }

    public static void countIdenticalElementString(String str, char a) {      //9
        char[]chars = str.toCharArray();
        int n = 0;
        for (char aChar : chars) {
            if (aChar == a) {
                n++;
            }
        }
        System.out.println("Количество повторений в строке: " + n);
    }

    public static void removeFirstGivenCharacters(String str, char symbol, int n) {         //10
        StringBuilder newStr = new StringBuilder(str);
        int cycle = 0;
        while (cycle < n) {
            int indexDeleteSymbol = newStr.indexOf(symbol + "");
            newStr.deleteCharAt(indexDeleteSymbol);
            cycle++;
        }
        System.out.print(newStr);
        System.out.println();
    }


    public static void expandString(String str) {          //11
        StringBuilder newStr = new StringBuilder();
        char[]chars = str.toCharArray();
        for(int i = chars.length - 1; i >= 0; i--) {
            newStr.append(chars[i]);
        }
        System.out.println(newStr);
    }

    public static void returnArrayWords(String str) {      //12
        String[]words = str.split(" ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}


