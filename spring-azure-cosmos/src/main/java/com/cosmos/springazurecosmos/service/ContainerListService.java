package com.cosmos.springazurecosmos.service;

import com.cosmos.springazurecosmos.container.GenericContainer;
import com.cosmos.springazurecosmos.model.GetDataRequest;
import java.util.List;

public interface ContainerListService {
    /**
     * @param getDataRequest
     * @return
     */
    List<GenericContainer> getContainerDetailsByRequest(GetDataRequest getDataRequest);
}
