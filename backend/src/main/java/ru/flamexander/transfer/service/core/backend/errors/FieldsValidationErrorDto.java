package ru.flamexander.transfer.service.core.backend.errors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FieldsValidationErrorDto {
    private String code;
    private String message;
    private List<FieldValidationError> fields;
    private LocalDateTime date;

    public FieldsValidationErrorDto(List<FieldValidationError> fields) {
        if (this.fields == null) this.fields = new ArrayList<>();
        this.code = "FIELDS_VALIDATION_ERROR";
        this.message = "Поля запроса не прошли проверку";
        this.fields = fields;
        this.date = LocalDateTime.now();
    }
}