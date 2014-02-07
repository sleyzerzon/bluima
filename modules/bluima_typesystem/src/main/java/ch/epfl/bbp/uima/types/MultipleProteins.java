

/* First created by JCasGen Wed Oct 24 10:17:31 CEST 2012 */
package ch.epfl.bbp.uima.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Oct 21 13:03:29 CEST 2013
 * XML source: /Users/richarde/dev/bluebrain/svn_nlp/UIMA/blue_uima/trunk/modules/julielab_typesystem-2.6.8/src/main/resources/typeSystem/bbp-semantics-biology-types.xml
 * @generated */
public class MultipleProteins extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MultipleProteins.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected MultipleProteins() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MultipleProteins(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MultipleProteins(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public MultipleProteins(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: present

  /** getter for present - gets 1 if present
   * @generated */
  public int getPresent() {
    if (MultipleProteins_Type.featOkTst && ((MultipleProteins_Type)jcasType).casFeat_present == null)
      jcasType.jcas.throwFeatMissing("present", "ch.epfl.bbp.uima.types.MultipleProteins");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MultipleProteins_Type)jcasType).casFeatCode_present);}
    
  /** setter for present - sets 1 if present 
   * @generated */
  public void setPresent(int v) {
    if (MultipleProteins_Type.featOkTst && ((MultipleProteins_Type)jcasType).casFeat_present == null)
      jcasType.jcas.throwFeatMissing("present", "ch.epfl.bbp.uima.types.MultipleProteins");
    jcasType.ll_cas.ll_setIntValue(addr, ((MultipleProteins_Type)jcasType).casFeatCode_present, v);}    
  }

    