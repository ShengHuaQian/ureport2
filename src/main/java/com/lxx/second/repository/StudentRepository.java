package com.lxx.second.repository;

import com.lxx.second.domain.DcStudent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 多数据源配置接口
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/10 17:17
 * @since JDK 1.8
 */
public interface StudentRepository extends JpaRepository<DcStudent, Long> {
}
