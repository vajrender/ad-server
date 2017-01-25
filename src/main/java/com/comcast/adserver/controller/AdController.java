package com.comcast.adserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.comcast.adserver.entity.Ad;
import com.comcast.adserver.exception.AdAlreadyExistsException;
import com.comcast.adserver.exception.AdNotFoundException;
import com.comcast.adserver.service.AdService;
import com.fasterxml.jackson.annotation.JsonCreator;

@RestController
@RequestMapping(value = "/ad")
public class AdController {

	@Autowired
	private AdService adService;

	@JsonCreator
	@RequestMapping(value = "/post_data/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Ad createAd(@RequestBody Ad ad) throws AdAlreadyExistsException {
		return adService.createAd(ad);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Ad findAdById(@PathVariable("id") String id) throws AdNotFoundException {
		return adService.findAdById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ad> findAllUsers() throws AdNotFoundException {
		return adService.findAllAds();
	}

}
