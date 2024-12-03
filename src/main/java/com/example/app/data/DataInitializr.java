package com.example.app.data;

import com.example.app.entity.UserEntity;
import com.example.app.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializr {

    private final UserRepository userRepository;

    @PostConstruct
    public void initializeData() {
        for (int i = 0; i < 5; i++) {
            UserEntity userEntity = new UserEntity("username" + i);
            userRepository.save(userEntity);
        }
    }
}
