package com.tnsif.StudentService.entity;


	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;

	@Entity
	public class Student {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String email;
	    private String course;
	    private String specialization;
	    private String firstgraduate;
	    private double fees;
	    

	    // Getters and Setters
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

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public void setCourse(String course) {
	        this.course = course;
	    }

	    public double getFees() {
	        return fees;
	    }

	    public void setFees(double fees) {
	        this.fees = fees;
	    }

	    public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		public String getFirstgraduate() {
			return firstgraduate;
		}

		public void setFirstgraduate(String firstgraduate) {
			this.firstgraduate = firstgraduate;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", email=" + email + ", course=" + course
					+ ", specialization=" + specialization + ", firstgraduate=" + firstgraduate + ", fees=" + fees
					+ "]";
		}

	}



