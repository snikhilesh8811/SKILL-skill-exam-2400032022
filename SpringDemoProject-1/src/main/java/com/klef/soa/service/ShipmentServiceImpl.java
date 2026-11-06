package com.klef.soa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.entity.Shipment;
import com.klef.soa.repository.ShipmentRepository;
import com.klef.soa.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService{

	@Autowired
	private ShipmentRepository repository;

	@Override
	public Shipment insertShipment(Shipment shipment) {

		return repository.save(shipment);
	}

	@Override
	public Shipment updateShipment(Long id, Shipment shipment) {

		Shipment s = repository.findById(id).orElse(null);

		if(s!=null)
		{
			s.setName(shipment.getName());
			s.setType(shipment.getType());
			s.setStatus(shipment.getStatus());
			s.setLocation(shipment.getLocation());

			return repository.save(s);
		}

		return null;
	}

	@Override
	public String deleteShipment(Long id) {

		repository.deleteById(id);

		return "Shipment Deleted Successfully";
	}

	@Override
	public List<Shipment> displayAll() {

		return repository.findAll();
	}

	@Override
	public Shipment displayById(Long id) {

		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Shipment> findByName(String name) {

		return repository.findByName(name);
	}

	@Override
	public List<Shipment> findByType(String type) {

		return repository.findByType(type);
	}

}
