package com.example.bai4;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public Girl getRadomGirl(){
        String name = radomGirlName(10);
        return girlRepository.getGirlByName(name);
    }



    public String radomGirlName(int lenght){
        // radom một string có độ dài quy định
        // sử dụng thư viện apche Common lang
        return RandomStringUtils.randomAlphanumeric(lenght).toLowerCase();
    }
}
