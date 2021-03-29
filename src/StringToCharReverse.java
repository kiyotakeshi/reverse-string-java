public class StringToCharReverse {

    public static char[] charToString(String original) {
        char[] c = original.toCharArray();
        int begin = 0;
        int end = c.length -1;
        char tmp;
        while(end>begin){
            tmp = c[begin];
            c[begin] = c[end];
            c[end] = tmp;
            end--;
            begin++;
        }
        return c;
    }
}
