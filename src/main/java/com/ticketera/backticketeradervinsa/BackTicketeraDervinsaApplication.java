package com.ticketera.backticketeradervinsa;

import com.ticketera.backticketeradervinsa.repositories.*;
import com.ticketera.backticketeradervinsa.domain.entities.*;
import com.ticketera.backticketeradervinsa.domain.enums.*;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackTicketeraDervinsaApplication {

    private static final Logger logger = LoggerFactory.getLogger(BackTicketeraDervinsaApplication.class);

    @Autowired
    private AreaRepository areaRepository;

    @Autowired
    private RequerimientoRepository requerimientoRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public static void main(String[] args) {
        SpringApplication.run(BackTicketeraDervinsaApplication.class, args);
        logger.info("Usar: http://localhost:8080/h2-console/");
    }

    @Bean
    @Transactional
    CommandLineRunner init(AreaRepository areaRepository,
                           RequerimientoRepository requerimientoRepository,
                           TicketRepository ticketRepository,
                           UsuarioRepository usuarioRepository)
    {
        return args -> {

            logger.info("----------------ESTOY----FUNCIONANDO---------------------");



        };
    }


}
