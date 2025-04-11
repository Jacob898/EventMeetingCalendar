package org.spring.eventcalendar.eventmeetingcalendarbackend.user;

import java.util.List;

public class UserService {

    public List<User> getUsers() {
        return List.of(
                new User(
                        1L,
                        "Joe",
                        "Mama"
                )
        );
    }
}
