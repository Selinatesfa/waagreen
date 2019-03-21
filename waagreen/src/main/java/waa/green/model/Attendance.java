package waa.green.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Attendance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attend_id")
    private long id;
    @Column( name = "attendance_date")
    private Date attendanceDate;
    private String period;
    private Integer present;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

	@JsonManagedReference
    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "location_id")
    private Location location;


	@JsonManagedReference
    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "type_id")
    private AttendanceType attendanceType;

    @JsonManagedReference
    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "block_id")
    private Block block;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Integer getPresent() {
		return present;
	}

	public void setPresent(Integer present) {
		this.present = present;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public AttendanceType getAttendanceType() {
		return attendanceType;
	}

	public void setAttendanceType(AttendanceType attendanceType) {
		this.attendanceType = attendanceType;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "Attendance{" +
				"id=" + id +
				", attendanceDate=" + attendanceDate +
				", period='" + period + '\'' +
				", present=" + present +
				", student=" + student +
				", location=" + location +
				", attendanceType=" + attendanceType +
				", block=" + block +
				'}';
	}
}
