package com.example.backendmentoria.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "sesion")
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;

    @Column(name = "fechaInicio", length = 60, nullable = false)
    private String fechaInicio;

    @Column(name = "fechaFin", length = 60, nullable = false)
    private String fechaFin;

    @Column(name = "link", length = 60, nullable = false)
    private String link;

    @Column(name = "mentor", length = 20, nullable = false)
    private String mentor;

    @Column(name = "anotaciones", length = 300, nullable = false)
    private String anotaciones;

    @Column(name = "iduser", nullable = false)
    private Integer iduser;

    @OneToMany( cascade = CascadeType.ALL, mappedBy = "sesion", fetch = FetchType.LAZY)
    private List<Horario> items;

}
