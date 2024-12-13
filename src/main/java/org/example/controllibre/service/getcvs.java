package org.example.controllibre.service;

import org.example.controllibre.entity.Membre;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class getcvs {
    public List<Membre> getMembres(String cv) throws IOException {
        List<Membre> membres = new ArrayList<Membre>();
        String membre;

        BufferedReader br = new BufferedReader(new FileReader(cv));
        while ((membre=br.readLine())!= null) {
            Membre membre1 = new Membre();
            String[] split = membre.split(",");
            membre1.setNom(split[0]);
            membre1.setPrenom(split[1]);
            membre1.setEmail(split[2]);
            membre1.setPhone(split[3]);
            for(Membre membre2 : membres) {
               if (!(membre2.getNom().equals(membre1.getNom()) &&
                       membre2.getPrenom().equals(membre1.getPrenom())&&
                       membre2.getEmail().equals(membre1.getEmail())&&
                       membre2.getPhone().equals(membre1.getPhone()))) {
                   membres.add(membre1);
               }
            }

        }

  return membres;  }
}
