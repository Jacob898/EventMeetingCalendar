package org.spring.eventcalendar.eventmeetingcalendarbackend.event;

import org.spring.eventcalendar.eventmeetingcalendarbackend.user.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service
public class EventService {

    public List<Event> getEvents() {
        return List.of(
                new Event(
                        1L,
                        "Wyjście do ZOO",
                        "Zoo zabawa tańce",
                        "null",
                        null,
                        null,
                        null,
                        new User(
                                2L,
                                "Krystian",
                                "Krystian"
                        )



                )
        );
    }
}
