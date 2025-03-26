package br.com.adamis.redis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class RedisTestService {

//    @Autowired
//    private StringRedisTemplate redisTemplate;
//
//    @PostConstruct
//    public void testConnection() {
//        try {
//            redisTemplate.opsForValue().set("test-key", "Hello Redis!");
//            String value = redisTemplate.opsForValue().get("test-key");
//            System.out.println("Redis está funcionando! Valor: " + value);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Erro ao conectar ao Redis.");
//        }
//    }
}

