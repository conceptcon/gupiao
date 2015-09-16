package ddq.model;

import java.io.Serializable;
import java.util.*;

public class StockFlow implements Serializable{
	private static final long serialVersionUID = 5138984773718311002L;

	/*
	id int NOT NULL AUTO_INCREMENT,
	timestamp timestamp,
	position int,
    price double,
    uid int,
	stockid nvarchar(30),
    flowid int COMMENT '现金流水ID及融资流水',
    flowtype int,
    lastprice double COMMENT '预留字段',
    ctype int COMMENT '预留字段',
    currency int,
    status int, 
	 */
	int operation;
	int id;
	Date timestamp;
	int position;
	double price;
	int uid;
	String stockid;
	int cashflowid;
	int debtflowid;
	double feeprice;
	int ctype;
	int currency;
	int status;
	String remark;
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
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public int getCashflowid() {
		return cashflowid;
	}
	public void setCashflowid(int cashflowid) {
		this.cashflowid = cashflowid;
	}
	public int getDebtflowid() {
		return debtflowid;
	}
	public void setDebtflowid(int debtflowid) {
		this.debtflowid = debtflowid;
	}
	public double getFeeprice () {
		return feeprice ;
	}
	public void setFeeprice (double feeprice ) {
		this.feeprice  = feeprice ;
	}
	public int getCtype() {
		return ctype;
	}
	public void setCtype(int ctype) {
		this.ctype = ctype;
	}
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getOperation() {
		return operation;
	}
	public void setOperation(int operation) {
		this.operation = operation;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getUserlogid() {
		return userlogid;
	}
	public void setUserlogid(int userlogid) {
		this.userlogid = userlogid;
	}
}
