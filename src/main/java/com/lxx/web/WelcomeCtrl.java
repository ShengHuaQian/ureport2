package com.lxx.web;

import com.bstek.ureport.export.ExportManager;
import com.bstek.ureport.export.html.HtmlReport;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试报表整合
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/9 17:28
 * @since JDK 1.8
 */
@Controller
public class WelcomeCtrl {

    @Autowired
    ExportManager manager;

    /**
     * 访问报表页面
     *
     * @param request 请求信息
     * @return 页面
     */
    @RequestMapping(value = "index")
    public String index(HttpServletRequest request) {
        Map<String, Object> parameters = new HashMap();
        HtmlReport report = manager.exportHtml("file:test.ureport.xml", request.getContextPath(), parameters);
        request.setAttribute("htmlReport", report);
        return "demo";
    }

    @RequestMapping(value = "chart")
    public String chart(HttpServletRequest request) {
        Map<String, Object> parameters = new HashMap();
        HtmlReport report = manager.exportHtml("file:bean.ureport.xml", request.getContextPath(), parameters);
        request.setAttribute("htmlReport", report);

        JSONArray array = JSONArray.fromObject(report.getChartDatas());
        request.setAttribute("chartDatas", array.toString());
        return "chart";
    }

}
