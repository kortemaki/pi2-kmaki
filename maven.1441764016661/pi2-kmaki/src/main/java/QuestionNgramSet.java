

/* First created by JCasGen Mon Sep 14 14:12:55 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.DocumentAnnotation;


/** Document Annotation indicating the ngrams identified in the question for the document.
 * Updated by JCasGen Mon Sep 14 14:12:55 EDT 2015
 * XML source: /media/maki/OS/Users/Keith/Documents/CMU/Coursework/11791/PI2/pi2-kmaki/maven.1441764016661/pi2-kmaki/src/main/resources/pi2-kmaki-typesystem.xml
 * @generated */
public class QuestionNgramSet extends DocumentAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuestionNgramSet.class);
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
  protected QuestionNgramSet() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QuestionNgramSet(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuestionNgramSet(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QuestionNgramSet(JCas jcas, int begin, int end) {
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

  /** getter for ngrams - gets List of ngrams identified for the given cardinality n for this question.
   * @generated
   * @return value of the feature 
   */
  public FSList getNgrams() {
    if (QuestionNgramSet_Type.featOkTst && ((QuestionNgramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "QuestionNgramSet");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((QuestionNgramSet_Type)jcasType).casFeatCode_ngrams)));}
    
  /** setter for ngrams - sets List of ngrams identified for the given cardinality n for this question. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNgrams(FSList v) {
    if (QuestionNgramSet_Type.featOkTst && ((QuestionNgramSet_Type)jcasType).casFeat_ngrams == null)
      jcasType.jcas.throwFeatMissing("ngrams", "QuestionNgramSet");
    jcasType.ll_cas.ll_setRefValue(addr, ((QuestionNgramSet_Type)jcasType).casFeatCode_ngrams, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: n

  /** getter for n - gets The cardinality of the ngrams identified in this QuestionNgramSet.
   * @generated
   * @return value of the feature 
   */
  public int getN() {
    if (QuestionNgramSet_Type.featOkTst && ((QuestionNgramSet_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "QuestionNgramSet");
    return jcasType.ll_cas.ll_getIntValue(addr, ((QuestionNgramSet_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets The cardinality of the ngrams identified in this QuestionNgramSet. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setN(int v) {
    if (QuestionNgramSet_Type.featOkTst && ((QuestionNgramSet_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "QuestionNgramSet");
    jcasType.ll_cas.ll_setIntValue(addr, ((QuestionNgramSet_Type)jcasType).casFeatCode_n, v);}    
   
    
  //*--------------*
  //* Feature: annotator

  /** getter for annotator - gets The name of the annotator which produced this annotation.
   * @generated
   * @return value of the feature 
   */
  public String getAnnotator() {
    if (QuestionNgramSet_Type.featOkTst && ((QuestionNgramSet_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "QuestionNgramSet");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QuestionNgramSet_Type)jcasType).casFeatCode_annotator);}
    
  /** setter for annotator - sets The name of the annotator which produced this annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotator(String v) {
    if (QuestionNgramSet_Type.featOkTst && ((QuestionNgramSet_Type)jcasType).casFeat_annotator == null)
      jcasType.jcas.throwFeatMissing("annotator", "QuestionNgramSet");
    jcasType.ll_cas.ll_setStringValue(addr, ((QuestionNgramSet_Type)jcasType).casFeatCode_annotator, v);}    
  }

    