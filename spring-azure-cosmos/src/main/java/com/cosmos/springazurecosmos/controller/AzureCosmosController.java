package com.cosmos.springazurecosmos.controller;

import com.cosmos.springazurecosmos.container.GenericContainer;
import com.cosmos.springazurecosmos.model.GetDataRequest;
import com.cosmos.springazurecosmos.service.ContainerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/app")
public class AzureCosmosController {

    @Autowired
    ContainerListService containerListService;

    /**
     * @param getDataRequest
     * @return
     */
    @RequestMapping(value="/getContainerDetailsByRequest",produces = MediaType.APPLICATION_JSON_VALUE,
    method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<GenericContainer> getContainerDetails(@Valid @RequestBody final GetDataRequest getDataRequest){
        List<GenericContainer> containerList = null;
        try{
            containerList = containerListService.getContainerDetailsByRequest(getDataRequest);
        }catch(Exception e){

        }
        return containerList;
    }
}
