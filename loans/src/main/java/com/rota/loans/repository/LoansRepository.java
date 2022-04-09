package com.rota.loans.repository;

import org.springframework.stereotype.Repository;
import com.rota.loans.model.Loans;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {
	
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
	
}
