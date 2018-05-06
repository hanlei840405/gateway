package com.bird.framework.gateway.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("system")
public interface UserRest {
    @RequestMapping("/user/username/{username}")
    String getByUsername(@PathVariable String username);
}
