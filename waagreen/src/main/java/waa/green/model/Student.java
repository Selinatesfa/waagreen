package waa.green.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column( name = "last_name")
    private String lastName;
    @Column( name = "date_of_entry")
    private Date dateOfEntry;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "code_id", nullable = false)
    private Code code;

    @ManyToMany
    @JoinTable(name = "student_attendance",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "attend_id"))
    private Set<Attendance> attendances = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty facultyStd;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "students")
    private Set<Course> courses = new HashSet<>();
}
