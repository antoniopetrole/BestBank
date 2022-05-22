package com.bestbank.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private long customerId;
    public String customerFirstName;
    public String customerLastName;
    @ManyToOne
    @JoinColumn
    public Address address = new Address();

}
