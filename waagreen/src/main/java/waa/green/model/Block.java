package waa.green.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.Valid;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "block_id")
    private long id;
    @Column(name = "start_date")
    
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;

          
    @Column( name = "year_of_entry")
    private Date yearEntry;
    @Column( name = "number_of_block")
    private int numberOfBlock;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "blocks")
    private Set<Course> courses = new HashSet<>();

    @OneToMany(mappedBy = "block")
    private List<Attendance> attendances;

    @ManyToMany
    @JoinTable(name = "block_session",
            joinColumns = @JoinColumn(name = "block_id"),
            inverseJoinColumns = @JoinColumn(name = "session_id"))
    private Set<Session> sessions = new HashSet<>();

	@Override
	public String toString() {
		return "Block [startDate=" + startDate + ", endDate=" + endDate + ", yearEntry=" + yearEntry
				+ ", numberOfBlock=" + numberOfBlock + ", courses=" + courses + ", attendances=" + attendances + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getYearEntry() {
		return yearEntry;
	}

	public void setYearEntry(Date yearEntry) {
		this.yearEntry = yearEntry;
	}

	public int getNumberOfBlock() {
		return numberOfBlock;
	}

	public void setNumberOfBlock(int numberOfBlock) {
		this.numberOfBlock = numberOfBlock;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public List<Attendance> getAttendances() {
		return attendances;
	}

	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}

	public Set<Session> getSessions() {
		return sessions;
	}

	public void setSessions(Set<Session> sessions) {
		this.sessions = sessions;
	}

}
