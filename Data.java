import java.util.ArrayList;
import java.util.List;

public class Data{
	/** @NOTE: Maybe make these maps? -Tyler
	 * 
	 */
    private List<Warehouse> warehouseList;
    private List<Member> memberList;
    private List<Equipment> equipmentList;

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
    
    public void addEquipment(Equipment equipment) {
    	this.equipmentList.add(equipment);
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
    
    public Equipment getEquipment(String equipId){
        for (Equipment equipment : this.equipmentList){
            if (equipment.getEquipSerial().equals(equipId)){
                	return equipment;
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
            if (warehouseList.get(i).getWarehouseId().equals(warehouseId)){
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
        for (int j = 0; j < this.memberList.size(); j++){
            Member member = this.memberList.get(j);
            if (member.getUserId().equals(memberId)){
                member.deleteUserReview(reviewId);
            }
        }
    }
    
    public void deleteEquipment(String equipId){
        for (int j = 0; j < this.equipmentList.size(); j++){
            if (equipmentList.get(j).getEquipSerial().equals(equipId)) {
            	equipmentList.remove(j);
            }
            
        }
    }
}