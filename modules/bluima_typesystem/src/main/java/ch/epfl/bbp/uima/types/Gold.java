

/* First created by JCasGen Wed May 29 20:18:14 CEST 2013 */
package ch.epfl.bbp.uima.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The gold annotation, coming from a corpus
 * Updated by JCasGen Fri Sep 20 01:02:03 CEST 2013
 * XML source: /Users/richarde/dev/bluebrain/svn_nlp/UIMA/blue_uima/trunk/modules/julielab_typesystem-2.6.8/src/main/resources/typeSystem/bbp-basic-types.xml
 * @generated */
public class Gold extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gold.class);
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
  protected Gold() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Gold(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Gold(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Gold(JCas jcas, int begin, int end) {
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
  //* Feature: typeS

  /** getter for typeS - gets 
   * @generated */
  public String getTypeS() {
    if (Gold_Type.featOkTst && ((Gold_Type)jcasType).casFeat_typeS == null)
      jcasType.jcas.throwFeatMissing("typeS", "ch.epfl.bbp.uima.types.Gold");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gold_Type)jcasType).casFeatCode_typeS);}
    
  /** setter for typeS - sets  
   * @generated */
  public void setTypeS(String v) {
    if (Gold_Type.featOkTst && ((Gold_Type)jcasType).casFeat_typeS == null)
      jcasType.jcas.throwFeatMissing("typeS", "ch.epfl.bbp.uima.types.Gold");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gold_Type)jcasType).casFeatCode_typeS, v);}    
  }

    