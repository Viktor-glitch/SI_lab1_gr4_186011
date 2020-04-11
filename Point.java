class Point {
	String id;
	double x,y;

	//TODO add new variable
	String boja;
	//TODO constructor
	Point(id, x, y, boja){
		this.id = id;
		this.x = x;
		this.y = y;
		this.boja = boja;
	}

	//TODO setters and getters
	void setId(id){
		this.id = id;
	}
	void setId(x){
		this.x = x;
	}
	void setId(y){
		this.y = y;
	}
	void setId(boja){
		this.boja = boja;
	}
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	char getId(){
		return id;
	}
	char getBoja(){
		return boja;
	}

	public void move (char xDirection, char yDirection) {
		//TODO

	}

	public void draw () {
		//TODO
	}



}


class Canvas{
	List<Point> lista;

	void dodadiTocka(Point) {
		lista.add(Point);
	}
	int srednaXTocka() {
		br = 0;
		for(int i=0;i<lista.size(),i++) {
			br += lista[i].getX();
		}
		return br / lista.size()
	}

}