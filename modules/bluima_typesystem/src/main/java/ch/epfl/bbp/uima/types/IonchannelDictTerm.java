

/* First created by JCasGen Mon Feb 17 12:26:53 CET 2014 */
package ch.epfl.bbp.uima.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Mon Feb 17 22:12:56 CET 2014
 * XML source: /Users/richarde/dev/bluebrain/git/Bluima/modules/bluima_typesystem/src/main/resources/typeSystem/bbp-types.xml
 * @generated */
public class IonchannelDictTerm extends DictTerm {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(IonchannelDictTerm.class);
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
  protected IonchannelDictTerm() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public IonchannelDictTerm(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public IonchannelDictTerm(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public IonchannelDictTerm(JCas jcas, int begin, int end) {
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
     
}

    