package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
    private String course;
    private String duration;

    public Certificate() {
    }

    public Certificate(String course, String duration) {
        this.course = course;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.course = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
