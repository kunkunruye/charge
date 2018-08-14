package net.inconnnection.charge.cost.config;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.dialect.MysqlDialect;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import net.inconnection.charge.service.DemoService;
import net.inconnection.charge.service.dubboPlugin.DubboClientPlugin;
import net.inconnection.charge.service.dubboPlugin.IiossReferenceConfig;
import net.inconnnection.charge.cost.action.IndexAction;
import net.inconnnection.charge.cost.model.ChargeBatteryInfo;
import net.inconnnection.charge.cost.model.TUser;
import net.inconnnection.charge.cost.plugin.ActiveMQPlugin;

import java.io.File;

public class MainConfig extends JFinalConfig {



    public void configConstant(Constants me) {
        PropKit.use("config.properties");
        me.setDevMode(PropKit.getBoolean("devMode"));
        me.setEncoding("utf-8");
        me.setBaseUploadPath(PathKit.getWebRootPath() + File.separator + "myupload");
        me.setViewType(ViewType.JSP);
    }

    public void configRoute(Routes me) {
        me.add("/", IndexAction.class);
    }

    public void configPlugin(Plugins me) {
        C3p0Plugin c3p0Plugin = new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password"));
        ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
        arp.setShowSql(PropKit.getBoolean("devMode"));
        arp.setDialect(new MysqlDialect());
        arp.addMapping("charge_battery_info", ChargeBatteryInfo.class);
        arp.addMapping("tuser", TUser.class);
        me.add(c3p0Plugin);
        me.add(arp);
        ActiveMQPlugin p = new ActiveMQPlugin(PropKit.get("mqaddress"));
        p.start();
        me.add(p);


        //dubbo 客户端引入服务demo
        DubboClientPlugin dubboClientPlugin = new DubboClientPlugin("charge-cost",20882);

        //获取服务事例，传入对应接口类型和class
        ReferenceConfig<DemoService> reference = new IiossReferenceConfig<DemoService>().setServiceInterface(DemoService.class);

        //此方法获取到服务，
        DemoService service = dubboClientPlugin.getService(reference);
        // 也可以在任何其他地方直接从容器中获取 DemoService service = DubboServiceContrain.getInstance().getService(DemoService.class);
        //注解未实现！！！


        me.add(dubboClientPlugin);

    }

    public void configInterceptor(Interceptors me) {
    }

    public void configHandler(Handlers me) {
    }

    public static void main(String[] args) {
        JFinal.start("src/main/webapp", 8080, "/", 5);
    }
}

