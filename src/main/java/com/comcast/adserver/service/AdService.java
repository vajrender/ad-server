package com.comcast.adserver.service;

import java.util.List;

import com.comcast.adserver.entity.Ad;
import com.comcast.adserver.exception.AdAlreadyExistsException;
import com.comcast.adserver.exception.AdNotFoundException;

public interface AdService {

	Ad createAd(Ad users) throws AdAlreadyExistsException;

	Ad findAdById(String id) throws AdNotFoundException;

	List<Ad> findAllAds() throws AdNotFoundException;

}
