package waa.green.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class AttendanceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private long id;
    private String type;

    @JsonBackReference
    @OneToMany(mappedBy = "attendanceType")
    private List<Attendance> attendances;

    @Override
    public String toString() {
        return "AttendanceType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", attendances=" + attendances +
                '}';
    }
}
