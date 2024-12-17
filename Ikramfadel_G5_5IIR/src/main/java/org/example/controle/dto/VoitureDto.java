package org.example.controle.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class VoitureDto {
    String model;
    String color;
    String matricul;
    double price;

}