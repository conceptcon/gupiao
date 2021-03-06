package ddq.model;

import java.io.Serializable;
import java.util.*;

public class StockUser implements Serializable{
	private static final long serialVersionUID = 5138984773718311007L;
	
	/*
	 * id int NOT NULL AUTO_INCREMENT,
	uid int,
	stockid nvarchar(10),
	position int COMMENT '持仓',
    costprice double COMMENT '成本价',
    updatedate datetime COMMENT '更新时间',
    createdate datetime COMMENT '创建时间',
    dilutedprice double COMMENT '摊薄价', 
	int buynum;
	int sellnum;
	double buycash;
	double sellcash;
	 */
	
	int id;
	int uid;
	String  stockid;
	int position;
	double costprice;
	Date updatedate;
	Date createdate;
	double dilutedprice;
	int buynum;
	int sellnum;
	double buycash;
	double sellcash;
	String market;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public double getCostprice() {
		return costprice;
	}
	public void setCostprice(double costprice) {
		this.costprice = costprice;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public double getDilutedprice() {
		return dilutedprice;
	}
	public void setDilutedprice(Double dilutedprice) {
		this.dilutedprice = dilutedprice;
	}
		
	public int getBuynum() {
		return buynum;
	}
	public void setBuynum(int buynum) {
		this.buynum = buynum;
	}
	public int getSellnum() {
		return sellnum;
	}
	public void setSellnum(int sellnum) {
		this.sellnum = sellnum;
	}
	public double getBuycash() {
		return buycash;
	}
	public void setBuycash(double buycash) {
		this.buycash = buycash;
	}
	public double getSellcash() {
		return sellcash;
	}
	public void setSellcash(double sellcash) {
		this.sellcash = sellcash;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	
	
	
}
