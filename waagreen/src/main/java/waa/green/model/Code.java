package waa.green.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Code {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "code_id")
    private long id;
    private String barcode;
    @Column(name = "student_id")
    private String studentId;

    @OneToOne(mappedBy = "code", cascade = CascadeType.ALL)
    private Student student;
}
