package com.canok.springmongo.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.Aggregation;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAggregation {

    @Id
    private String country;
    private Set<String> names;
}
