package org.example.controllibre.service;

import org.example.controllibre.Connexion;
import org.example.controllibre.dao.MembreDao;
import org.example.controllibre.entity.Incident;
import org.example.controllibre.entity.Membre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDaoImpl implements MembreDao {
    private Connection conn;

    public MemberDaoImpl() throws SQLException, ClassNotFoundException {
        Connexion con =new Connexion();
        conn=con.getCon();

    }
    @Override
    public void insert(Membre membre) throws SQLException {

        String sql = "insert into members(identifiant, nom, prenom, email, phone) values(?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, membre.getIdentifiant());
        pstmt.setString(2, membre.getNom());
        pstmt.setString(3, membre.getPrenom());
        pstmt.setString(4, membre.getEmail());
        pstmt.setString(5, membre.getPhone());
        pstmt.executeUpdate();

    }

    @Override
    public List<Incident> chargerListincident() throws SQLException {
        String sql = "select * from incident";
        PreparedStatement pstmt = conn.prepareStatement(sql);
       List<Incident> incidents = new ArrayList<Incident>();
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Incident incident = new Incident();
            incident.setId(rs.getInt("id"));
            incident.setReference(rs.getString("reference"));
            incident.setDate(rs.getString("date"));
            incident.setMembreid(rs.getInt("membreid"));
            incidents.add(incident);
        }
        return incidents;


    }

}
