package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(name = "eureka-client-Asr")
public interface HelloRemoteInterface {
	@RequestMapping(value = "/applyorder/approveAll")
    public String approveAllOrders();
}
