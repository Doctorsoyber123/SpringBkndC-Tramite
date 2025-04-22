package c_tramite.tramite.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestDTO {

    @JsonProperty("user_web")
    private String userWeb;

    @JsonProperty("clave_web")
    private String claveWeb;
}
