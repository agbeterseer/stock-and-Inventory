/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hg.print.recipt.repository;

import hg.print.recipt.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author terseer
 */
@Transactional
public interface AddressRepository extends CrudRepository<Address, Long>{
    
    
}
