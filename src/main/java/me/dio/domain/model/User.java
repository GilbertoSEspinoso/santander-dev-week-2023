package me.dio.domain.model;

import java.util.List;


public class User {

    private Long id;
    private String name;
    private Account account;
    private Card card;
    private List<Feature> features;
    private List<News> news;

    public User(Long id, String name, Account account, List<Feature> features, Card card, List<News> news) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.features = features;
        this.card = card;
        this.news = news;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public List<News> getNews() {
        return news;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
