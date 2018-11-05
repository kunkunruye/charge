package net.inconnection.charge.extend.model;

import net.inconnection.charge.extend.model.base.BaseTuser;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Tuser extends BaseTuser<Tuser> {
	public static final Tuser dao = new Tuser().dao();
	public static final Tuser me = new Tuser();

	public Tuser queryTuserByOpenId(String openId){
        Tuser tuser = me.findFirst("select * from tuser where openId= ?",openId);
        return tuser;
    }
}
