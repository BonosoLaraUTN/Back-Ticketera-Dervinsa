package com.ticketera.backticketeradervinsa.servicesimpl;

import com.ticketera.backticketeradervinsa.domain.entities.Ticket;
import com.ticketera.backticketeradervinsa.repositories.TicketRepository;
import com.ticketera.backticketeradervinsa.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl extends BaseServiceImpl<Ticket, Long> implements TicketService {
    private TicketRepository ticketRepository;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        super(ticketRepository);
        this.ticketRepository = ticketRepository;
    }
}
