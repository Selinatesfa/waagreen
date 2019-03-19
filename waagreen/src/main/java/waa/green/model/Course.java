package waa.green.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_id")
    private String courseId;
    @Column(name = "grade", columnDefinition ="Decimal(10,2) default '0.00'")
    private Double grade;
    @Column(name = "extra_grade", columnDefinition ="Decimal(10,2) default '0.00'")
    private Double extraGrade;
    @Column(name = "course_credit")
    private Integer credit;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    @ManyToMany
    @JoinTable(name = "course_student",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> students = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "course_block",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "block_id"))
    private Set<Block> blocks = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public Double getExtraGrade() {
		return extraGrade;
	}

	public void setExtraGrade(Double extraGrade) {
		this.extraGrade = extraGrade;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Block> getBlocks() {
		return blocks;
	}

	public void setBlocks(Set<Block> blocks) {
		this.blocks = blocks;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseId=" + courseId + ", grade=" + grade
				+ ", extraGrade=" + extraGrade + ", credit=" + credit + ", faculty=" + faculty + ", students="
				+ students + ", blocks=" + blocks + "]";
	}

}
