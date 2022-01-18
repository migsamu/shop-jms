package org.iesfm.shop.jms.pojos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Email {

    private String title;
    private String to;
    private String body;

    @JsonCreator
    public Email(
            @JsonProperty("title") String title,
            @JsonProperty("to") String to,
            @JsonProperty("body") String body) {
        this.title = title;
        this.to = to;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(title, email.title) && Objects.equals(to, email.to) && Objects.equals(body, email.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, to, body);
    }

    @Override
    public String toString() {
        return "Email{" +
                "title='" + title + '\'' +
                ", to='" + to + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
