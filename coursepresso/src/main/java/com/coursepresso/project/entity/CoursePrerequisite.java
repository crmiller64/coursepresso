package com.coursepresso.project.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Caleb Miller
 */
@Entity
@Table(name = "course_prerequisite")
public class CoursePrerequisite implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Basic(optional = false)
  @Column(name = "id")
  private Integer id;
  @Basic(optional = false)
  @Column(name = "created_at")
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;
  @Basic(optional = false)
  @Column(name = "updated_at")
  @Temporal(TemporalType.TIMESTAMP)
  private Date updatedAt;
  @JoinColumn(name = "course_number", referencedColumnName = "course_number")
  @ManyToOne(optional = false)
  private Course courseNumber;
  @JoinColumn(name = "prerequisite", referencedColumnName = "course_number")
  @ManyToOne(optional = false)
  private Course prerequisite;

  public CoursePrerequisite() {
  }

  public CoursePrerequisite(Integer id) {
    this.id = id;
  }

  public CoursePrerequisite(Integer id, Date createdAt, Date updatedAt) {
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Course getCourseNumber() {
    return courseNumber;
  }

  public void setCourseNumber(Course courseNumber) {
    this.courseNumber = courseNumber;
  }

  public Course getPrerequisite() {
    return prerequisite;
  }

  public void setPrerequisite(Course prerequisite) {
    this.prerequisite = prerequisite;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof CoursePrerequisite)) {
      return false;
    }
    CoursePrerequisite other = (CoursePrerequisite) object;
    if ((this.id == null && other.id != null) || 
        (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "coursepresso.model.CoursePrerequisite[ id=" + id + " ]";
  }

}
