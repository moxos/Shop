package com.example.sklep.customer;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
   @NotNull
    private String name;
   @NotNull
    private  String second_name;
   @NotNull
    private String email;
    @NotNull
    private String password;


}
