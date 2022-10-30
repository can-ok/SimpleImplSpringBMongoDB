package com.canok.springmongo.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryAggregation {

    @Id
    private String country;

    private Long total;

}
