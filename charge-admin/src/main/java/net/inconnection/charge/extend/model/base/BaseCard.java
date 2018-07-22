package net.inconnection.charge.extend.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseCard<M extends BaseCard<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public Integer getId() {
		return getInt("id");
	}

	public M setCardnumber(String cardnumber) {
		set("cardnumber", cardnumber);
		return (M)this;
	}
	
	public String getCardnumber() {
		return getStr("cardnumber");
	}

	public M setCreatetime(java.util.Date createtime) {
		set("createtime", createtime);
		return (M)this;
	}
	
	public java.util.Date getCreatetime() {
		return get("createtime");
	}

	public M setUpdatetime(java.util.Date updatetime) {
		set("updatetime", updatetime);
		return (M)this;
	}
	
	public java.util.Date getUpdatetime() {
		return get("updatetime");
	}

	public M setState(String state) {
		set("state", state);
		return (M)this;
	}
	
	public String getState() {
		return getStr("state");
	}

	public M setUid(Integer uid) {
		set("uid", uid);
		return (M)this;
	}
	
	public Integer getUid() {
		return getInt("uid");
	}

	public M setUname(String uname) {
		set("uname", uname);
		return (M)this;
	}
	
	public String getUname() {
		return getStr("uname");
	}

}