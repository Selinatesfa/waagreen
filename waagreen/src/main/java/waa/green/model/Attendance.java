package waa.green.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "attend_id")
    private long id;
    @Column( name = "attendance_date")
    private Date attendanceDate;
    private String period;
    private Integer present;

    @OneToOne(cascade = CascadeType.ALL)
    private Student students;
    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "type_id")
    private AttendanceType attendanceType;

    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "block_id")
    private Block block;
}
