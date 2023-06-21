package app;


import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ZadaniaManager manager = new ZadaniaManager();

        Zadanie zadanie1 = new Zadanie(1, "Zadanie 1", "Opis zadania 1", new Date());
        Zadanie zadanie2 = new Zadanie(2, "Zadanie 2", "Opis zadania 2", new Date());

        manager.dodajZadanie(zadanie1);
        manager.dodajZadanie(zadanie2);


        for (Zadanie zadanie : manager.pobierzWszystkieZadania()) {
            System.out.println("ID: " + zadanie.getId());
            System.out.println("Tytuł: " + zadanie.getTytul());
            System.out.println("Opis: " + zadanie.getOpis());
            System.out.println("Data utworzenia: " + zadanie.getDataUtworzenia());
            System.out.println("---------------------");
        }

        manager.usunZadanie(1);

        Zadanie znalezioneZadanie = manager.znajdzZadaniePoId(2);
        if (znalezioneZadanie != null) {
            System.out.println("Znalezione zadanie:");
            System.out.println("ID: " + znalezioneZadanie.getId());
            System.out.println("Tytuł: " + znalezioneZadanie.getTytul());
            System.out.println("Opis: " + znalezioneZadanie.getOpis());
            System.out.println("Data utworzenia: " + znalezioneZadanie.getDataUtworzenia());
        } else {
            System.out.println("Zadanie o podanym ID nie zostało znalezione.");
        }
    }
}