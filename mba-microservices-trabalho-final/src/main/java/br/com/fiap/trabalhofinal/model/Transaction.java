package br.com.fiap.trabalhofinal.model;

import com.wordnik.swagger.annotations.ApiModelProperty;


public class Transaction {

	@ApiModelProperty(notes = "Tempo da transacao em millisegundos no timezone UTC")
	private long timestamp;
	
	@ApiModelProperty(notes = "Valor da transacao")
	private double amount;


	public Transaction(long currentTimeMillis, double d) {
		// TODO Auto-generated constructor stub
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
