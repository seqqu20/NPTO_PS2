public class Main {
    public static void main(String[] args) {
        // Tworzymy tablicę typu int z 5 elementami
        int[] liczby = {1, 2, 3, 4, 5};

        // Wyświetlamy wszystkie elementy tablicy
        System.out.println("Elementy tablicy:");
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + liczby[i]);
        }

        // Obliczamy sumę wszystkich elementów tablicy
        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        System.out.println("Suma elementów tablicy: " + suma);
    }
}
