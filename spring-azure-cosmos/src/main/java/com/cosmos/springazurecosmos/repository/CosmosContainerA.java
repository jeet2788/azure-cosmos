package com.cosmos.springazurecosmos.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.cosmos.springazurecosmos.container.ContainerA;

public interface CosmosContainerA extends CosmosRepository<ContainerA,String> {
}
