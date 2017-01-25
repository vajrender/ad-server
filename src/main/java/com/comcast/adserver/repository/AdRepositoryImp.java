package com.comcast.adserver.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.comcast.adserver.entity.Ad;

@Repository
@Transactional
public class AdRepositoryImp implements AdRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Ad createAd(Ad ad) {
		em.persist(ad);
		 return ad;
	}

	@Override
	public Ad findAdById(String id) {
		Ad ad = em.find(Ad.class, id);
		return ad;
	}
	
	@Override
	public List<Ad> findAllAds() {
		String qlString = "SELECT a FROM Ad a ORDER BY a.partner_id ASC";
		List<Ad> ads = em.createQuery(qlString, Ad.class)
				.getResultList();
		return ads;

	}

}
