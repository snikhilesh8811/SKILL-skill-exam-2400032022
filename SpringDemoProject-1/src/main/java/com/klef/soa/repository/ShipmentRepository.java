package com.klef.soa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.soa.entity.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Long>{

	List<Shipment> findByName(String name);

	List<Shipment> findByType(String type);

}
