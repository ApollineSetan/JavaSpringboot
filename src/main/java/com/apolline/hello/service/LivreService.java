package com.apolline.hello.service;
import com.apolline.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class LivreService {

    private List<Livre> liste;

    public LivreService() {
        this.liste = new ArrayList<>();
    }

    public List<Livre> getListe() {
        return liste;
    }

    public void setListe(List<Livre> liste) {
        this.liste = liste;
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le titre : ");
        String titre = scanner.nextLine();

        System.out.println("Entrez la description : ");
        String description = scanner.nextLine();

        System.out.println("Entrez la date de publication : ");
        String datePublication = scanner.nextLine();

        System.out.println("Entrez le genre : ");
        String genre = scanner.nextLine();

        Livre livre = new Livre(titre, description, datePublication, genre);

        liste.add(livre);
        System.out.println("Le livre a été ajouté.");
    }

    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le titre du livre à supprimer.");
        String titre = scanner.nextLine();

        boolean livreSupprime = false;

        for (Livre livre : liste) {
            if (livre.getTitre().equals(titre)) {
                liste.remove(livre);
                System.out.println("Le livre a été supprimé avec succès.");
                livreSupprime = true;
                break;
            } else {
                System.out.println("Le livre n'existe pas");
            }
        }
    }

    public void findAll() {
        if (liste.isEmpty()){
            System.out.println("Aucun livre n'a été ajouté pour le moment.");
        } else {
            System.out.println("Liste des livres ajoutés :");
            for (Livre livre : liste) {
                System.out.println(livre);
            }
        }
    }

    public Livre getLivre(Livre livre){
        return livre;
    }
}
