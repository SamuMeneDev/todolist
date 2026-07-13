package samumene.todolist.mapper;

import org.mapstruct.Mapper;
import samumene.todolist.dto.response.CategoriaResponse;
import samumene.todolist.entity.Categoria;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends DTOEntityParser<CategoriaResponse, Categoria>, EntityDTOParser<CategoriaResponse, Categoria> {}
