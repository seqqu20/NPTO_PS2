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

        // Obliczamy średnią
        double srednia = (double) suma / liczby.length;
        System.out.println("Średnia elementów tablicy: " + srednia);

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

        // Sprawdzanie, czy tablica jest posortowana rosnąco
        boolean posortowanaRosnaco = true;
        for (int i = 0; i < liczby.length - 1; i++) {
            if (liczby[i] > liczby[i + 1]) {
                posortowanaRosnaco = false;
                break;
            }
        }
        System.out.println("Tablica jest posortowana rosnąco: " + posortowanaRosnaco);

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

        // Usuwanie elementu z tablicy
        int indeksDoUsuniecia = 2; // Usuwamy element o indeksie 2 (liczba 3)
        if (indeksDoUsuniecia >= 0 && indeksDoUsuniecia < liczby.length) {
            System.out.println("Usuwamy element o indeksie " + indeksDoUsuniecia + ": " + liczby[indeksDoUsuniecia]);
            int[] nowaTablica = new int[liczby.length - 1];
            for (int i = 0, j = 0; i < liczby.length; i++) {
                if (i != indeksDoUsuniecia) {
                    nowaTablica[j++] = liczby[i];
                }
            }
            liczby = nowaTablica;
            System.out.println("Tablica po usunięciu elementu:");
            for (int i = 0; i < liczby.length; i++) {
                System.out.println("Element " + (i + 1) + ": " + liczby[i]);
            }
        } else {
            System.out.println("Niepoprawny indeks do usunięcia.");
        }

        // Zmiana elementu w tablicy
        int indeksDoZmiany = 1; // Zmieniamy element o indeksie 1 (liczba 2)
        int nowaWartosc = 10;
        if (indeksDoZmiany >= 0 && indeksDoZmiany < liczby.length) {
            System.out.println("Zmiana elementu o indeksie " + indeksDoZmiany + " z " + liczby[indeksDoZmiany] + " na " + nowaWartosc);
            liczby[indeksDoZmiany] = nowaWartosc;
            System.out.println("Tablica po zmianie elementu:");
            for (int i = 0; i < liczby.length; i++) {
                System.out.println("Element " + (i + 1) + ": " + liczby[i]);
            }
        } else {
            System.out.println("Niepoprawny indeks do zmiany.");
        }
    }
}
