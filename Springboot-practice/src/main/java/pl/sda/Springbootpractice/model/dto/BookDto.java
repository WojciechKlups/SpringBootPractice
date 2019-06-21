package pl.sda.Springbootpractice.model.dto;

import lombok.Data;

@Data
public class BookDto {
    private Long id;

    private String title;
    private String author;
    private int numberOfPages;
    private String category;

}
