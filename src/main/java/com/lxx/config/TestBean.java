package com.lxx.config;

import com.lxx.primary.domain.DcProduce;
import com.lxx.primary.domain.DcSalary;
import com.lxx.primary.repository.ProducRepository;
import com.lxx.primary.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * spring bean数据源
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/10 9:28
 * @since JDK 1.8
 */
@Component
public class TestBean {

    @Autowired
    private ProducRepository producRepository;

    @Autowired
    private SalaryRepository salaryRepository;

    /**
     * 配置薪水列表数据源
     *
     * @param dsName      数据源名称
     * @param datasetName 数据集名称
     * @param parameters  外部传入的参数Map
     * @return 薪水map列表数据
     */
    public List<Map> loadReportData(String dsName, String datasetName, Map<String, Object> parameters) {
        List<DcSalary> list = salaryRepository.findAll();
        List<Map> result = list.stream().map(dcProduce -> {
            Map map = new HashMap();
            map.put("月份", dcProduce.getMonth());
            map.put("姓名", dcProduce.getName());
            map.put("薪水", dcProduce.getSalary());
            map.put("年份", dcProduce.getYear());
            return map;
        }).collect(Collectors.toList());
        return result;
    }

    /**
     * 配置产品列表数据源
     *
     * @param dsName      数据源名称
     * @param datasetName 数据集名称
     * @param parameters  外部传入的参数Map
     * @return 产品pojo列表数据
     */
    public List<DcProduce> buildReport(String dsName, String datasetName, Map<String, Object> parameters) {
        List<DcProduce> list = producRepository.findAll();
        return list;
    }
}
