

/* First created by JCasGen Mon Sep 14 14:12:55 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.DocumentAnnotation;


/** Document annotation indicating the question for the document.
 * Updated by JCasGen Mon Sep 14 14:12:55 EDT 2015
 * XML source: /media/maki/OS/Users/Keith/Documents/CMU/Coursework/11791/PI2/pi2-kmaki/maven.1441764016661/pi2-kmaki/src/main/resources/pi2-kmaki-typesystem.xml
 * @generated */
public class Question extends DocumentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Question(JCas jcas, int begin, int end) {
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

  /** getter for begin - gets The beginning of the span of annotation.
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets The beginning of the span of annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets The end of the span of annotation.
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "Question");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Question_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets The end of the span of annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "Question");
    jcasType.ll_cas.ll_setIntValue(addr, ((Question_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: answers

  /** getter for answers - gets Array of the answer choices for this question.
   * @generated
   * @return value of the feature 
   */
  public FSArray getAnswers() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets Array of the answer choices for this question. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswers(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for answers - gets an indexed value - Array of the answer choices for this question.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Answer getAnswers(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers), i)));}

  /** indexed setter for answers - sets an indexed value - Array of the answer choices for this question.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAnswers(int i, Answer v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_answers), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: tokenization

  /** getter for tokenization - gets The tokens identified for this question.
   * @generated
   * @return value of the feature 
   */
  public FSList getTokenization() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenization == null)
      jcasType.jcas.throwFeatMissing("tokenization", "Question");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenization)));}
    
  /** setter for tokenization - sets The tokens identified for this question. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokenization(FSList v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenization == null)
      jcasType.jcas.throwFeatMissing("tokenization", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenization, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngrams

  /** getter for ngrams - gets Array of ngram sets identified for this question.
   * @generated
   * @return value of the feature 
   */
  public FSArray getNgrams() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngrams)));}
    
  /** setter for ngrams - sets Array of ngram sets identified for this question. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNgrams(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngrams - gets an indexed value - Array of ngram sets identified for this question.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public QuestionNgramSet getNgrams(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngrams), i);
    return (QuestionNgramSet)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngrams), i)));}

  /** indexed setter for ngrams - sets an indexed value - Array of ngram sets identified for this question.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNgrams(int i, QuestionNgramSet v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngrams), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngrams), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: annotator

  /** getter for annotator - gets The name of the test element annotator which produced this annotation.
   * @generated
   * @return value of the feature 
   */
  public String getAnnotator() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "Question");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Question_Type)jcasType).casFeatCode_annotator);}
    
  /** setter for annotator - sets The name of the test element annotator which produced this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotator(String v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "Question");
    jcasType.ll_cas.ll_setStringValue(addr, ((Question_Type)jcasType).casFeatCode_annotator, v);}    
  }

    