package org.springframework.samples.petclinic.care;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class CareProvision extends BaseEntity{
    
    @NotNull
    @PositiveOrZero
    double duration;

    @ManyToOne(cascade = CascadeType.ALL, optional = true)
    Visit visit;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    Care care;   
}
