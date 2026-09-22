package com.fintech.infrastructure;

import com.fintech.domain.FintechEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FintechRepository extends JpaRepository<FintechEntity, Long> {
}