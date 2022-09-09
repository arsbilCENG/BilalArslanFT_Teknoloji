package com.patika.bilalarslanft_teknoloji.Controller;

import com.patika.bilalarslanft_teknoloji.Entity.UrunYorum;
import com.patika.bilalarslanft_teknoloji.Service.UrunYorumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/KullaniciYorum")
@RequiredArgsConstructor
public class UrunYorumController {

    private final UrunYorumService urunYorumYorumService;
    @PostMapping("/create")
    public ResponseEntity<UrunYorum> createUrunYorum(@RequestBody UrunYorum urunYorum){
        return null;
    }
}
