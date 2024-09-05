package com.ticketera.backticketeradervinsa.controllers;

import com.ticketera.backticketeradervinsa.domain.entities.Comentario;
import com.ticketera.backticketeradervinsa.servicesimpl.ComentarioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/comentarios")
public class ComentarioController extends BaseControllerImpl<Comentario, ComentarioServiceImpl>{

    public ComentarioController(ComentarioServiceImpl service) {
        super(service);
    }

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            List<Comentario> coms = service.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(coms);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error al obtener todos los usuarios. Por favor intente luego\"}");
        }
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Comentario com) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.save(com));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error al guardar el cliente. Por favor intente luego\"}");
        }
    }
}