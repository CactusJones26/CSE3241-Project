public class Review{
    private int reviewId;
    private String userId;
    private String comment;
    private int rating;
    private String date;
    private String reviewTopic;

    public Review(int reviewId, String userId, String comment, int rating, String date, String reviewTopic){
        this.reviewId = reviewId;
        this.userId = userId;
        this.comment = comment;
        this.rating = rating;
        this.date = date;
        this.reviewTopic = reviewTopic;
    }

    //Getter methods

    public int getReviewId(){
        return this.reviewId;
    }

    public String getUserId(){
        return this.userId;
    }

    public String getComment(){
        return this.comment;
    }
    
    public int getRating(){
        return this.rating;
    }

    public String getDate(){
        return this.date;
    }

    public String getReviewTopic(){
        return this.reviewTopic;
    }

    //Setter methods

    public void changeComment(String comment){
        this.comment = comment;
    }

    public void changeRating(int rating){
        this.rating = rating;
    }

    public void changeDate(String date){
        this.date = date;
    }

    public void changeReviewTopic(String reviewTopic){
        this.reviewTopic = reviewTopic;
    }
}