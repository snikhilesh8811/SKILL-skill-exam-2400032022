package com.klef.soa.service;

import java.util.List;

import com.klef.soa.entity.Shipment;

public interface ShipmentService {

	Shipment insertShipment(Shipment shipment);

	Shipment updateShipment(Long id, Shipment shipment);

	String deleteShipment(Long id);

	List<Shipment> displayAll();

	Shipment displayById(Long id);

	List<Shipment> findByName(String name);

	List<Shipment> findByType(String type);

}
