package org.example.controllibre.dao;

import org.example.controllibre.entity.Incident;

import java.sql.SQLException;
import java.util.Set;

public interface IncidentDao {
    public void insert(Incident incident) throws SQLException;
    public void inser(Set<Incident> incidents) throws SQLException;
}
