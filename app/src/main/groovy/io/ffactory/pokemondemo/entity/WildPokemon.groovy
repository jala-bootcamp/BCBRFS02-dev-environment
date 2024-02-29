package io.ffactory.pokemondemo.entity

import groovyjarjarantlr4.v4.runtime.misc.NotNull


import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "wild_pokemon")
class WildPokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @Column(name = "combat_power", nullable = false)
    Integer combatPower

    @ManyToOne
    @JoinColumn(name = "pokemon_id", referencedColumnName = "id", nullable = false)
    Pokemon pokemon

    @ManyToOne
    @JoinColumn(name = "trainer_id", referencedColumnName = "id", nullable = true)
    Trainer trainer
}
