package com.ticketera.backticketeradervinsa.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ticketera.backticketeradervinsa.domain.enums.Rol;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Usuario extends Base {

    private String email;
    private String urlPic;

    @OneToMany(mappedBy = "usuario",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @Builder.Default
    @JsonIgnoreProperties({"usuario"})
    private Set<Ticket> tickets = new HashSet<>();

    @ManyToOne
    @JoinColumn
    private Area area;
    private Rol rol;
}
