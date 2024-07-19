public class Main {
    public static void main(String[] args) {
        System.out.println("3'e bölünebilen sayılar:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println("\n5'e bölünebilen sayılar:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println("\nHem 3'e hem de 5'e bölünebilen sayılar:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
