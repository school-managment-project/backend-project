package com.project.schoolmanagment.payload.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.schoolmanagment.entity.concretes.AdvisorTeacher;
import com.project.schoolmanagment.entity.concretes.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class MeetRequest implements Serializable {

    @NotEmpty
    private String description;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Future
    private LocalDate date;

    @JsonFormat(pattern = "hh:mm a")
    private LocalTime startTime;

    @JsonFormat(pattern = "hh:mm a")
    private LocalTime stopTime;

    @NotNull
    private Long advisorTeacherId;

    @NotNull
    private Long studentId;
}
