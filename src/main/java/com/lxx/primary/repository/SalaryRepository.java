package com.lxx.primary.repository;

import com.lxx.primary.domain.DcSalary;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 薪水repository
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/10 11:05
 * @since JDK 1.8
 */
public interface SalaryRepository extends JpaRepository<DcSalary, Long> {

}
