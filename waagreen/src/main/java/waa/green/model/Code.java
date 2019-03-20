package waa.green.model;

import lombok.*;

import javax.persistence.*;


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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", barcode='" + barcode + '\'' +
                ", studentId='" + studentId + '\'' +
                ", student=" + student +
                '}';
    }
}

