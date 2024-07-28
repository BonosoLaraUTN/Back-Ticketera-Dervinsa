package com.ticketera.backticketeradervinsa.servicesimpl;


import com.ticketera.backticketeradervinsa.domain.entities.Area;
import com.ticketera.backticketeradervinsa.repositories.AreaRepository;
import com.ticketera.backticketeradervinsa.services.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl extends BaseServiceImpl<Area, Long> implements AreaService {

    private AreaRepository areaRepository;

    @Autowired
    public AreaServiceImpl(AreaRepository areaRepository) {
        super(areaRepository);
        this.areaRepository = areaRepository;
    }
}
