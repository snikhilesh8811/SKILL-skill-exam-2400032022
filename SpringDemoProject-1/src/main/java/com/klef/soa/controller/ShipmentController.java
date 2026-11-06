package com.klef.soa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.entity.Shipment;
import com.klef.soa.service.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

	@Autowired
	private ShipmentService service;

	@PostMapping("/insert")
	public Shipment insert(@RequestBody Shipment shipment)
	{
		return service.insertShipment(shipment);
	}

	@PutMapping("/update/{id}")
	public Shipment update(@PathVariable Long id,@RequestBody Shipment shipment)
	{
		return service.updateShipment(id, shipment);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id)
	{
		return service.deleteShipment(id);
	}

	@GetMapping("/all")
	public List<Shipment> displayAll()
	{
		return service.displayAll();
	}

	@GetMapping("/{id}")
	public Shipment displayById(@PathVariable Long id)
	{
		return service.displayById(id);
	}

	@GetMapping("/name/{name}")
	public List<Shipment> findByName(@PathVariable String name)
	{
		return service.findByName(name);
	}

	@GetMapping("/type/{type}")
	public List<Shipment> findByType(@PathVariable String type)
	{
		return service.findByType(type);
	}

}
