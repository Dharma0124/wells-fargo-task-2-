package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisor_id;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "financialAdvisor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Client> clients;

    public FinancialAdvisor() {}

    public FinancialAdvisor(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public Long getAdvisor_id() {
        return advisor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }
}
