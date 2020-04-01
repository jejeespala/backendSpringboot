package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.dto.AlunoListagemDTO;
import br.com.basis.prova.dominio.dto.DisciplinaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {})
public interface DisciplinaMapper extends EntityMapper<DisciplinaDTO, Disciplina> {

    //@Mapping(target = "professor.idade", ignore = true)
    //DisciplinaDTO toDto(Disciplina disciplina);
}
