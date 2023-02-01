package com.blogPessoalItau.model;


import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O atributo título é obrigatório")
    @Size(min = 5, max = 100, message = "O atributo título deve ter entre 5 e 100 caracteres")
    private String titulo;

    @NotBlank(message = "O atributo texto é obrigatório")
    @Size(min = 10, max = 1000, message = "O atributo texto deve ter entre 5 e 1000 caracteres")
    private String texto;

    @UpdateTimestamp
    private LocalDateTime data;


}
