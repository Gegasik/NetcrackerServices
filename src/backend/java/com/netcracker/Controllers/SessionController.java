package com.netcracker.Controllers;

import com.netcracker.entity.Session;
import com.netcracker.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/sessions")
public class SessionController {
    @Autowired
    private SessionService sessionService;


    @RequestMapping(value = "/{sessionId}", method = RequestMethod.GET)
    public ResponseEntity getSessionById(@PathVariable(value = "sessionId") Long SessionId) {
        Optional<Session> session = sessionService.getSessionById(SessionId);
        return session.isPresent() ? ResponseEntity.ok(session.get()) :
                ResponseEntity.badRequest().body("invalid Session Id");
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Session> getAll() {
        return sessionService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Session save(@RequestBody Session session) {
        return sessionService.save(session);
    }

    @RequestMapping(value = "/{idSession}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "idSession") Long id) {
        sessionService.delete(id);
    }

    @RequestMapping(value = "{idSession}/count", method = RequestMethod.GET)
    public Long countTicketPurchased(@PathVariable(value = "idSession") Long id) {
        return sessionService.getPurchasedSessionTicket(id);
    }

    @RequestMapping(value = "film/", method = RequestMethod.GET)
    public List findSessionsByFilm(@RequestParam(name = "film") Long idFilm) {
        return sessionService.findByFilmId(idFilm);
    }
    @RequestMapping(value = "date/{date}", method = RequestMethod.GET)
    public List findSessionsByDate(@PathVariable(value = "date") Long date) {
        return sessionService.findByDate(date);
    }
}
