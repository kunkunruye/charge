package net.inconnection.charge.extend.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTuserCharge<M extends BaseTuserCharge<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setTuserid(java.lang.Integer tuserid) {
		set("tuserid", tuserid);
		return (M)this;
	}
	
	public java.lang.Integer getTuserid() {
		return getInt("tuserid");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setCharge(java.lang.Integer charge) {
		set("charge", charge);
		return (M)this;
	}
	
	public java.lang.Integer getCharge() {
		return getInt("charge");
	}

	public M setLast(java.lang.Integer last) {
		set("last", last);
		return (M)this;
	}
	
	public java.lang.Integer getLast() {
		return getInt("last");
	}

	public M setJointime(java.util.Date jointime) {
		set("jointime", jointime);
		return (M)this;
	}
	
	public java.util.Date getJointime() {
		return get("jointime");
	}

}
