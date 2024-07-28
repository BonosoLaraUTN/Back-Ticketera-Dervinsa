package com.ticketera.backticketeradervinsa.servicesimpl;

import com.ticketera.backticketeradervinsa.domain.entities.Usuario;
import com.ticketera.backticketeradervinsa.repositories.UsuarioRepository;
import com.ticketera.backticketeradervinsa.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService {
    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        super(usuarioRepository);
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario findUsuarioByEmail(String email) {
        return usuarioRepository.findUsuarioByEmail(email);
    }
}
