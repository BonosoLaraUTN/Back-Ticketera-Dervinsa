package com.ticketera.backticketeradervinsa.controllers;

import com.ticketera.backticketeradervinsa.domain.entities.Area;
import com.ticketera.backticketeradervinsa.domain.entities.Usuario;
import com.ticketera.backticketeradervinsa.servicesimpl.AreaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/areas")
public class AreaController extends BaseControllerImpl<Area, AreaServiceImpl> {

    public AreaController(AreaServiceImpl service) {
        super(service);
    }

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            List<Area> areas = service.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(areas);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error al obtener todos los usuarios. Por favor intente luego\"}");
        }
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Area area) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.save(area));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error al guardar el cliente. Por favor intente luego\"}");
        }
    }
}
