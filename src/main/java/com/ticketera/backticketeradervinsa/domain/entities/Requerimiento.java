package com.ticketera.backticketeradervinsa.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Requerimiento extends  Base{

    private String descripcion;

    @OneToMany(mappedBy = "requerimiento",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @Builder.Default
    @JsonIgnoreProperties({"requerimiento"})
    private Set<Ticket> tickets = new HashSet<>();


    @ManyToOne
    @JoinColumn(name = "area_id")
    @JsonIgnoreProperties({"requerimientos"})
    private Area area;

}
