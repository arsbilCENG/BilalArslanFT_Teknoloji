/*
package com.patika.bilalarslanft_teknoloji.Controller;

import com.patika.bilalarslanft_teknoloji.Entity.Kullanici;
import com.patika.bilalarslanft_teknoloji.Service.KullaniciService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Kullanici")


public class KullaniciController {
    public KullaniciController() {
    }
    private final KullaniciService kullaniciService;

    @PostMapping("/create")
    public ResponseEntity<Kullanici> createKullanici(@RequestBody Kullanici kullanici){
        Kullanici resultKullanici= kullaniciService.createKulanici(kullanici);
        return ResponseEntity.ok(resultKullanici);
    }
    public ResponseEntity<Kullanici> createKullan(@RequestBody Kullanici kullanici){
        Kullanici restKullan =
    }
}
*/
