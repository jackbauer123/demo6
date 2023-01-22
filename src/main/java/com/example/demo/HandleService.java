package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HandleService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    TreasureRepository treasureRepository;

    @Transactional
    public void save(){
        personRepository.save(new Person2("bauer2", "test"));
        treasureRepository.save(new Treasure2("yuan22", "zhibin22"));
        //throw new RuntimeException();
    }


}
