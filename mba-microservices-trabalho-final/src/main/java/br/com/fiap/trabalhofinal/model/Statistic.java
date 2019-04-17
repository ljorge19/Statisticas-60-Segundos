package br.com.fiap.trabalhofinal.model;

import com.wordnik.swagger.annotations.ApiModelProperty;

public class Statistic {

	@ApiModelProperty(notes = "Total da soma das transacoes dos ultimos 60 segundos")
	private double sum = 0.0;
	
	@ApiModelProperty(notes = "Valor mínimo das transacoes dos ultimos 60 segundos")
	private double min = 0.0;
	
	@ApiModelProperty(notes = "Valor máximo das transacoes dos ultimos 60 segundos")
	private double max = 0.0;
	
	@ApiModelProperty(notes = "Media dos valores das transacoes dos ultimos 60 segundos")
	private double avg = 0.0;
	
	@ApiModelProperty(notes = "Numero total das transacoes dos ultimos 60 segundos")
	private long count = 0;

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
	
	
}
