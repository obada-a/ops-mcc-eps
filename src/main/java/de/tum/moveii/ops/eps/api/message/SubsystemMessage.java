package de.tum.moveii.ops.eps.api.message;

import com.fasterxml.jackson.annotation.JsonFormat;
import de.tum.moveii.ops.eps.subsystem.model.SubsystemState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Created by Constantin Costescu on 04-Mar-17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubsystemMessage {
    @NotNull
    private String subsystem;
    @NotNull
    private SubsystemState state;
    @NotNull
    private SubsystemState expectedState;
    @NotNull
    private Double current;
    @NotNull
    private Double voltage;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createdOn;
}
