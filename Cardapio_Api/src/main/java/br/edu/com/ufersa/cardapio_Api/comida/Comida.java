package br.edu.com.ufersa.cardapio_Api.comida;

import jakarta.persistence.*;

@Table(name = "comida")
@Entity(name = "comida")
public class Comida {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String imagen;
    private String preco;

}
