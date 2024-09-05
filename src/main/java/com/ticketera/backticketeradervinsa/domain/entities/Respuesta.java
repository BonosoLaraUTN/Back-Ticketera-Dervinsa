package com.ticketera.backticketeradervinsa.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Respuesta extends Base{
    private String contenido;
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonIgnoreProperties({"tickets","area", "ticketsAsignados"})
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "comentario_id")
    @JsonIgnoreProperties({"respuestas"})
    private Comentario comentario;
}
