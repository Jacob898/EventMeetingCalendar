package org.spring.eventcalendar.eventmeetingcalendarbackend.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.spring.eventcalendar.eventmeetingcalendarbackend.user.User;
import org.spring.eventcalendar.eventmeetingcalendarbackend.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/events")

public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }


    @GetMapping
    public List<Event> getEvents() {
        return eventService.getEvents();
    }


}