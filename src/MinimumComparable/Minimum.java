package MinimumComparable;

public class Minimum {
    public static <T extends Comparable<T>> T minimum(T a, T b, T c, T d, T e) {
        T min = a;
        if (b.compareTo(min) < 0) {
            min = b;
        }
        if (c.compareTo(min) < 0) {
            min = c;
        }
        if (d.compareTo(min) < 0) {
            min = d;
        }
        if (e.compareTo(min) < 0) {
            min = e;
        }
        return min;
    }

    public static void main(String[] args) {
        Integer a = 10, b = 5, c = 15, d = 3, e = 7;
        Integer minimumInteger = minimum(a, b, c, d, e);
        System.out.printf("El valor mínimo de los enteros es: %d%n", minimumInteger);

        Double x = 3.14, y = 2.71, z = 2.5, w = 2.0, v = 3.0;
        Double minimumDouble = minimum(x, y, z, w, v);
        System.out.printf("El valor mínimo de los doubles es: %.2f%n", minimumDouble);

        String s1 = "apple", s2 = "orange", s3 = "banana", s4 = "grape", s5 = "cherry";
        String minimumString = minimum(s1, s2, s3, s4, s5);
        System.out.printf("El valor mínimo de las cadenas es: %s%n", minimumString);
    }
}
