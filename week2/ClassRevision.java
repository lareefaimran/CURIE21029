
public class ClassRevision {
	public static void main(String[] args) {
		TrainingRoom.toilet = "Western toilet";
		
		TrainingRoom gandhi = new TrainingRoom();
		gandhi.projector = "Sanyo Projector.....";
		gandhi.learn("Classmate..");
		gandhi.learn("Deluxe...");
		gandhi.learn("Micro");
		
		TrainingRoom nehru = new TrainingRoom();
		nehru.projector = "Panasonic Projector...";
		TrainingRoom tagore = new TrainingRoom();
		tagore.projector = "Samsung Projector...";
		
		System.out.println("Projector in gandhi room...."+gandhi.projector);
		System.out.println("Projector in nehru room....."+nehru.projector);
		System.out.println("Projector in tagore room...."+tagore.projector);
		
		System.out.println("Toilet for gandhi room...."+gandhi.toilet);
		System.out.println("Toilet for nehru room...."+nehru.toilet);
		System.out.println("Toilet for tagore room..."+tagore.toilet);
		
	}

	
	

}
class TrainingRoom{
	String projector;
	static String toilet;
	public void learn(String notepad) {
		System.out.println(notepad);
	}
	
}
