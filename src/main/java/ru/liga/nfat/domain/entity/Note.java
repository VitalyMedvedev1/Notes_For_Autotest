package ru.liga.nfat.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "note")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Note {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "name")
    private String name;

    @Column(name = "color_id")
    private Long colorId;

    @Column(name = "sub_notes_id")
    private Long subNotesId;
}
