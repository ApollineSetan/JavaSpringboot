package com.apolline.hello.model;

public class Livre {
    private String titre;
    private String description;
    private String datePublication;

    public Livre() {}

    public Livre(String titre, String description, String datePublication) {
        this.titre = titre;
        this.description = description;
        this.datePublication = datePublication;
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

    @Override
    public String toString() {
        return titre +
                ", publié en " + datePublication + ". " +
                description + ".";
    }
}
