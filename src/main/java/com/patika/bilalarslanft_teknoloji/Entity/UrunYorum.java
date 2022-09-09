package com.patika.bilalarslanft_teknoloji.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "UrunYorum")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UrunYorum extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Yorum",length = 500)
    private String yorum;

    @Column(name = "yorumTarihi")
    Date  yorumTarihi;

    @Column(name = "kullaniciId")
    private String kullaniciId;

    @Column(name = "urunId")
    private String urunId;

}
