package com.proyecto.practicas.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name ="postulaciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Postulacion {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha_postulacion")
    private Timestamp fecha;

    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    private  Usuario estudiante;

    @ManyToOne
    @JoinColumn(name = "idOferta")
    private OfertaPractica oferta;

}

