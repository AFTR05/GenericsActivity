package MatrixExample;

public class MatrixPrinter {
    public static <T> void imprimirArreglo(T[][] arreglo) {
        for (T[] fila : arreglo) {
            for (T elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[][] matrizEnteros = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matriz de enteros:");
        imprimirArreglo(matrizEnteros);

        Character[][] matrizCaracteres = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        System.out.println("Matriz de caracteres:");
        imprimirArreglo(matrizCaracteres);
    }
}
