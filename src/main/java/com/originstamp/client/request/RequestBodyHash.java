package com.originstamp.client.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Thomas on 10.01.17.
 *
 * @author Thomas Hepp
 *         the class is a DTO which is parsed to JSON by Jersey and represents a request body for POST requests
 */
@XmlRootElement(name = "body")
public class RequestBodyHash {
    @XmlElement(name = "email")
    private String email;
    @XmlElement(name = "comment")
    private String comment;
    @XmlElement(name = "submit_ops")
    private String[] submitOps;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String[] getSubmitOps() {
        return submitOps;
    }

    public void setSubmitOps(String[] submitOps) {
        this.submitOps = submitOps;
    }
}
