package org.example.controllibre.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Incident {
    int id;
    String reference;
    String date;
    boolean status;
    int Membreid;
}
