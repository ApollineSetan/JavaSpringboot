package com.apolline.hello.controller;

import com.apolline.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class LivreController {

    @Autowired
    private LivreService livreService;

    public void router(){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choisissez une action");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Supprimer un livre");
            System.out.println("3. Afficher les livres");
            System.out.println("4. Quitter");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    livreService.add();
                    break;

                case 2:
                    livreService.remove();
                    break;

                case 3:
                    livreService.findAll();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Fermeture du programme.");
                    break;

                default:
                    System.out.println("Choix incorrect.");
                    break;
            }
        }
    }
}
