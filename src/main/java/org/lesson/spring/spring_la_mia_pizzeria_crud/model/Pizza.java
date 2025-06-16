package org.lesson.spring.spring_la_mia_pizzeria_crud.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// ci riferiamo ad una tabella
// dichiariamo il nobe della tabella che andiamo a creare
@Entity
@Table(name = "pizzas")
public class Pizza {

    // Una pizza avrà le seguenti informazioni:
    // un id
    // un nome
    // una descrizione
    // una foto (url)
    // un prezzo

    // creiamo l'id e rendiamo generato automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal price;

    @NotBlank(message = "The name must not be null, nor empty or blank")
    private String name;

    @NotBlank(message = "The description must not be null, nor empty or blank")
    private String description;

    @NotBlank(message = "The image must not be null, nor empty or blank")
    private String url;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s$", this.name, this.description, this.price);
    }
}
