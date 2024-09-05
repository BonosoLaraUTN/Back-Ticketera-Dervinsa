package com.ticketera.backticketeradervinsa.servicesimpl;

import com.ticketera.backticketeradervinsa.domain.entities.Comentario;
import com.ticketera.backticketeradervinsa.repositories.ComentarioRepository;
import com.ticketera.backticketeradervinsa.services.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentarioServiceImpl extends BaseServiceImpl<Comentario, Long> implements ComentarioService {
    private ComentarioRepository comentarioRepository;

    @Autowired
    public ComentarioServiceImpl(ComentarioRepository comentarioRepository) {
        super(comentarioRepository);
        this.comentarioRepository = comentarioRepository;
    }
}
