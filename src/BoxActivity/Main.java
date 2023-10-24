package BoxActivity;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox=new Box<>();
        Box<Long> longBox=new Box<>();
        Box<Double> doubleBox=new Box<>();
        Box<Float> floatBox=new Box<>();
        integerBox.add(10);
        longBox.add(105L);
        doubleBox.add(196.45);
        floatBox.add(8654.21f);

        System.out.printf("Valor de intergerBox es: %d%n", integerBox.getValue());
        System.out.printf("Valor de longBox es: %d%n",longBox.getValue());
        System.out.printf("Valor de doubleBox es: %f%n",doubleBox.getValue());
        System.out.printf("Valor de floatBox es: %f%n",floatBox.getValue());
    }
}