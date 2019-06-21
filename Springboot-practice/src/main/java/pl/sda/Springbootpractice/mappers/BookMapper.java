package pl.sda.Springbootpractice.mappers;

import org.mapstruct.factory.Mappers;
import pl.sda.Springbootpractice.model.Book;
import pl.sda.Springbootpractice.model.dto.BookDto;

public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto bookToBookDto(Book book);

    Book bookDtoToBook(BookDto bookDto);

}
