package com.ticketera.backticketeradervinsa.repositories;

import com.ticketera.backticketeradervinsa.domain.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
}
