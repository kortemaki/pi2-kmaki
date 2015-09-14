
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
import org.apache.uima.jcas.tcas.DocumentAnnotation_Type;

/** Document Annotation indicating the ngrams identified in the question for the document.
 * Updated by JCasGen Mon Sep 14 14:12:55 EDT 2015
 * @generated */
public class QuestionNgramSet_Type extends DocumentAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionNgramSet_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionNgramSet_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionNgramSet(addr, QuestionNgramSet_Type.this);
  			   QuestionNgramSet_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionNgramSet(addr, QuestionNgramSet_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionNgramSet.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("QuestionNgramSet");
 
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
      jcas.throwFeatMissing("ngrams", "QuestionNgramSet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngrams);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNgrams(int addr, int v) {
        if (featOkTst && casFeat_ngrams == null)
      jcas.throwFeatMissing("ngrams", "QuestionNgramSet");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngrams, v);}
    
  
 
  /** @generated */
  final Feature casFeat_n;
  /** @generated */
  final int     casFeatCode_n;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getN(int addr) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "QuestionNgramSet");
    return ll_cas.ll_getIntValue(addr, casFeatCode_n);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setN(int addr, int v) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "QuestionNgramSet");
    ll_cas.ll_setIntValue(addr, casFeatCode_n, v);}
    
  
 
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
      jcas.throwFeatMissing("annotator", "QuestionNgramSet");
    return ll_cas.ll_getStringValue(addr, casFeatCode_annotator);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotator(int addr, String v) {
        if (featOkTst && casFeat_annotator == null)
      jcas.throwFeatMissing("annotator", "QuestionNgramSet");
    ll_cas.ll_setStringValue(addr, casFeatCode_annotator, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QuestionNgramSet_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ngrams = jcas.getRequiredFeatureDE(casType, "ngrams", "uima.cas.FSList", featOkTst);
    casFeatCode_ngrams  = (null == casFeat_ngrams) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngrams).getCode();

 
    casFeat_n = jcas.getRequiredFeatureDE(casType, "n", "uima.cas.Integer", featOkTst);
    casFeatCode_n  = (null == casFeat_n) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_n).getCode();

 
    casFeat_annotator = jcas.getRequiredFeatureDE(casType, "annotator", "uima.cas.String", featOkTst);
    casFeatCode_annotator  = (null == casFeat_annotator) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotator).getCode();

  }
}



    