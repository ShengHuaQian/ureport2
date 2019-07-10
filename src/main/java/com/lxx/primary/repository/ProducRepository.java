package com.lxx.primary.repository;

import com.lxx.primary.domain.DcProduce;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 产品repository
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/10 9:52
 * @since JDK 1.8
 */
public interface ProducRepository extends JpaRepository<DcProduce, Long> {

}
