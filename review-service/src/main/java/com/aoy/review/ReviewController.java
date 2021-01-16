package com.aoy.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController{

    @GetMapping
    public String getReview() {
        return "Review Service 1";
    }

}
