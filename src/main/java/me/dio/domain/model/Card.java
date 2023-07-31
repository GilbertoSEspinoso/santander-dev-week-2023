package me.dio.domain.model;

import java.math.BigDecimal;

public class Card {
    private Long id;
    private String number;
    private BigDecimal limit;

    public Card(Long id, String number, BigDecimal limit) {
        this.id = id;
        this.number = number;
        this.limit = limit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        return id.equals(card.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
