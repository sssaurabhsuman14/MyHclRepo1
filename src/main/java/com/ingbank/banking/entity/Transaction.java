package com.ingbank.banking.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 481246058631531758L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long txnId;
	
	private Double txnAmt;
	
	private Date txnDate;
	
	private String txnType;
	
	@ManyToOne
	private Account account;
	
	
	
	
	

}
