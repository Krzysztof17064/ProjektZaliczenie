package app;


import java.util.Date;

public class Zadanie {
    private int id;
    private String tytul;
    private String opis;
    private Date dataUtworzenia;

    public Zadanie(int id, String tytul, String opis, Date dataUtworzenia) {
        this.id = id;
        this.tytul = tytul;
        this.opis = opis;
        this.dataUtworzenia = dataUtworzenia;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }
}
