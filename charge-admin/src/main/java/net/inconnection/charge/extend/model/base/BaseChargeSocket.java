package net.inconnection.charge.extend.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseChargeSocket<M extends BaseChargeSocket<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setChargePileId(java.lang.Long chargePileId) {
		set("charge_pile_id", chargePileId);
		return (M)this;
	}
	
	public java.lang.Long getChargePileId() {
		return getLong("charge_pile_id");
	}

	public M setSn(java.lang.Integer sn) {
		set("sn", sn);
		return (M)this;
	}
	
	public java.lang.Integer getSn() {
		return getInt("sn");
	}

	public M setIsUsed(java.lang.Boolean isUsed) {
		set("is_used", isUsed);
		return (M)this;
	}
	
	public java.lang.Boolean getIsUsed() {
		return get("is_used");
	}

	public M setStartPower(java.lang.Long startPower) {
		set("start_power", startPower);
		return (M)this;
	}
	
	public java.lang.Long getStartPower() {
		return getLong("start_power");
	}

	public M setChargePower(java.lang.Long chargePower) {
		set("charge_power", chargePower);
		return (M)this;
	}
	
	public java.lang.Long getChargePower() {
		return getLong("charge_power");
	}

	public M setChargeIntensity(java.lang.Long chargeIntensity) {
		set("charge_intensity", chargeIntensity);
		return (M)this;
	}
	
	public java.lang.Long getChargeIntensity() {
		return getLong("charge_intensity");
	}

	public M setChargeTime(java.lang.Long chargeTime) {
		set("charge_time", chargeTime);
		return (M)this;
	}
	
	public java.lang.Long getChargeTime() {
		return getLong("charge_time");
	}

	public M setChargeState(java.lang.Integer chargeState) {
		set("charge_state", chargeState);
		return (M)this;
	}
	
	public java.lang.Integer getChargeState() {
		return getInt("charge_state");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}
	
	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

}
