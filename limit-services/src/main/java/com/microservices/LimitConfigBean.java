package com.microservices;

public class LimitConfigBean {
private int min;
private int max;

protected LimitConfigBean() {
	super();
	// TODO Auto-generated constructor stub
}

public LimitConfigBean(int min, int max) {
	super();
	this.min = min;
	this.max = max;
}

public int getMin() {
	return min;
}

public void setMin(int min) {
	this.min = min;
}
public int getMax() {
	return max;
}
public void setMax(int max) {
	this.max = max;
}

}
