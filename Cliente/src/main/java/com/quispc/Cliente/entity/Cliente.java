package com.quispc.Cliente.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Direccion;
    private String Telefono;
    private String Documento;
}
