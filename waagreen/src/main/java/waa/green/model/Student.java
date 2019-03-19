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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "students")
    private Set<Course> courses = new HashSet<>();
}
