package ddq.model;

import java.io.Serializable;
import java.util.*;

public class DebtLog implements Serializable{
	/*id int NOT NULL AUTO_INCREMENT,
	timestamp timestamp,
	uid int,
	operation int,
	debt double,
	currency int,
	rate double,
	flowid int COMMENT '负债流水id',*/
	private static final long serialVersionUID = 5138984773718311912L;
	int id;
	Date timestamp;
	int uid;
	int operation;
	double debt;
	int currency;
	double rate;
	int flowid;
	int userlogid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getOperation() {
		return operation;
	}
	public void setOperation(int operation) {
		this.operation = operation;
	}
	public double getDebt() {
		return debt;
	}
	public void setDebt(double debt) {
		this.debt = debt;
	}
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getFlowid() {
		return flowid;
	}
	public void setFlowid(int flowid) {
		this.flowid = flowid;
	}
	public int getUserlogid() {
		return userlogid;
	}
	public void setUserlogid(int userlogid) {
		this.userlogid = userlogid;
	}

}
