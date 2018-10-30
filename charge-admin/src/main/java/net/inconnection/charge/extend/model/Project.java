package net.inconnection.charge.extend.model;

import net.inconnection.charge.extend.model.base.BaseProject;

import java.util.List;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Project extends BaseProject<Project> {
	public static final Project dao = new Project().dao();
    public static final Project me = new Project();
    public List<Project> findAll() {
        return this.find("select * from yc_project");
    }

    public List<Project> getProjectByLoginUser() {
        Company company = Company.dao.getCompanyByLoginUser();
        if(1 == company.getId()){
            return null;
        }
        return this.find("select * from yc_project where company_id =" + company.getId());

    }
}
