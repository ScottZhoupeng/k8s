package com.k8stest.k8s;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Slf4j
public class Test {

    @GetMapping
    public String test() {
        log.info("success ......");
        return "success k8s...";
    }

}
