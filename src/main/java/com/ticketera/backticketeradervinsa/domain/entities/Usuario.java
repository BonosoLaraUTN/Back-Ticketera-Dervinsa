package com.ticketera.backticketeradervinsa.domain.entities;

import com.ticketera.backticketeradervinsa.domain.enums.Rol;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Usuario extends Base {

    private String email;
    private String clave;
    private Rol rol;


}
