package com.cosmos.springazurecosmos.repository;

import com.cosmos.springazurecosmos.container.GenericContainer;
import java.util.List;

public interface BaseContainerRepository {
    List<GenericContainer> findByEmpId(Integer empId);
}
