package com.cosmos.springazurecosmos.container;

import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class GenericContainer {

    @Id
    @JsonIgnore
    private String id;

    private Integer empId;
    @PartitionKey
    @JsonIgnore
    private String partitionKey;
    private String month;
    private String startPlace;
    private String accessories;
    private String post;
    private String section;
    private LocalDateTime updatedTimeStamp;
}
