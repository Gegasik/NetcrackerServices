package com.nc.Controllers;

import com.nc.models.Session;
import com.nc.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @RequestMapping(value = "/{sessionId}", method = RequestMethod.GET)
    public ResponseEntity<Session> getSessionFilmById(@PathVariable(value = "sessionId") Long SessionId) {
        Session session = sessionService.getSessionById(SessionId).get();
        return ResponseEntity.ok(session);
    }

    @RequestMapping(value = "/film/{filmId}", method = RequestMethod.GET)
    public List<Session> getSessionsByFilmId(@PathVariable(value = "filmId") Long idFilm) {
        return sessionService.findByFilmId(idFilm);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Session> getAll(@RequestParam(value = "date",required = false) String date) {

        return sessionService.getAll(date);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Session save(@RequestBody Session session) {
        return sessionService.save(session);
    }


    @RequestMapping(value = "/{idSession}", method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "idSession") Long id) {
        sessionService.delete(id);
    }

    @RequestMapping(value = "/{idSession}/count", method = RequestMethod.GET)
    public Long countPurchasedTicket(@PathVariable(value = "idSession") Long id){
        return sessionService.getCountPurchasedSessionTicker(id);
    }


}
