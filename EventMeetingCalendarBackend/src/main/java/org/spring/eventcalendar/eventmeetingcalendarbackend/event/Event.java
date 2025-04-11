package org.spring.eventcalendar.eventmeetingcalendarbackend.event;

import org.spring.eventcalendar.eventmeetingcalendarbackend.user.User;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

public class Event {
    private Long id;
    private String title;
    private String description;
    private String link;
    private Collection<User> participatingUsers;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private User creator;

    public Event() {

    }

    public Event(String title, String description, String link, Collection<User> participatingUsers, LocalDateTime startDate, LocalDateTime endDate, User creator) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.participatingUsers = participatingUsers;
        this.startDate = startDate;
        this.endDate = endDate;
        this.creator = creator;
    }

    public Event(Long id, String title, String description, String link, Collection<User> participatingUsers, LocalDateTime startDate, LocalDateTime endDate, User creator) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.link = link;
        this.participatingUsers = participatingUsers;
        this.startDate = startDate;
        this.endDate = endDate;
        this.creator = creator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Collection<User> getParticipatingUsers() {
        return participatingUsers;
    }

    public void setParticipatingUsers(Collection<User> participatingUsers) {
        this.participatingUsers = participatingUsers;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}
