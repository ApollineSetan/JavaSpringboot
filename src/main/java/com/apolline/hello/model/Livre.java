package com.apolline.hello.model;

public class Livre {
    private String titre;
    private String description;
    private String datePublication;
    private String genre;

    public Livre() {}

    public Livre(String titre, String description, String datePublication, String genre) {
        this.titre = titre;
        this.description = description;
        this.datePublication = datePublication;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return titre +
                ", publié en " + datePublication + " est un livre de genre " + genre + ". " +
                description + ".";
    }
}
