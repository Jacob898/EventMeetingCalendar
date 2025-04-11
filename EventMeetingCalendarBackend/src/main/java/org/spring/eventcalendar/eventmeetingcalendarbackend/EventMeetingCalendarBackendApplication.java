package org.spring.eventcalendar.eventmeetingcalendarbackend;

import org.spring.eventcalendar.eventmeetingcalendarbackend.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class EventMeetingCalendarBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventMeetingCalendarBackendApplication.class, args);
    }



}
