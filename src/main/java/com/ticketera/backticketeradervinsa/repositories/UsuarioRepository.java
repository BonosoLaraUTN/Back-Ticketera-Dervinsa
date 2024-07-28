package com.ticketera.backticketeradervinsa.repositories;

import com.ticketera.backticketeradervinsa.domain.entities.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
    @Query("SELECT u FROM Usuario u WHERE u.email = :email")
    Usuario findUsuarioByEmail(@Param("email") String email);
}
