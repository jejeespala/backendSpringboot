package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.dto.AlunoDetalhadoDTO;
import br.com.basis.prova.dominio.dto.DisciplinaDetalhadaDTO;
import br.com.basis.prova.dominio.dto.DisciplinaListagemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {})
public interface DisciplinaListagemMapper extends EntityMapper<DisciplinaListagemDTO, Disciplina> {

    //@Mapping(target = "professor.disciplinas",ignore = true)
    //DisciplinaListagemDTO toDto(Disciplina disciplina);

}
