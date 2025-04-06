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

        // Znajdowanie największego i najmniejszego elementu w tablicy
        int najwieksza = liczby[0];
        int najmniejsza = liczby[0];

        for (int i = 1; i < liczby.length; i++) {
            if (liczby[i] > najwieksza) {
                najwieksza = liczby[i];
            }
            if (liczby[i] < najmniejsza) {
                najmniejsza = liczby[i];
            }
        }
        System.out.println("Największy element tablicy: " + najwieksza);
        System.out.println("Najmniejszy element tablicy: " + najmniejsza);

        // Odwrócenie tablicy
        System.out.println("Tablica po odwróceniu:");
        for (int i = liczby.length - 1; i >= 0; i--) {
            System.out.println(liczby[i]);
        }

        // Wyszukiwanie liczby w tablicy
        int szukanaLiczba = 3;
        boolean znaleziono = false;
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] == szukanaLiczba) {
                znaleziono = true;
                System.out.println("Liczba " + szukanaLiczba + " znajduje się w tablicy.");
                break;
            }
        }
        if (!znaleziono) {
            System.out.println("Liczba " + szukanaLiczba + " nie znajduje się w tablicy.");
        }
    }
}
