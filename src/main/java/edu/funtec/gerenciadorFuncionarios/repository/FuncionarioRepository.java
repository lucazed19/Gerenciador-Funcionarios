package edu.funtec.gerenciadorFuncionarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.funtec.gerenciadorFuncionarios.model.Funcionario;
import edu.funtec.gerenciadorFuncionarios.model.FuncionarioSetor;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
}
