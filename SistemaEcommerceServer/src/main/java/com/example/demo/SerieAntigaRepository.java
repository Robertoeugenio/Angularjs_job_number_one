package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieAntigaRepository extends JpaRepository<SerieAntiga,Integer>{
	

}
