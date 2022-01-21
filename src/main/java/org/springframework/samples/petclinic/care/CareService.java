package org.springframework.samples.petclinic.care;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CareService {    
    
    @Autowired
    CareProvisionRepository careProvisionRepo;

    public List<Care> getAllCares(){
        return careProvisionRepo.findAllCares();
    }

    public List<Care> getAllCompatibleCares(String petTypeName){
        return null;
    }

    public Care getCare(String careName) {
        return careProvisionRepo.findCareByName(careName);
    }

    
    public CareProvision save(CareProvision p) throws NonCompatibleCaresException, UnfeasibleCareException {
        return careProvisionRepo.save(p);   
    }

    public List<CareProvision> getAllCaresProvided(){
        return careProvisionRepo.findAll();
    }

    public List<CareProvision> getCaresProvided(Integer visitId){
        return null;

    }
    
}
