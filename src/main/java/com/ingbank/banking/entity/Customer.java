package com.ingbank.banking.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1102723228898397097L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cusId;
	
	private String userName;
	
	private String email;
	
	private String phoneNumber;
	
	@OneToMany(mappedBy = "customer")
	List<Account> accounts;
	
	
	

}
