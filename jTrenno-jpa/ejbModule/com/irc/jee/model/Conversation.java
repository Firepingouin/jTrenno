package com.irc.jee.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the conversation database table.
 * 
 */
@Entity
@NamedQuery(name="Conversation.findAll", query="SELECT c FROM Conversation c")
public class Conversation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="day_time_begin")
	private Date dayTimeBegin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="day_time_end")
	private Date dayTimeEnd;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="caller_id")
	private Employee employee1;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="called_id")
	private Employee employee2;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="conversation")
	private List<Message> messages;

	public Conversation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDayTimeBegin() {
		return this.dayTimeBegin;
	}

	public void setDayTimeBegin(Date dayTimeBegin) {
		this.dayTimeBegin = dayTimeBegin;
	}

	public Date getDayTimeEnd() {
		return this.dayTimeEnd;
	}

	public void setDayTimeEnd(Date dayTimeEnd) {
		this.dayTimeEnd = dayTimeEnd;
	}

	public Employee getEmployee1() {
		return this.employee1;
	}

	public void setEmployee1(Employee employee1) {
		this.employee1 = employee1;
	}

	public Employee getEmployee2() {
		return this.employee2;
	}

	public void setEmployee2(Employee employee2) {
		this.employee2 = employee2;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Message addMessage(Message message) {
		getMessages().add(message);
		message.setConversation(this);

		return message;
	}

	public Message removeMessage(Message message) {
		getMessages().remove(message);
		message.setConversation(null);

		return message;
	}

}