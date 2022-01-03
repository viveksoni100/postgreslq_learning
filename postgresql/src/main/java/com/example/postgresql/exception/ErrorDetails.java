package com.example.postgresql.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author viveksoni100
 */
@Data
@AllArgsConstructor
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;

}
