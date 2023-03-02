package com.cosmos.springazurecosmos.service.impl;

import com.cosmos.springazurecosmos.container.GenericContainer;
import com.cosmos.springazurecosmos.model.GetDataRequest;
import com.cosmos.springazurecosmos.repository.CosmosContainerRepositoryA;
import com.cosmos.springazurecosmos.repository.CosmosContainerRepositoryB;
import com.cosmos.springazurecosmos.service.ContainerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Here we are doing one operation where we are having 3 containers in the Azure cosmos Db.
 * Two containers have similar data , and we have to Query the containers alternatively.
 * There one container is responsible for storing the other two container name dynamically and alternatively
 * Before calling the table we have to check the container name which is available in runtime.
 */
@Service
public class ContainerListServiceImpl implements ContainerListService {

    @Autowired
    CosmosContainerRepositoryA cosmosContainerRepositoryA;
    @Autowired
    CosmosContainerRepositoryB cosmosContainerRepositoryB;
    @Value("${cosmos.container-name.containerA}")
    String containerA;

    /**
     * @param getDataRequest
     * @return List of container details which is having the matching EmployeeId in the request
     */
    @Override
    public List<GenericContainer> getContainerDetailsByRequest(GetDataRequest getDataRequest) {

        final String presentContainerName = getAvailableContainerName();
        List<GenericContainer> containerList = null;
        if(containerA.equals(presentContainerName)){
            containerList = cosmosContainerRepositoryA.findByEmpId(getDataRequest.getEmpId());
        }else{
            containerList = cosmosContainerRepositoryB.findByEmpId(getDataRequest.getEmpId());
        }
        return containerList;
    }

    /**
     * @return The name of the Container which is available runtime
     * we can call this container similarly  by using cosmos repository and get the table data
     */
    private String getAvailableContainerName() {

        return "containerNameWhichIsPresentInRuntime";
    }
}
