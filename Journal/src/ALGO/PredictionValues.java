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
		public boolean EUndecidableInner=false; 
		public boolean EBoundaryInner=false; 
		public boolean EUndecidableLeaf=false; 
		public boolean EBoundaryLeaf=false; 

		public boolean TPureTRoot=false; 
		public boolean NPureNRoot=false; 
		public boolean TMixedTRoot=false; 
		public boolean NMixedNRoot=false; 
		public boolean EUndecidableRoot=false; 
		public boolean EBoundaryRoot=false; 
		public boolean EIsolatedE=false; 
		
		public int TPureTInnerCount=0; 
		public int NPureNInnerCount=0; 
		public int TMixedTInnerCount=0; 
		public int NMixedNInnerCount=0; 
		public int TPureTLeafCount=0; 
		public int NPureNLeafCount=0; 
		public int TMixedTLeafCount=0; 
		public int NMixedNLeafCount=0; 
		public int EUndecidableInnerCount=0; 
		public int EBoundaryInnerCount=0; 
		public int EUndecidableLeafCount=0; 
		public int EBoundaryLeafCount=0; 
		public int EIsolatedECount=0; 
		public int ENotApplicableCount=0; 
		
		
		public int TPureTRootCount=0; 
		public int NPureNRootCount=0; 
		public int TMixedTRootCount=0; 
		public int NMixedNRootCount=0; 
		public int EUndecidableRootCount=0; 
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
