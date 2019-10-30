/** 
 * Author: Antonny
 * Project: Orange
 * Date: 29/10
 */

package br.com.orange.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.orange.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
