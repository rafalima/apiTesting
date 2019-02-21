package support.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class User {

    @JsonProperty("nome")
    private String nome;
}
