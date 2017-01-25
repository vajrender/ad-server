package com.comcast.adserver.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comcast.adserver.entity.Ad;
import com.comcast.adserver.exception.AdAlreadyExistsException;
import com.comcast.adserver.exception.AdNotFoundException;
import com.comcast.adserver.repository.AdRepository;

@Service
@Transactional
public class AdServiceImp implements AdService{
	
	@Autowired
	private AdRepository repository;

	@Override
	public Ad createAd(Ad ad) throws AdAlreadyExistsException {
		Ad existing= repository.findAdById(ad.getPartner_id());
		if(existing == null){
			return repository.createAd(ad);
		}
		else
		{
			throw new AdAlreadyExistsException(); 
		}
	}

	@Override
	public Ad findAdById(String id) throws AdNotFoundException {
		Ad existing = repository.findAdById(id);
		if(existing == null){
			return null;
		}
		else{
			return existing;
		}
	}

	@Override
	public List<Ad> findAllAds() throws AdNotFoundException {
		return repository.findAllAds();
	}

}
