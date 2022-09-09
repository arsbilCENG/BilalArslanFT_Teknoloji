package com.patika.bilalarslanft_teknoloji.Entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
@ToString
public abstract class BaseEntity implements Serializable {

    private Date createdData;
    private String createdBy;
    private Date uodatedData;
    private String updatedBy;

}
