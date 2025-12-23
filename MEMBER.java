public class Member {

  private Integer memberId;
  private String name;
  private String email;
  private String phoneNumber;

  // Constructor
  public Member(Integer memberId, String name, String email, String phoneNumber) {
      this.memberId = memberId;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
  }

  // Getters and Setters
  public Integer getMemberId() {
     return memberId; 
    }
  public void setMemberId(Integer memberId) {
     this.memberId = memberId;
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
  public void setEmail(String email) { this.email = email; 

  }

  public String getPhoneNumber() {
     return phoneNumber; 
    }
  public void setPhoneNumber(String phoneNumber) {
     this.phoneNumber = phoneNumber;
 }

  // Methods
  public void borrowBook() {
      
  }

  public void returnBook() {

  }
}
