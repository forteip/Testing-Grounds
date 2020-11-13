public class Firearms implements gun {
		int rounds = 0;
		public void fire(){
			rounds -= 1;
			System.out.println("bang!");
		}
		public void reload(int num){
			rounds = num;
			System.out.println("I reloaded "+ num +" bullets");
		}
		public static void main(String[] args){
			Firearms mygun = new Firearms();
			mygun.reload(6);
			mygun.fire();
			System.out.println(mygun.rounds +" bullets left");
			
		}

}

	
