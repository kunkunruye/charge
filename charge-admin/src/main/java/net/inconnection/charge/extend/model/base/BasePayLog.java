package net.inconnection.charge.extend.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePayLog<M extends BasePayLog<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public Integer getId() {
		return getInt("id");
	}

	public M setUserid(Integer userid) {
		set("userid", userid);
		return (M)this;
	}
	
	public Integer getUserid() {
		return getInt("userid");
	}

	public M setUsername(String username) {
		set("username", username);
		return (M)this;
	}
	
	public String getUsername() {
		return getStr("username");
	}

	public M setStarttime(java.util.Date starttime) {
		set("starttime", starttime);
		return (M)this;
	}
	
	public java.util.Date getStarttime() {
		return get("starttime");
	}

	public M setEndtime(java.util.Date endtime) {
		set("endtime", endtime);
		return (M)this;
	}
	
	public java.util.Date getEndtime() {
		return get("endtime");
	}

	public M setJointime(java.util.Date jointime) {
		set("jointime", jointime);
		return (M)this;
	}
	
	public java.util.Date getJointime() {
		return get("jointime");
	}

	public M setStatus(Integer status) {
		set("status", status);
		return (M)this;
	}
	
	public Integer getStatus() {
		return getInt("status");
	}

	public M setMoney(String money) {
		set("money", money);
		return (M)this;
	}
	
	public String getMoney() {
		return getStr("money");
	}

	public M setType(String type) {
		set("type", type);
		return (M)this;
	}
	
	public String getType() {
		return getStr("type");
	}

	public M setOpenid(String openid) {
		set("openid", openid);
		return (M)this;
	}
	
	public String getOpenid() {
		return getStr("openid");
	}

}
