package com.rota.cards.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class Customer {

	private int customerId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
}
