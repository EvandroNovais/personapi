package one.digitalinnovation.personapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessagePersonDTO {
    private String message;
}
