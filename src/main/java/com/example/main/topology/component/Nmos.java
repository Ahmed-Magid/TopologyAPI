package com.example.main.topology.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Map;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)

public class Nmos extends Component {
    @JsonProperty("m(l)")
    private Range ml;

    public Nmos(String id, Range ml, Map<String, String> netList) {
        super("nmos", id, netList);
        this.ml = ml;
    }
}
