package edu.miu.service;

import org.springframework.stereotype.Service;

@Service
public interface ConsumerService {
     void consumeQueue(String payload);
}