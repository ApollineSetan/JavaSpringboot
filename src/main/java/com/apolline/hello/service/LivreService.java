package com.apolline.hello.service;
import com.apolline.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LivreService {
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le titre : ");
        String titre = scanner.nextLine();

        System.out.println("Entrez la description : ");
        String description = scanner.nextLine();

        System.out.println("Entrez la date de publication : ");
        String datePublication = scanner.nextLine();

        Livre livre = new Livre(titre, description, datePublication);
        System.out.println("Le livre ajouté est : " + livre);
    }

    public Livre getLivre(Livre livre){
        return livre;
    }
}
