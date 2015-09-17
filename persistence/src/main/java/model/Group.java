package model;

 import javax.persistence.*;
 import org.hibernate.annotations.GenericGenerator;

 import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="group")
public class Group {
    @Id
    @GeneratedValue(generator="idIncrementor")
    @GenericGenerator(name="idIncrementor" , strategy="increment")

    private Long id;
    @Column(name="name")
    private String name;
    @Column (name="startDate")
    private Date startDate ;
    @Column(name="endDate")
    private Date endDate;

    public Group(){};

    public Group(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}

