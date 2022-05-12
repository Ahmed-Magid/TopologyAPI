package com.example.main.topology.component;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Range {
    @JsonProperty("default")
    private float defaultValue;
    private float min;
    private float max;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Range range = (Range) o;
        return Float.compare(range.defaultValue, defaultValue) == 0 && Float.compare(range.min, min) == 0 && Float.compare(range.max, max) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultValue, min, max);
    }
}
