/** 
 * Author: Kenji
 * Project: Orange
 * Date: 30/10
 */
package br.com.orange.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.orange.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
