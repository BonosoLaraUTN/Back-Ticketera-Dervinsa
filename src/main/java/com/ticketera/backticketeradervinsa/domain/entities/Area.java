package com.ticketera.backticketeradervinsa.domain.entities;

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
public class Area extends Base {

    private String nombre;

    @OneToMany(mappedBy = "area",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @Builder.Default
    @JsonManagedReference("refRequerimientos")
    private Set<Requerimiento> requerimientos = new HashSet<>();

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @Builder.Default
    @JsonManagedReference("refGerentes")
    private Set<Usuario> gerentes = new HashSet<>();

}
