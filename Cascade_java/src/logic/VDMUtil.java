//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2013-12-05 by the VDM++ to JAVA Code Generator
// (v9.0.2 - Thu 14-Mar-2013 12:36:47 +0900)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// This file was genereted from "D:\\Workspace\\MFES\\Project\\Cascade\\lib\\VDMUtil.vdmpp".

// ***** VDMTOOLS START Name=package KEEP=NO
package logic;
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.Tuple;
import jp.vdmtools.VDM.Sentinel;
import jp.vdmtools.VDM.EvaluatePP;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class VDMUtil implements EvaluatePP {

// ***** VDMTOOLS START Name=sentinel KEEP=NO
  volatile Sentinel sentinel;
// ***** VDMTOOLS END Name=sentinel


// ***** VDMTOOLS START Name=VDMUtilSentinel KEEP=NO
  class VDMUtilSentinel extends Sentinel {

    public final int nr_functions = 0;


    public VDMUtilSentinel () throws CGException {}


    public VDMUtilSentinel (EvaluatePP instance) throws CGException {
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=VDMUtilSentinel
;

// ***** VDMTOOLS START Name=evaluatePP#1|int KEEP=NO
  public Boolean evaluatePP (int fnr) throws CGException {
    return Boolean.TRUE;
  }
// ***** VDMTOOLS END Name=evaluatePP#1|int


// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try {
      sentinel = new VDMUtilSentinel(this);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel

// ***** VDMTOOLS START Name=child KEEP=NO
  static protected external_VDMUtil child = new external_VDMUtil();
// ***** VDMTOOLS END Name=child


// ***** VDMTOOLS START Name=vdm_init_VDMUtil KEEP=NO
  private void vdm_init_VDMUtil () {
    try {
      setSentinel();
    }
    catch (Exception e) {
      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_VDMUtil


// ***** VDMTOOLS START Name=VDMUtil KEEP=NO
  public VDMUtil () throws CGException {
    vdm_init_VDMUtil();
  }
// ***** VDMTOOLS END Name=VDMUtil


// ***** VDMTOOLS START Name=set2seq#1|Set KEEP=NO
  static public List set2seq (final Set x) throws CGException {
    List childResult_2 = child.impl_set2seq(x);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=set2seq#1|Set


// ***** VDMTOOLS START Name=get_file_pos KEEP=NO
  static public Tuple get_file_pos () throws CGException {
    Tuple childResult_1 = child.impl_get_file_pos();
    return childResult_1;
  }
// ***** VDMTOOLS END Name=get_file_pos


// ***** VDMTOOLS START Name=val2seq_of_char#1|Object KEEP=NO
  static public String val2seq_of_char (final Object x) throws CGException {
    String childResult_2 = child.impl_val2seq_of_char(x);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=val2seq_of_char#1|Object


// ***** VDMTOOLS START Name=seq_of_char2val#1|String KEEP=NO
  static public Tuple seq_of_char2val (final String s) throws CGException {
    Tuple childResult_2 = child.impl_seq_of_char2val(s);
    if (!post_seq_of_char2val(s, childResult_2).booleanValue()) 
      UTIL.RunTime("Postcondition failure in seq_of_char2val");
    return childResult_2;
  }
// ***** VDMTOOLS END Name=seq_of_char2val#1|String


// ***** VDMTOOLS START Name=post_seq_of_char2val#2|String|Tuple KEEP=NO
  static public Boolean post_seq_of_char2val (final String s, final Tuple RESULT) throws CGException {
    Boolean varRes_3 = null;
    {
      boolean succ_4 = false;
      Tuple tmpVal_5 = RESULT;
      Boolean b = null;
      Object t = null;
      /* mk_(b, t) */
      if (2 == tmpVal_5.Length()) {
        succ_4 = true;
        /* b */
        b = (Boolean)tmpVal_5.GetField(1);
        /* t */
        t = (Object)tmpVal_5.GetField(2);
      }
      else 
        succ_4 = false;
      if (!succ_4) 
        UTIL.RunTime("Pattern match did not succeed in value definition");
      if (!b.booleanValue()) 
        varRes_3 = Boolean.valueOf(UTIL.equals(t, null));
      else 
        varRes_3 = Boolean.TRUE;
    }
    return varRes_3;
  }
// ***** VDMTOOLS END Name=post_seq_of_char2val#2|String|Tuple


// ***** VDMTOOLS START Name=classname#1|Object KEEP=NO
  static public String classname (final Object s) throws CGException {
    String childResult_2 = child.impl_classname(s);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=classname#1|Object

}
;
