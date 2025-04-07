package com.andrehlb.chatmultigeracao.controller;

import com.andrehlb.chatmultigeracao.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final List<Ticket> tickets = new ArrayList<>();

    // GET /tickets
    @GetMapping
    public List<Ticket> listarTickets() {
        return tickets;
    }

    // POST /tickets
    @PostMapping
    public Ticket criarTicket(@RequestBody Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }
}
