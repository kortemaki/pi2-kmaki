

/* First created by JCasGen Mon Sep 14 14:12:55 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** Annotation indicating an answer choice for the document.
 * Updated by JCasGen Mon Sep 14 14:12:55 EDT 2015
 * XML source: /media/maki/OS/Users/Keith/Documents/CMU/Coursework/11791/PI2/pi2-kmaki/maven.1441764016661/pi2-kmaki/src/main/resources/pi2-kmaki-typesystem.xml
 * @generated */
public class Answer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: begin

  /** getter for begin - gets The beginning of the span of annotation for this answer choice.
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets The beginning of the span of annotation for this answer choice. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets The end of the span of annotation for this answer choice.
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets The end of the span of annotation for this answer choice. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: correct

  /** getter for correct - gets Boolean indicating correctness of this answer choice under "gold" labels.
   * @generated
   * @return value of the feature 
   */
  public boolean getCorrect() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_correct);}
    
  /** setter for correct - sets Boolean indicating correctness of this answer choice under "gold" labels. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCorrect(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_correct == null)
      jcasType.jcas.throwFeatMissing("correct", "Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_correct, v);}    
   
    
  //*--------------*
  //* Feature: tokenization

  /** getter for tokenization - gets The result of tokenizing this answer choice.
   * @generated
   * @return value of the feature 
   */
  public AnswerTokenization getTokenization() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenization == null)
      jcasType.jcas.throwFeatMissing("tokenization", "Answer");
    return (AnswerTokenization)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenization)));}
    
  /** setter for tokenization - sets The result of tokenizing this answer choice. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenization(AnswerTokenization v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenization == null)
      jcasType.jcas.throwFeatMissing("tokenization", "Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenization, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngrams

  /** getter for ngrams - gets Array of ngram sets resulting from ngram annotation on this answer choice.
   * @generated
   * @return value of the feature 
   */
  public FSArray getNgrams() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngrams)));}
    
  /** setter for ngrams - sets Array of ngram sets resulting from ngram annotation on this answer choice. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNgrams(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngrams - gets an indexed value - Array of ngram sets resulting from ngram annotation on this answer choice.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnswerNgramSet getNgrams(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngrams), i);
    return (AnswerNgramSet)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngrams), i)));}

  /** indexed setter for ngrams - sets an indexed value - Array of ngram sets resulting from ngram annotation on this answer choice.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNgrams(int i, AnswerNgramSet v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngrams), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngrams), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: scoring

  /** getter for scoring - gets The result of scoring this answer choice.
   * @generated
   * @return value of the feature 
   */
  public AnswerScore getScoring() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_scoring == null)
      jcasType.jcas.throwFeatMissing("scoring", "Answer");
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_scoring)));}
    
  /** setter for scoring - sets The result of scoring this answer choice. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScoring(AnswerScore v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_scoring == null)
      jcasType.jcas.throwFeatMissing("scoring", "Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_scoring, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: annotator

  /** getter for annotator - gets The name of the test element annotator which produced this annotation.
   * @generated
   * @return value of the feature 
   */
  public String getAnnotator() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_annotator);}
    
  /** setter for annotator - sets The name of the test element annotator which produced this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotator(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_annotator, v);}    
  }

    