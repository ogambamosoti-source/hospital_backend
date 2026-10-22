package model;

public class Doctor implements Person{
    private String staffId;
    private int idNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String role;
    private String department;
    private String specialization;
    private String licenceNumber;

    public Doctor(String staffId,int idNumber,String firstName,String lastName,String email,String phoneNumber,String role,String department,String specialization,String licenceNumber){
    this.staffId = staffId;
    this.idNumber = idNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.role = role;
    this.department = department;
    this.specialization = specialization;
    this.licenceNumber = licenceNumber;
    }

    public Doctor(int idNumber,String firstName,String lastName,String email,String phoneNumber,String role,String department,String specialization,String licenceNumber){
        this("",idNumber,firstName,lastName,email,phoneNumber,role,department,specialization,licenceNumber);

    }

    //input the getters
    public String getStaffId(){
        return staffId;
    }
    @Override 
    public int getIdNumber(){
        return idNumber;
    }
    @Override 
    public String getFirstName(){
        return firstName;
    }
    @Override 
    public String getLastName(){
        return lastName;
    }
    @Override
    public String getEmail(){
        return email;
    }
    @Override
    public String getPhoneNumber(){
        return phoneNumber;
    }
    @Override
    public String getRole(){
        return role;
    }
    @Override
    public String getDepartment(){
        return department;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String getLicenceNumber(){
        return licenceNumber;
    }

    public void setStaffId(String staffId){
        this.staffId = staffId;
    }
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setRole(String role){
        this.role = role;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public void setLicenceNumber(String licenceNumber){
        this.licenceNumber = licenceNumber;
    }

    public String toString(){
        return "Doctor{staffId = '" + staffId
        +"'idNumber='" + idNumber
        +"'firstName='" + firstName
        +"'lastName='" + lastName
        +"'email='" + email
        +"'phoneNumber='" + phoneNumber
        +"'role='" + role
        +"'department='" + department
        +"'specialization='" + specialization
        +"'licenceNumber='" + licenceNumber
        +"'}";
    }


}