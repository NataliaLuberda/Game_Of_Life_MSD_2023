import java.util.ArrayList;

public class Point {
	private ArrayList<Point> neighbors;
	private int currentState;
	private int nextState;
	private int numStates = 6;
	
	public Point() {
		currentState = 0;
		nextState = 0;
		neighbors = new ArrayList<Point>();

	}

	public void clicked() {
		currentState=(++currentState)%numStates;	
	}
	
	public int getState() {
		return currentState;
	}

	public void setState(int s) {
		currentState = s;
	}

	public void calculateNewState() {
		//TODO: insert logic which updates according to currentState and 
		//number of active neighbors;
		int active = this.activeNeighbors();
		// FIRST TASK: 23/3		
		// if(this.currentState == 0){
		// 	if(active == 3){
		// 		this.nextState = 1;
		// 	}
		// }else if(active == 2 || active ==3 ){
		// 	this.nextState = 1;
		// }else{
		// 	this.nextState = 0;
		// // }
		// TASK 2: 2345/45678 - cities
		// if(this.currentState == 0){
		// 	if(active == 6 || active ==4 || active == 5 || active ==7 || active == 8 ){
		// 		this.nextState = 1;
		// 	}
		// }else if(active == 2 || active == 3|| active == 4 || active == 5){
		// 	this.nextState = 1;
		// }else{
		// 	this.nextState = 0;
		// }
		//TASK 3: 45678/3 - coral
		// if(this.currentState == 0){
		// 	if(active == 3){
		// 		this.nextState = 1;
		// 	}
		// }else if(active == 5 || active == 4|| active == 6 || active == 7 || active ==8  ){
		// 	this.nextState = 1;
		// }else{
		// 	this.nextState = 0;
		// }

	}

	public void changeState() {
		currentState = nextState;
	}
	
	public void addNeighbor(Point nei) {
		neighbors.add(nei);
	}
	
	//TODO: write method counting all active neighbors of THIS point
	public int activeNeighbors(){
		int activeneighbor = 0;
		for(Point neighbor : neighbors){
			if(neighbor.currentState != 0 ){
				activeneighbor++;
			};

		}
		return activeneighbor;
	}
}
