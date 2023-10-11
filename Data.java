public class Data{
    private List<Warehouse> warehouseList;
    private List<Member> memberList;

    public Data(){
        warehouseList = new ArrayList<>();
        memberList = new ArrayList<>();
    }

    public void addWarehouse(Warehouse warehouse){
        this.warehouseList.add(warehouse);
    }

    public void addMember(Member member){
        this.memberList.add(member);
    }

    public Warehouse getWarehouse(String warehouseId){
        for (Warehouse warehouse : this.warehouseList){
            if (warehouse.getWarehouseId().equals(warehouseId)){
                return warehouse;
            }
        }
        return null;
    }

    public Review getReview(String memberId, int reviewId){
        for (Member member : this.memberList){
            if (member.getUserId().equals(memberId)){
                for (Review review : member.getUserReviews()){
                    if (review.getReviewId() == reviewId){
                        return review;
                    }
                }
            }   
        }
        return null;
    }

    public Member getMember(String memberId){
        for (Member member : this.memberList){
            if (member.getUserId().equals(memberId)){
                return member;
            }
        }
        return null;
    }

    public void deleteWareHouse(String warehouseId){
        for (int i = 0; i < this.warehouseList.size(); i++){
            if (warehouseList.get(i).getWarehouseID().equals(warehouseId)){
                warehouseList.remove(i);
            }
        }
    }

    public void deleteMember(String memberId){
        for (int i = 0; i < this.memberList.size(); i++){
            if (memberList.get(i).getUserId().equals(memberId)){
                memberList.remove(i);
            }
        }
    }

    public void deleteReview(String memberId, int reviewId){
        for (int j = 0; i < this.memberList; j++){
            Member member = this.memberList.get(j);
            if (member.getUserId().equals(memberId)){
                member.deleteUserReview(reviewId);
            }
        }
    }
}