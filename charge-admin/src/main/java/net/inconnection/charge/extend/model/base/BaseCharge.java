package net.inconnection.charge.extend.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCharge<M extends BaseCharge<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setGname(java.lang.String gname) {
		set("gname", gname);
		return (M)this;
	}
	
	public java.lang.String getGname() {
		return getStr("gname");
	}

	public M setGid(java.lang.Integer gid) {
		set("gid", gid);
		return (M)this;
	}
	
	public java.lang.Integer getGid() {
		return getInt("gid");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public M setCardnum(java.lang.String cardnum) {
		set("cardnum", cardnum);
		return (M)this;
	}
	
	public java.lang.String getCardnum() {
		return getStr("cardnum");
	}

	public M setCardcs(java.lang.String cardcs) {
		set("cardcs", cardcs);
		return (M)this;
	}
	
	public java.lang.String getCardcs() {
		return getStr("cardcs");
	}

	public M setChargenum(java.lang.String chargenum) {
		set("chargenum", chargenum);
		return (M)this;
	}
	
	public java.lang.String getChargenum() {
		return getStr("chargenum");
	}

	public M setMoney(java.lang.String money) {
		set("money", money);
		return (M)this;
	}
	
	public java.lang.String getMoney() {
		return getStr("money");
	}

	public M setTotal(java.lang.String total) {
		set("total", total);
		return (M)this;
	}
	
	public java.lang.String getTotal() {
		return getStr("total");
	}

	public M setJointime(java.util.Date jointime) {
		set("jointime", jointime);
		return (M)this;
	}
	
	public java.util.Date getJointime() {
		return get("jointime");
	}

}
