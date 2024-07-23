package com.ticketera.backticketeradervinsa.repositories;

import com.ticketera.backticketeradervinsa.domain.entities.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends BaseRepository<Ticket, Long> {
}
