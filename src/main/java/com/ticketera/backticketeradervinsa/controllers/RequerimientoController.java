package com.ticketera.backticketeradervinsa.controllers;

import com.ticketera.backticketeradervinsa.domain.entities.Area;
import com.ticketera.backticketeradervinsa.domain.entities.Requerimiento;
import com.ticketera.backticketeradervinsa.servicesimpl.AreaServiceImpl;
import com.ticketera.backticketeradervinsa.servicesimpl.RequerimientoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/requerimientos")
public class RequerimientoController extends BaseControllerImpl<Requerimiento, RequerimientoServiceImpl> {

    public RequerimientoController(RequerimientoServiceImpl service) {
        super(service);
    }

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            List<Requerimiento> requerimientos = service.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(requerimientos);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error al obtener todos los usuarios. Por favor intente luego\"}");
        }
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Requerimiento requerimiento) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.save(requerimiento));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error al guardar el cliente. Por favor intente luego\"}");
        }
    }
}
