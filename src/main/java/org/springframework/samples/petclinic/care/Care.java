package org.springframework.samples.petclinic.care;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Care extends BaseEntity{

    @NotNull
    @Column(unique = true)
    @Size(min = 5, max = 30)
    String name;

    @NotNull
    String description;
    
    @NotEmpty
    @ElementCollection
    @ManyToMany(cascade = CascadeType.ALL)
    Set<PetType> compatiblePetTypes;
}
