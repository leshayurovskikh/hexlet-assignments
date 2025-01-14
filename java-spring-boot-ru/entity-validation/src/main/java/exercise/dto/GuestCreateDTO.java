package exercise.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

// BEGIN
@Setter
@Getter
public class GuestCreateDTO {
    @NotBlank
    private String name;

    @Email
    private String email;

    @Pattern(regexp = "^\\+[0-9]{11,14}")
    private String phoneNumber;

    @NotNull
    @Pattern(regexp = "[0-9]{4}")
    private String clubCard;

    @FutureOrPresent
    private LocalDate cardValidUntil;
}
// END
