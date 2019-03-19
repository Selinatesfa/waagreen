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
}
