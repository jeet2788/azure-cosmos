package com.cosmos.springazurecosmos.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.cosmos.springazurecosmos.container.ContainerA;

/**
 * we will alternatively query the container so, we made in extend the baseContainer where we will place the Query for both containers
 */
public interface CosmosContainerRepositoryA extends CosmosRepository<ContainerA,String>,BaseContainerRepository {
}
