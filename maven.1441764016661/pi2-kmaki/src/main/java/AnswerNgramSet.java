

/* First created by JCasGen Mon Sep 14 14:12:55 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** Annotation indicating the ngrams identified in an answer choice for the document.
 * Updated by JCasGen Mon Sep 14 14:12:55 EDT 2015
 * XML source: /media/maki/OS/Users/Keith/Documents/CMU/Coursework/11791/PI2/pi2-kmaki/maven.1441764016661/pi2-kmaki/src/main/resources/pi2-kmaki-typesystem.xml
 * @generated */
public class AnswerNgramSet extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerNgramSet.class);
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
  protected AnswerNgramSet() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerNgramSet(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerNgramSet(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnswerNgramSet(JCas jcas, int begin, int end) {
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
  //* Feature: ngrams

  /** getter for ngrams - gets List of ngrams identified for the given cardinality n for this answer.
   * @generated
   * @return value of the feature 
   */
  public FSArray getNgrams() {
    if (AnswerNgramSet_Type.featOkTst && ((AnswerNgramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "AnswerNgramSet");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_ngrams)));}
    
  /** setter for ngrams - sets List of ngrams identified for the given cardinality n for this answer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNgrams(FSArray v) {
    if (AnswerNgramSet_Type.featOkTst && ((AnswerNgramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "AnswerNgramSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_ngrams, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngrams - gets an indexed value - List of ngrams identified for the given cardinality n for this answer.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Annotation getNgrams(int i) {
    if (AnswerNgramSet_Type.featOkTst && ((AnswerNgramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "AnswerNgramSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_ngrams), i);
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_ngrams), i)));}

  /** indexed setter for ngrams - sets an indexed value - List of ngrams identified for the given cardinality n for this answer.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setNgrams(int i, Annotation v) { 
    if (AnswerNgramSet_Type.featOkTst && ((AnswerNgramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "AnswerNgramSet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_ngrams), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_ngrams), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: n

  /** getter for n - gets The cardinality of the ngrams identified in this QuestionNgramSet.
   * @generated
   * @return value of the feature 
   */
  public int getN() {
    if (AnswerNgramSet_Type.featOkTst && ((AnswerNgramSet_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "AnswerNgramSet");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets The cardinality of the ngrams identified in this QuestionNgramSet. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setN(int v) {
    if (AnswerNgramSet_Type.featOkTst && ((AnswerNgramSet_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "AnswerNgramSet");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_n, v);}    
   
    
  //*--------------*
  //* Feature: annotator

  /** getter for annotator - gets The name of the annotator which produced this annotation.
   * @generated
   * @return value of the feature 
   */
  public String getAnnotator() {
    if (AnswerNgramSet_Type.featOkTst && ((AnswerNgramSet_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "AnswerNgramSet");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_annotator);}
    
  /** setter for annotator - sets The name of the annotator which produced this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotator(String v) {
    if (AnswerNgramSet_Type.featOkTst && ((AnswerNgramSet_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "AnswerNgramSet");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnswerNgramSet_Type)jcasType).casFeatCode_annotator, v);}    
  }

    