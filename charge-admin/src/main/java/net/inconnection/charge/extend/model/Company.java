package net.inconnection.charge.extend.model;

import com.jfinal.log.Log;
import net.inconnection.charge.extend.model.base.BaseCompany;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Company extends BaseCompany<Company> {
    private static final Log log = Log.getLog(Company.class);
	public static final Company dao = new Company().dao();
	public static final Company me = new Company();

    public List<Company> getCompanyByAgentId(Long userId ) {
        log.info("查询用户拥有的所有公司的id:" );
        List<Company> companies = dao.find("select * from yc_company where admin_id = ?" ,new Object[]{userId});
        log.info("查询所有运营商公司信息:" + companies);
        return companies;
    }
}
