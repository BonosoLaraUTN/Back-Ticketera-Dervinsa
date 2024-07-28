package com.ticketera.backticketeradervinsa.servicesimpl;

import com.ticketera.backticketeradervinsa.domain.entities.Requerimiento;
import com.ticketera.backticketeradervinsa.repositories.RequerimientoRepository;
import com.ticketera.backticketeradervinsa.services.RequerimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequerimientoServiceImpl extends BaseServiceImpl<Requerimiento, Long> implements RequerimientoService {
    private RequerimientoRepository requerimientoRepository;

    @Autowired
    public RequerimientoServiceImpl(RequerimientoRepository requerimientoRepository) {
        super(requerimientoRepository);
        this.requerimientoRepository = requerimientoRepository;
    }
}
