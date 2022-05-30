package com.alirajadev.user.VO;

import com.alirajadev.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

    private User user;
    private Department department;
}

// @Data - to create getters and setters using lombak package