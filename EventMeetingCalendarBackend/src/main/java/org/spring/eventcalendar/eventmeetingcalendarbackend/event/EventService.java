package org.spring.eventcalendar.eventmeetingcalendarbackend.event;

import org.spring.eventcalendar.eventmeetingcalendarbackend.user.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EventService {

    public List<Event> getEvents() {
        return List.of(
                new Event(

                )
        );
    }
}
