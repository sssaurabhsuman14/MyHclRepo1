package com.ingbank.banking.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CustomerModel implements Serializable{
	
	
	private static final long serialVersionUID = 2551779748579382325L;

	private Long cusId;
	
	private String userName;
	
	private String email;
	
	private String phoneNumber;
	
	List<AccountModel> accounts;
	
	
	

}
