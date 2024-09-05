package com.ticketera.backticketeradervinsa.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Comentario extends Base {
    private String contenido;
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonIgnoreProperties({"tickets","area", "ticketsAsignados"})
    private Usuario usuario;
    @OneToMany(mappedBy = "comentario",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @Builder.Default
    @JsonIgnoreProperties({"comentario"})
    private Set<Respuesta> respuestas = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    @JsonIgnoreProperties({"comentarios"})
    private Ticket ticket;
}
