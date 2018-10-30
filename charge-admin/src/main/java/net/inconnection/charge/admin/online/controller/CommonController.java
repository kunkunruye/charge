package net.inconnection.charge.admin.online.controller;

import com.jfinal.plugin.activerecord.Record;
import com.jfinal.upload.UploadFile;
import net.inconnection.charge.admin.account.common.annotation.ClearAuth;
import net.inconnection.charge.admin.common.DBTool;
import net.inconnection.charge.admin.common.base.BaseController;
import net.inconnection.charge.admin.common.util.StringUtil;
import net.inconnection.charge.admin.online.model.CommonFile;

import java.util.List;

/**
 * 用来存放一些公共地址（无权限控制）的controller
 */
@ClearAuth
public class CommonController extends BaseController {

	//获得字典数据
	public void getDictData() {
		Object[] queryParams = getQueryParams();
		String[] properties = (String[]) queryParams[0];
		String[] symbols = (String[]) queryParams[1];
		Object[] values = (Object[]) queryParams[2];
		
		String orderBy = getOrderBy();
		if(StringUtil.isEmpty(orderBy)) {
			orderBy = "id desc";
		}
        List<Record> sys_dict = DBTool.findByMultProperties("sys_dict", properties, symbols, values);
        renderJson(DBTool.findByMultProperties("sys_dict", properties, symbols, values));
	}	
	
	//图标页面
	public void iconsPage() {
		render("common/icons.html");
	}
	
	//文件上传
	public void uploadFile() {
		UploadFile file = getFile("upload", "images", 1024 * 1024 * 5);	//上传文件不能大于5M
		if(file != null) {
			//保存日志
			new CommonFile().set("type", 1)	//1表示图片
				.set("path", file.getFileName())
				.set("sys_user_id", getSessionUser().get("id"))
				.save();
			renderJson("/upload/images/" + file.getFileName());
		}else {
			renderFailed();
		}
	}

	// 定时任务页面
	public void taskPage() {
		render("common/task.html");
	}
}
