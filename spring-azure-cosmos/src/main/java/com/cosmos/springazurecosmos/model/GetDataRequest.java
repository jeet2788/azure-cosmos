package com.cosmos.springazurecosmos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class GetDataRequest {

    private Integer empId;
    private String startPlace;
    private List<String> section;
    private String post;
    private String accessories;
    private String month;
}
