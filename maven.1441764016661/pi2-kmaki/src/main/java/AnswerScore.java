

/* First created by JCasGen Mon Sep 14 14:12:55 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Annotation indicating the score assigned to an answer choice for the document.
 * Updated by JCasGen Mon Sep 14 14:12:55 EDT 2015
 * XML source: /media/maki/OS/Users/Keith/Documents/CMU/Coursework/11791/PI2/pi2-kmaki/maven.1441764016661/pi2-kmaki/src/main/resources/pi2-kmaki-typesystem.xml
 * @generated */
public class AnswerScore extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScore.class);
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
  protected AnswerScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnswerScore(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets The score assigned to this answer by the analysis engine.
   * @generated
   * @return value of the feature 
   */
  public float getScore() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "AnswerScore");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets The score assigned to this answer by the analysis engine. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(float v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "AnswerScore");
    jcasType.ll_cas.ll_setFloatValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: annotator

  /** getter for annotator - gets The name of the annotator which produced this annotation.
   * @generated
   * @return value of the feature 
   */
  public String getAnnotator() {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "AnswerScore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_annotator);}
    
  /** setter for annotator - sets The name of the annotator which produced this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotator(String v) {
    if (AnswerScore_Type.featOkTst && ((AnswerScore_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "AnswerScore");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnswerScore_Type)jcasType).casFeatCode_annotator, v);}    
  }

    