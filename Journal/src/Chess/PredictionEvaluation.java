package Chess;

public class PredictionEvaluation {
	public int TruePositive=0; 
	public int TrueNegative=0; 
	public int FalsePositive=0; 
	public int FalseNegative=0;
	public int E=0; 
	public boolean TPMixed=false; 
	public boolean TNMixed=false; 
	public boolean FPMixed=false; 
	public boolean FNMixed=false;
	public boolean EBoundary=false; 
	public boolean TPMixedLeaf=false; 
	public boolean TNMixedLeaf=false; 
	public boolean FPMixedLeaf=false; 
	public boolean FNMixedLeaf=false;
	public boolean EIncomplete=false; 
	
	public boolean TPPure=false; 
	public boolean TNPure=false; 
	public boolean FPPure=false; 
	public boolean FNPure=false;
	public boolean EBoundaryLeaf=false; 
	public boolean TPPureLeaf=false; 
	public boolean TNPureLeaf=false; 
	public boolean FPPureLeaf=false; 
	public boolean FNPureLeaf=false;
	public boolean EIncompleteLeaf=false; 
	
	public int TPMixedInnerCount=0; 
	public int TNMixedInnerCount=0; 
	public int FPMixedInnerCount=0; 
	public int FNMixedInnerCount=0;
	public int TPMixedLeafCount=0; 
	public int TNMixedLeafCount=0; 
	public int FPMixedLeafCount=0; 
	public int FNMixedLeafCount=0;
	public int EUndecidableInnerCount=0; 
	public int EOutOfScopeCount=0; 

	public int TPPureInnerCount=0; 
	public int TNPureInnerCount=0; 
	public int FPPureInnerCount=0; 
	public int FNPureInnerCount=0;
	public int EBoundaryLeafCount=0; 
	public int TPPureLeafCount=0; 
	public int TNPureLeafCount=0; 
	public int FPPureLeafCount=0; 
	public int FNPureLeafCount=0;
	public int EUndecidableLeafCount=0; 
	public int EBoundaryRootCount=0; 
	public int EBoundaryInnerCount=0; 

	public int TPPureRootCount=0; 
	public int TNPureRootCount=0; 
	public int FPPureRootCount=0; 
	public int FNPureRootCount=0;
	public int EUndecidableRootCount=0; 
	public int TPMixedRootCount=0; 
	public int TNMixedRootCount=0; 
	public int EIsolatedECount=0; 
	public int FPMixedRootCount=0; 
	public int FNMixedRootCount=0; 
	public int ENotApplicableCount=0; 

	public int getE() {
		return E;
	}
	public void setE(int e) {
		E = e;
	}
	public int getTruePositive() {
		return TruePositive;
	}
	public void setTruePositive(int truePositive) {
		TruePositive = truePositive;
	}
	public int getTrueNegative() {
		return TrueNegative;
	}
	public void setTrueNegative(int trueNegative) {
		TrueNegative = trueNegative;
	}
	public int getFalsePositive() {
		return FalsePositive;
	}
	public void setFalsePositive(int falsePositive) {
		FalsePositive = falsePositive;
	}
	public int getFalseNegative() {
		return FalseNegative;
	}
	public void setFalseNegative(int falseNegative) {
		FalseNegative = falseNegative;
	}
	public PredictionEvaluation(int truePositive, int trueNegative, int falsePositive, int falseNegative) {
		super();
		TruePositive = truePositive;
		TrueNegative = trueNegative;
		FalsePositive = falsePositive;
		FalseNegative = falseNegative;
	}
	public  PredictionEvaluation() {
		// TODO Auto-generated constructor stub
	} 
	
	public String ComparePredictionToGold(String gold, String prediction) {
		if(gold.equals("T") && prediction.equals("T")) {
			return "TP"; 
		}
		else if(gold.equals("N") && prediction.equals("N")) {
			return "TN"; 
		}
		else if(gold.equals("T") && prediction.equals("N")) {
			return "FN"; 
		}
		else if(gold.equals("N") && prediction.equals("T")) {
			return "FP"; 
		}
		else {
			return "E"; 
		}
		
	}
	
	public void UpdateCounters(String value, PredictionEvaluation predictionEvaluation) {
		if(value!=null) {
			if(value.equals("TP")) {
				predictionEvaluation.TruePositive++; 
			}else if(value.equals("TN")) {
				predictionEvaluation.TrueNegative++; 
			}else if(value.equals("FN")) {
				predictionEvaluation.FalseNegative++; 
			}else if(value.equals("FP")) {
				predictionEvaluation.FalsePositive++; 

			}
			else if(value.equals("E")) {
				predictionEvaluation.E++; 

			}
	//	System.out.println(predictionEvaluation.toString());
		}
		
	}
	
	
	public void ResetCounters(PredictionEvaluation predictionEvaluation) {
		predictionEvaluation.setFalseNegative(0);
		predictionEvaluation.setTruePositive(0);
		predictionEvaluation.setTrueNegative(0);
		predictionEvaluation.setFalsePositive(0);
		predictionEvaluation.setE(0); 

		
	}
	@Override
	public String toString() {
		return "PredictionEvaluation [TruePositive=" + TruePositive + ", TrueNegative=" + TrueNegative
				+ ", FalsePositive=" + FalsePositive + ", FalseNegative=" + FalseNegative + ", E=" + E + "]";
	}
	
	
	
}
