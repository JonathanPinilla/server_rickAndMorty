package com.jonathan.server.dto;

import lombok.Data;

@Data
public class InfoDto {

    private Integer count;

    private Integer pages;

    public InfoDto(Integer count, Integer pages) {
        this.count = count;
        this.pages = pages;
    }
}
