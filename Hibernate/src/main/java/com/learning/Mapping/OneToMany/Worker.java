package com.learning.Mapping.OneToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Worker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int workerId;
	private String workerName;
    
	@OneToMany(mappedBy="worker",cascade=CascadeType.ALL)
	private Set<Account> accounts;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String workerName, Set<Account> accounts) {
		super();
		this.workerName = workerName;
		this.accounts = accounts;
	}

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

}
