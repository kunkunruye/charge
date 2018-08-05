package net.inconnection.charge.extend.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBMap<M extends BaseBMap<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setDeviceId(java.lang.String deviceId) {
		set("device_id", deviceId);
		return (M)this;
	}
	
	public java.lang.String getDeviceId() {
		return getStr("device_id");
	}

	public M setEPoint(java.lang.Double ePoint) {
		set("e_point", ePoint);
		return (M)this;
	}
	
	public java.lang.Double getEPoint() {
		return getDouble("e_point");
	}

	public M setNPoint(java.lang.Double nPoint) {
		set("n_point", nPoint);
		return (M)this;
	}
	
	public java.lang.Double getNPoint() {
		return getDouble("n_point");
	}

	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public M setAddress(java.lang.String address) {
		set("address", address);
		return (M)this;
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public M setTel(java.lang.String tel) {
		set("tel", tel);
		return (M)this;
	}
	
	public java.lang.String getTel() {
		return getStr("tel");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

}
