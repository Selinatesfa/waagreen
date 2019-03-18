package waa.green.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "faculty_id")
    private long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
    @Fetch(FetchMode.JOIN)
    private List<Course> courses;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facultyStd")
    private List<Student> students;
}
