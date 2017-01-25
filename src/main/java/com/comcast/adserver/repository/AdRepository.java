package com.comcast.adserver.repository;

import java.util.List;

import com.comcast.adserver.entity.Ad;

public interface AdRepository {

	public Ad createAd(Ad ad);

	public Ad findAdById(String id);

	public List<Ad> findAllAds();

}
