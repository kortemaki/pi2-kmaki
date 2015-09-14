

/* First created by JCasGen Mon Sep 14 14:12:55 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** Annotation indicating the tokens identified in this answer choice.
 * Updated by JCasGen Mon Sep 14 14:12:55 EDT 2015
 * XML source: /media/maki/OS/Users/Keith/Documents/CMU/Coursework/11791/PI2/pi2-kmaki/maven.1441764016661/pi2-kmaki/src/main/resources/pi2-kmaki-typesystem.xml
 * @generated */
public class AnswerTokenization extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerTokenization.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnswerTokenization() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerTokenization(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerTokenization(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnswerTokenization(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets The tokens identified in the answer.
   * @generated
   * @return value of the feature 
   */
  public FSList getTokens() {
    if (AnswerTokenization_Type.featOkTst && ((AnswerTokenization_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "AnswerTokenization");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerTokenization_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets The tokens identified in the answer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokens(FSList v) {
    if (AnswerTokenization_Type.featOkTst && ((AnswerTokenization_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "AnswerTokenization");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerTokenization_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: annotator

  /** getter for annotator - gets The name of the annotator which produced this annotation.
   * @generated
   * @return value of the feature 
   */
  public String getAnnotator() {
    if (AnswerTokenization_Type.featOkTst && ((AnswerTokenization_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "AnswerTokenization");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnswerTokenization_Type)jcasType).casFeatCode_annotator);}
    
  /** setter for annotator - sets The name of the annotator which produced this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotator(String v) {
    if (AnswerTokenization_Type.featOkTst && ((AnswerTokenization_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "AnswerTokenization");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnswerTokenization_Type)jcasType).casFeatCode_annotator, v);}    
  }

    