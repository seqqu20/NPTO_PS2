public class Main {
    public static void main(String[] args) {
        int[] liczby = {1, 2, 3, 4, 5};

        System.out.println("Elementy tablicy:");
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + liczby[i]);
        }

        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma += liczby[i];
        }
        System.out.println("Suma elementów tablicy: " + suma);

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

        System.out.println("Tablica po odwróceniu:");
        for (int i = liczby.length - 1; i >= 0; i--) {
            System.out.println(liczby[i]);
        }

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
