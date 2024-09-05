package com.ticketera.backticketeradervinsa.servicesimpl;


import com.ticketera.backticketeradervinsa.domain.entities.Respuesta;
import com.ticketera.backticketeradervinsa.repositories.RespuestaRepository;
import com.ticketera.backticketeradervinsa.services.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaServiceImpl extends BaseServiceImpl<Respuesta, Long> implements RespuestaService {
    private RespuestaRepository respuestaRepository;

    @Autowired
    public RespuestaServiceImpl(RespuestaRepository respuestaRepository) {
        super(respuestaRepository);
        this.respuestaRepository = respuestaRepository;
    }
}
