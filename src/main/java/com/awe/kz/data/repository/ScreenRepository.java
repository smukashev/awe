package com.awe.kz.data.repository;

import com.awe.kz.data.entity.Screen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ScreenRepository extends CrudRepository<Screen, Long> {
    public Screen findByScreenId(long screenId);
    public List<Screen> findByTheatreId(long theatreId);
}
