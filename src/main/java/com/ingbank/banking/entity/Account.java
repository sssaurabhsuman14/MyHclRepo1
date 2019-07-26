package com.ingbank.banking.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account implements Serializable {
	
	private static final long serialVersionUID = 320982071978387864L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accId;
	
	private Double balance;
	
	@ManyToOne
	Customer customer;
	
	@OneToMany(mappedBy = "account")
	List<Transaction> transactions;

}
