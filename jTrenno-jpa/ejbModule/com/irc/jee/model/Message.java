package com.irc.jee.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the message database table.
 * 
 */
@Entity
@Table(name = "message")
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="sent_date")
	private Date sentDate;

	//bi-directional many-to-one association to Conversation
	@ManyToOne
	private Conversation conversation;

	public Message() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSentDate() {
		return this.sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	public Conversation getConversation() {
		return this.conversation;
	}

	public void setConversation(Conversation conversation) {
		this.conversation = conversation;
	}

}