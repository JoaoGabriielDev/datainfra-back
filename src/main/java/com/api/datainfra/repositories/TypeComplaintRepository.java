package com.api.datainfra.repositories;

import com.api.datainfra.entities.TypeComplaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeComplaintRepository extends JpaRepository<TypeComplaint, Long> {
}
