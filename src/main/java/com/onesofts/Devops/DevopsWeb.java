package com.onesofts.Devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DevopsWeb {
@GetMapping("dev")
public String getData() {
    return "i am sandhya";
}

}
