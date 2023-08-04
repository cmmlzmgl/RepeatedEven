import java.util.*;

public class RepeatedEven {

    public static void main(String[] args) {
        int[] liste = {4, 5, 7, 4, 8, 10, 24, 8, 27, 29, 10, 31, 34, 54};
        List<Integer> tekrarEdenler = new ArrayList<>();

        for (int i = 0; i < liste.length; i++) {
            if (liste[i] % 2 == 0 && tekrarEdenler.contains(liste[i])) {
                System.out.println(liste[i]);
            } else {
                tekrarEdenler.add(liste[i]);
            }
        }
    }
}
