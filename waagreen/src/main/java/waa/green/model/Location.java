package waa.green.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private long id;
    @Column(name = "location_name")
    private String name;
    @Column(name = "short_name")
    private String shortName;

    @OneToMany(mappedBy = "location")
    private List<Attendance> attendances;
}
