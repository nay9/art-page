package com.nay9.artpage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtRepository extends CrudRepository<Art, Long>{

}