package com.project.matflyhrm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.calendar;

@Repository
public interface CalendarRepo extends JpaRepository<calendar, Integer> {

}
