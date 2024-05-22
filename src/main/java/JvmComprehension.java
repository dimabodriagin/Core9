
public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1
        Object o = new Object();        // 2 из Bootstrap ClassLoader подгружается класс Object
        Integer ii = 2;                 // 3 из Bootstrap ClassLoader подгружается класс Integer
        printAll(o, i, ii);             // 4
        System.out.println("finished"); // 7 удаляются объекты o, ii и строка "finished"
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5
        System.out.println(o.toString() + i + ii);  // 6 удаляются объекты uselessVar и строка o.toString() + i + ii
    }
}
