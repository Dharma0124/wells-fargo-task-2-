package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolio_id;

    private String name;
    private String created_date;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Security> securities;

    public Portfolio() {}

    public Portfolio(String name, String created_date, Client client) {
        this.name = name;
        this.created_date = created_date;
        this.client = client;
    }

    // Getters and Setters
    public Long getPortfolio_id() {
        return portfolio_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(Set<Security> securities) {
        this.securities = securities;
    }
}

