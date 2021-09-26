package com.E02_Cynthia.E02_Cynthia;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Arrays;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitData {
    private final MonumentoRepository repository;
    @PostConstruct
    public void init(){
        repository.saveAll(
                Arrays.asList(
                        new Monumento("123", "Francia", "París", "54798,214646",  "Torre Eiffel", "Lorem", "URL"),
                        new Monumento("878", "Alemania", "Berlín", "53424248,343434",  "Reichstag", "Lorem", "URL"),
                        new Monumento("232", "Reino Unido", "Londres", "54798,214646",  "Big Ben", "Lorem", "URL")

                )
        );
    }
}
