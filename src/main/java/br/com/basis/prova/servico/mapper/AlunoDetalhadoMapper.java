package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.dto.AlunoDetalhadoDTO;
import br.com.basis.prova.dominio.dto.DisciplinaDetalhadaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {})
public interface AlunoDetalhadoMapper extends EntityMapper<AlunoDetalhadoDTO, Aluno> {

    @Mapping(source = "cpf", target = "cpf")
    AlunoDetalhadoDTO toDto(Aluno aluno);

    //@Mapping(target = "professor.disciplinas",ignore = true)
    //DisciplinaDetalhadaDTO toDto(Disciplina disciplina);

}
