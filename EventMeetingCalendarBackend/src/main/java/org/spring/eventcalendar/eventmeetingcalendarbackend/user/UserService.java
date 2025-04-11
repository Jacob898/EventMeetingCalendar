package org.spring.eventcalendar.eventmeetingcalendarbackend.user;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "Joe",
                        "Mama"
                )
                ,
                new User(
                        2L,
                        "Ligma",
                        "Kule"
                )
        );
    }
}
