package com.baracho.worker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baracho.worker.entities.Worker;

public interface WorkerRepositoy extends JpaRepository<Worker, Long> {

	List<Worker> findAll();

}
