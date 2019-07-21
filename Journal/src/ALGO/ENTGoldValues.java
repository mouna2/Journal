package ALGO;

public class ENTGoldValues {
	int E=0; 
	int N=0; 
	int T=0;
	public int getE() {
		return E;
	}
	public void setE(int e) {
		E = e;
	}
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
	public int getT() {
		return T;
	}
	public void setT(int t) {
		T = t;
	}
	public ENTGoldValues(int e, int n, int t) {
		E = e;
		N = n;
		T = t;
	}
	@Override
	public String toString() {
		return "ENTGoldValues [E=" + E + ", N=" + N + ", T=" + T + "]";
	}

	
	
	
	
}
