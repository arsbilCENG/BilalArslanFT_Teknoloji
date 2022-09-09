package com.patika.bilalarslanft_teknoloji.Service.impl;

import com.patika.bilalarslanft_teknoloji.Entity.UrunYorum;
import com.patika.bilalarslanft_teknoloji.Repository.UrunYorumRepository;
import com.patika.bilalarslanft_teknoloji.Service.UrunYorumService;
import lombok.RequiredArgsConstructor;

/*@RequiredArgsConstructor*/
public class UrunYorumServiceImpl implements UrunYorumService {

    private final UrunYorumRepository urunYorunRepository;

    public UrunYorumServiceImpl(UrunYorumRepository urunYorunRepository) {
        this.urunYorunRepository = urunYorunRepository;
    }
/*   @Override
    public UrunYorum getReviewById(UrunYorum urunYorum) {
        return null;
    }*/
}