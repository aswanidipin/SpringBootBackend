package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Trades")
public class Trade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int version;
	private String counterPartId;
	private String bookId;
	private String maturityDate;
	private String createdDate;
	private char expiredStatus;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getCounterPartId() {
		return counterPartId;
	}
	public void setCounterPartId(String counterPartId) {
		this.counterPartId = counterPartId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public char getExpiredStatus() {
		return expiredStatus;
	}
	public void setExpiredStatus(char expiredStatus) {
		this.expiredStatus = expiredStatus;
	}
	public Trade(int version, String counterPartId, String bookId, String maturityDate, String createdDate,
			char expiredStatus) {
		super();
		this.version = version;
		this.counterPartId = counterPartId;
		this.bookId = bookId;
		this.maturityDate = maturityDate;
		this.createdDate = createdDate;
		this.expiredStatus = expiredStatus;
	}
	
	public Trade()
	{
		
	}

}
