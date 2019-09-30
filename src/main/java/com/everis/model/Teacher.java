package com.everis.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Teacher class.
 * @author jeffrey
 * @version v1.0
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
  /**
   * id.
   */
   private String id;
  /**
   * full name.
   */
  private String fullName;
  /**
   * gender.
   */
  private String gender;
  /**
   * date of birth.
   */
  @JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
  private LocalDate dateofBirth;
  /**
   * type of identification document.
   */
  private String typeDocument;
  /**
   * identification document number.
   */
  private String documentNumber;
    
}