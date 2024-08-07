package com.ticketera.backticketeradervinsa.controllers;

import com.ticketera.backticketeradervinsa.domain.entities.Ticket;
import com.ticketera.backticketeradervinsa.domain.entities.Usuario;
import com.ticketera.backticketeradervinsa.servicesimpl.TicketServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/tickets")
public class TicketController extends BaseControllerImpl<Ticket, TicketServiceImpl>{

    public TicketController(TicketServiceImpl service) {
        super(service);
    }

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            List<Ticket> tickets = service.findAll();
            return ResponseEntity.status(HttpStatus.OK).body(tickets);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error al obtener todos los usuarios. Por favor intente luego\"}");
        }
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Ticket ticket) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.save(ticket));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error al guardar el cliente. Por favor intente luego\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Ticket ticket) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(ticket));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Error al actualizar el ticket. Por favor intente luego\"}");
        }
    }
}
