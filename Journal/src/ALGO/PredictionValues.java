package ALGO;

import mypackage.*;

public class PredictionValues {
		public int T=0; 
		public int N=0; 
		public int E=0;
		public boolean TPureTInner=false; 
		public boolean NPureNInner=false; 
		public boolean TMixedTInner=false; 
		public boolean NMixedNInner=false; 
		public boolean TPureTLeaf=false; 
		public boolean NPureNLeaf=false; 
		public boolean TMixedTLeaf=false; 
		public boolean NMixedNLeaf=false; 
		public boolean EIncompleteInner=false; 
		public boolean EBoundaryInner=false; 
		public boolean EIncompleteLeaf=false; 
		public boolean EBoundaryLeaf=false; 
		public boolean EIsolated=false; 

		public boolean TPureTRoot=false; 
		public boolean NPureNRoot=false; 
		public boolean TMixedTRoot=false; 
		public boolean NMixedNRoot=false; 
		public boolean EIncompleteRoot=false; 
		public boolean EBoundaryRoot=false; 
		
		public int TPureTCount=0; 
		public int NPureNCount=0; 
		public int TMixedTCount=0; 
		public int NMixedNCount=0; 
		public int TPureTLeafCount=0; 
		public int NPureNLeafCount=0; 
		public int TMixedTLeafCount=0; 
		public int NMixedNLeafCount=0; 
		public int EIncompleteCount=0; 
		public int EBoundaryCount=0; 
		public int EIncompleteLeafCount=0; 
		public int EBoundaryLeafCount=0; 
		public int EOutOfScopeCount=0; 

		public int TPureTRootCount=0; 
		public int NPureNRootCount=0; 
		public int TMixedTRootCount=0; 
		public int NMixedNRootCount=0; 
		public int EIncompleteRootCount=0; 
		public int EBoundaryRootCount=0; 
		
		
		
		
		
		public int getT() {
			return T;
		}
		public void setT(int t) {
			T = t;
		}
		public int getN() {
			return N;
		}
		public void setN(int n) {
			N = n;
		}
		public int getE() {
			return E;
		}
		public void setE(int e) {
			E = e;
		}
		@Override
		public String toString() {
			return "PredictionValues [T=" + T + ", N=" + N + ", E=" + E + "]";
		}
		public void ComputePredictionValues(PredictionValues remainingpredictionValues, String  prediction) {
			
			// TODO Auto-generated method stub
			if(prediction.trim().equals("T")) {
				remainingpredictionValues.T++; 
			}else if(prediction.trim().equals("N")) {
				remainingpredictionValues.N++; 
			}else {
				remainingpredictionValues.E++; 

			}
		}
		public PredictionValues(int t, int n, int e) {
			super();
			T = t;
			N = n;
			E = e;
		} 
		
		public PredictionValues() {} 
		
		
}
