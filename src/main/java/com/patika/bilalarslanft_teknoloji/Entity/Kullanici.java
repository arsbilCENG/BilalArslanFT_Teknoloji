package com.patika.bilalarslanft_teknoloji.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "kullanici")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kullanici extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Adi",length = 50)
    private String ad;

    @Column(name = "Soyadi",length = 50)
    private String soyad;

    @Column(name = "Email",length = 50)
    private String mail;

    @Column(name = "telefon",length = 15)
    private String tel;



}
