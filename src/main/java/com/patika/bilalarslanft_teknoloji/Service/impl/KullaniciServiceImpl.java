/*
package com.patika.bilalarslanft_teknoloji.Service.impl;

import com.patika.bilalarslanft_teknoloji.Entity.Kullanici;
import com.patika.bilalarslanft_teknoloji.Repository.KullaniciRepository;
import com.patika.bilalarslanft_teknoloji.Service.KullaniciService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
public class KullaniciServiceImpl implements KullaniciService {

    private final KullaniciRepository kullaniciRepository;

    @Override
    public Kullanici createKulanici(Kullanici kullanici) {
    kullanici.setCreatedData(new Date());
    kullanici.setCreatedBy("Admin");
        return kullaniciRepository.save(kullanici);
    }

    @Override
    public Kullanici save(Kullanici kullanici) {
        if(kullanici.get)
        return null;
    }

    @Override
    public Kullanici getById(Long Id) {
        return null;
    }

    @Override
    public List<Kullanici> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Kullanici> getByProjectCodeContaina(String projectCode) {
        return null;
    }

    @Override
    public Page<Kullanici> getAllPeageable(Pegeable pegeable) {
        return null;
    }

    @Override
    public Boolean delete(Kullanici kullanici) {
        return null;
    }
}
*/
