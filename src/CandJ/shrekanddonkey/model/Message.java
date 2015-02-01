/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandJ.shrekanddonkey.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Jayson
 */
public class Message implements Serializable {
    private String question;
    private String statement;
    private String reply;

    public Message() {
    }
    
    

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "Message{" + "question=" + question + ", statement=" + statement + ", reply=" + reply + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.question);
        hash = 23 * hash + Objects.hashCode(this.statement);
        hash = 23 * hash + Objects.hashCode(this.reply);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.statement, other.statement)) {
            return false;
        }
        if (!Objects.equals(this.reply, other.reply)) {
            return false;
        }
        return true;
    }
    
    
}
