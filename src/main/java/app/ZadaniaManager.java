package app;


import java.util.ArrayList;
import java.util.List;


public class ZadaniaManager {
    private List<Zadanie> zadania;

    public ZadaniaManager() {
        zadania = new ArrayList<>();
    }

    public void dodajZadanie(Zadanie zadanie) {
        zadania.add(zadanie);
    }

    public void usunZadanie(int id) {
        zadania.removeIf(z -> z.getId() == id);
    }

    public List<Zadanie> pobierzWszystkieZadania() {
        return zadania;
    }

    public Zadanie znajdzZadaniePoId(int id) {
        for (Zadanie zadanie : zadania) {
            if (zadanie.getId() == id) {
                return zadanie;
            }
        }
        return null;
    }
}
