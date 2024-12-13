package org.example.controllibre.entity;

import lombok.Data;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Data
public class Membre {
private int id;
private String identifiant;
private String nom;
private String prenom;
private String email;
private String phone;
private List<Integer>incidents;
public boolean equals(Object o) {
    Membre membre = (Membre) o;
    if(membre.getIdentifiant() == this.identifiant){
        return true;
    }
   return false;
}
public int hashCode(Object o) {
    Membre membre = (Membre) o;
    return Objects.hashCode(membre);
}

}
