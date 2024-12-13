package org.example.controllibre.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.controllibre.entity.Membre;
import org.example.controllibre.service.MemberDaoImpl;
import org.w3c.dom.Text;

import java.sql.SQLException;
import java.util.UUID;

public class controllermembre {
    @FXML
    public Label membre;
    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;

    @FXML

    public void incrie() throws SQLException, ClassNotFoundException {
        MemberDaoImpl dao=new MemberDaoImpl();
        Membre membre1=new Membre();
        String indentifiant= UUID.randomUUID().toString();
        String nom = this.nom.getText();
        String prenom = this.prenom.getText();
        String email = this.email.getText();
        String phone = this.phone.getText();
        membre1.setIdentifiant(indentifiant);
        membre1.setNom(nom);
        membre1.setPrenom(prenom);
        membre1.setEmail(email);
        membre1.setPhone(phone);
        dao.insert(membre1);


    }

}
