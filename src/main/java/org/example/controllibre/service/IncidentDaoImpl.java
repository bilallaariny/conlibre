package org.example.controllibre.service;

import org.example.controllibre.Connexion;
import org.example.controllibre.dao.IncidentDao;
import org.example.controllibre.entity.Incident;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class IncidentDaoImpl implements IncidentDao {
    Connection conn;
    public IncidentDaoImpl() throws SQLException, ClassNotFoundException {
        Connexion con=new Connexion();
        conn=con.getCon();
    }
    @Override
    public void insert(Incident incident) throws SQLException {
        String sql = "insert into incident values(?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,incident.getReference());
        pstmt.setString(2,incident.getDate());
        pstmt.setBoolean(3,incident.isStatus());
        pstmt.setInt(4,incident.getMembreid());
        pstmt.executeUpdate();


    }

    @Override
    public void inser(Set<Incident> incidents) throws SQLException {
        for (Incident incident : incidents) {
            insert(incident);
        }

    }
}
