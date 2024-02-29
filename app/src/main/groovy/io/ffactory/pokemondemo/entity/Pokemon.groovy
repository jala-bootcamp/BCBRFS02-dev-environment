package io.ffactory.pokemondemo.entity

import groovyjarjarantlr4.v4.runtime.misc.NotNull

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "pokemon")
class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @Column(nullable = false)
    String name

    @NotNull
    @Column(nullable = false)
    Short number
}
