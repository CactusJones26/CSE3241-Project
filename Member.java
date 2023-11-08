import java.util.ArrayList;
import java.util.List;

public class Member {

    // Class variables 
    private String userId;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String startDate;
    private int warehouseDistance;
    private List<Review> userReviews;

    // Constructor
    public Member(String userId, String firstName, String lastName, String address, String phoneNumber, String email, String startDate, int warehouseDistance) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.startDate = startDate;
        this.warehouseDistance = warehouseDistance;
        this.userReviews = new ArrayList<>();
    }

    /*-------- Getter Methods -------*/
    public String getUserId() {
        return this.userId;
    }

    public List<Review> getUserReviews(){
        return this.userReviews;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    } 

    public String getEmail() {
        return this.email;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public int getWarehouseDistance() {
        return this.warehouseDistance;
    }

    /*-------- Setter Methods --------*/
    public void setUserId(String id) {
        this.userId = id;
    }

    public void addUserReview(Review review){
        this.userReviews.add(review);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber; 
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStartDate(String date) {
        this.startDate = date;
    }

    public void setWarehouseDistance(int distance) {
        this.warehouseDistance = distance;
    }

    public Review deleteUserReview(int reviewId){
        Review deleted = null;
        for (int i = 0; i < this.userReviews.size(); i++){
            if (this.userReviews.get(i).getReviewId() == reviewId){
                deleted = this.userReviews.remove(i);
            }
        }
        return deleted;
    }
    
    public Review getReview(int reviewId) {
    	Review rev = null;
    	for (int i = 0; i < this.userReviews.size(); i++) {
    		if (this.userReviews.get(i).getReviewId() == reviewId) {
    			rev = this.userReviews.get(i);
    		}
    	}
    	return rev;
    }
}
