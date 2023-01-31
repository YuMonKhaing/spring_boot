package com.crud.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @NotEmpty(message = "Title field is required.")
  @Column(length = 128, nullable = false)
  private String title;

  // @Email(message = "Email is not invalid")
  @NotEmpty(message = "Description field is required.")
  @Column(length = 256)
  private String description;

  @Min(value = 1)
  @Max(value = 10)
  @NotNull(message = "Level field is required.")
  @Column(nullable = false)
  private int level;

  @Column
  private boolean published;

  public Tutorial() {

  }

  public Tutorial(String title, String description, int level, boolean published) {
    this.title = title;
    this.description = description;
    this.level = level;
    this.published = published;
  }

  // getters and setters
}
