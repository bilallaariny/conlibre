package org.example.controllibre.dao;

import org.example.controllibre.entity.Incident;
import org.example.controllibre.entity.Membre;

import java.sql.SQLException;
import java.util.List;

public interface MembreDao {
 public void   insert(Membre membre) throws SQLException;
 public List<Incident> chargerListincident() throws SQLException;
}
