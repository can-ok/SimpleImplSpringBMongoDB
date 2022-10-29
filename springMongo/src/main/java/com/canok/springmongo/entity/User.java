package com.canok.springmongo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {
    //this class will be collection
    //all documents will be stored in this collection

    // generated automatically (_id)
    @Id
    private String id;
    @Indexed(unique = true)
    private String userName;

    private String name;
    private String country;
    private Gender gender;
    private Address address;
    private List<String> favouriteSubjects;
    private LocalDateTime created;
}
