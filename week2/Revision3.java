
public class Revision3 {

	public static void main(String[] args) {
		GoldenTouch.hit = new HarrisInfotech();
		
		GoldenTouch curie = new GoldenTouch();
		curie.slack = new Slack();
		curie.learn(new Github());
		curie.learn(new Github());
		curie.learn(new Github());

		GoldenTouch eve = new GoldenTouch();
		eve.slack = new Slack();
		
		GoldenTouch aspire = new GoldenTouch();
		aspire.slack = new Slack();
		
		System.out.println("Slack of curie...."+curie.slack);
		System.out.println("Slack of eve...."+eve.slack);
		System.out.println("Slack of aspire...."+aspire.slack);
		
		System.out.println("Faculty of curie..."+GoldenTouch.hit);
		System.out.println("Faculty of eve...."+GoldenTouch.hit);
		System.out.println("Faculty of aspire..."+GoldenTouch.hit);

	}

}

class GoldenTouch{
	static HarrisInfotech hit;
	Slack slack;
	public void learn(Github git) {
		System.out.println("curie student...."+git);
	}
	
}
class Slack{
}
class Github{}
class HarrisInfotech{}
