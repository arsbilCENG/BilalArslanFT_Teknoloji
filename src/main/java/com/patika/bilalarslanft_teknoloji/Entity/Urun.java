package com.patika.bilalarslanft_teknoloji.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Urun")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Urun extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Adi")
    private String ad;

    @Column(name = "Fiyat")
    private String fiyat;

    @Column(name = "Son Kullanma Tarihi")
    private String SKT;


}
