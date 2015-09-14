
/* First created by JCasGen Mon Sep 14 14:12:55 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Annotation indicating an answer choice for the document.
 * Updated by JCasGen Mon Sep 14 14:12:55 EDT 2015
 * @generated */
public class Answer_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Answer");
 
  /** @generated */
  final Feature casFeat_begin;
  /** @generated */
  final int     casFeatCode_begin;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_begin);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_begin == null)
      jcas.throwFeatMissing("begin", "Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "Answer");
    return ll_cas.ll_getIntValue(addr, casFeatCode_end);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "Answer");
    ll_cas.ll_setIntValue(addr, casFeatCode_end, v);}
    
  
 
  /** @generated */
  final Feature casFeat_correct;
  /** @generated */
  final int     casFeatCode_correct;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getCorrect(int addr) {
        if (featOkTst && casFeat_correct == null)
      jcas.throwFeatMissing("correct", "Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_correct);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCorrect(int addr, boolean v) {
        if (featOkTst && casFeat_correct == null)
      jcas.throwFeatMissing("correct", "Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_correct, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenization;
  /** @generated */
  final int     casFeatCode_tokenization;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTokenization(int addr) {
        if (featOkTst && casFeat_tokenization == null)
      jcas.throwFeatMissing("tokenization", "Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenization);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTokenization(int addr, int v) {
        if (featOkTst && casFeat_tokenization == null)
      jcas.throwFeatMissing("tokenization", "Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenization, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ngrams;
  /** @generated */
  final int     casFeatCode_ngrams;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNgrams(int addr) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngrams);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNgrams(int addr, int v) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngrams, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getNgrams(int addr, int i) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setNgrams(int addr, int i, int v) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngrams), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_scoring;
  /** @generated */
  final int     casFeatCode_scoring;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScoring(int addr) {
        if (featOkTst && casFeat_scoring == null)
      jcas.throwFeatMissing("scoring", "Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scoring);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScoring(int addr, int v) {
        if (featOkTst && casFeat_scoring == null)
      jcas.throwFeatMissing("scoring", "Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_scoring, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotator;
  /** @generated */
  final int     casFeatCode_annotator;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAnnotator(int addr) {
        if (featOkTst && casFeat_annotator == null)
      jcas.throwFeatMissing("annotator", "Answer");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotator);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotator(int addr, String v) {
        if (featOkTst && casFeat_annotator == null)
      jcas.throwFeatMissing("annotator", "Answer");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotator, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_begin = jcas.getRequiredFeatureDE(casType, "begin", "uima.cas.Integer", featOkTst);
    casFeatCode_begin  = (null == casFeat_begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_begin).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

 
    casFeat_correct = jcas.getRequiredFeatureDE(casType, "correct", "uima.cas.Boolean", featOkTst);
    casFeatCode_correct  = (null == casFeat_correct) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_correct).getCode();

 
    casFeat_tokenization = jcas.getRequiredFeatureDE(casType, "tokenization", "AnswerTokenization", featOkTst);
    casFeatCode_tokenization  = (null == casFeat_tokenization) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenization).getCode();

 
    casFeat_ngrams = jcas.getRequiredFeatureDE(casType, "ngrams", "uima.cas.FSArray", featOkTst);
    casFeatCode_ngrams  = (null == casFeat_ngrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngrams).getCode();

 
    casFeat_scoring = jcas.getRequiredFeatureDE(casType, "scoring", "AnswerScore", featOkTst);
    casFeatCode_scoring  = (null == casFeat_scoring) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scoring).getCode();

 
    casFeat_annotator = jcas.getRequiredFeatureDE(casType, "annotator", "uima.cas.String", featOkTst);
    casFeatCode_annotator  = (null == casFeat_annotator) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotator).getCode();

  }
}



    