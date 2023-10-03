package com.campusdual.appmazing.model.dto.dtopmapper;

import com.campusdual.appmazing.model.Category;
import com.campusdual.appmazing.model.dto.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO toDTO(Category Category);
    List<CategoryDTO> toDTOList(List<Category> categories);
    Category toEntity(CategoryDTO categorydto);
}