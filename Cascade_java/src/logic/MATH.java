//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2013-12-08 by the VDM++ to JAVA Code Generator
// (v9.0.2 - Thu 14-Mar-2013 12:36:47 +0900)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// This file was genereted from "D:\\Workspace\\MFES\\Project\\Cascade\\lib/MATH.vpp".

// ***** VDMTOOLS START Name=package KEEP=NO
package logic;
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO
import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.Sentinel;
import jp.vdmtools.VDM.EvaluatePP;
import jp.vdmtools.VDM.CGException;
// ***** VDMTOOLS END Name=imports



public class MATH implements EvaluatePP {

// ***** VDMTOOLS START Name=sentinel KEEP=NO
  volatile Sentinel sentinel;
// ***** VDMTOOLS END Name=sentinel


// ***** VDMTOOLS START Name=MATHSentinel KEEP=NO
  class MATHSentinel extends Sentinel {

    public final int rand = 0;

    public final int srand = 1;

    public final int srand2 = 2;

    public final int nr_functions = 3;


    public MATHSentinel () throws CGException {}


    public MATHSentinel (EvaluatePP instance) throws CGException {
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=MATHSentinel
;

// ***** VDMTOOLS START Name=evaluatePP#1|int KEEP=NO
  public Boolean evaluatePP (int fnr) throws CGException {
    return Boolean.TRUE;
  }
// ***** VDMTOOLS END Name=evaluatePP#1|int


// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try {
      sentinel = new MATHSentinel(this);
    }
    catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel

// ***** VDMTOOLS START Name=child KEEP=NO
  static protected external_MATH child = new external_MATH();
// ***** VDMTOOLS END Name=child

// ***** VDMTOOLS START Name=pi KEEP=NO
  public static final Number pi = new Double(3.141592653589793);
// ***** VDMTOOLS END Name=pi


// ***** VDMTOOLS START Name=vdm_init_MATH KEEP=NO
  private void vdm_init_MATH () {
    try {
      setSentinel();
    }
    catch (Exception e) {
      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_MATH


// ***** VDMTOOLS START Name=MATH KEEP=NO
  public MATH () throws CGException {
    vdm_init_MATH();
  }
// ***** VDMTOOLS END Name=MATH


// ***** VDMTOOLS START Name=sin#1|Number KEEP=NO
  static public Number sin (final Number v) throws CGException {
    Number childResult_2 = child.impl_sin(v);
    if (!post_sin(v, childResult_2).booleanValue()) 
      UTIL.RunTime("Postcondition failure in sin");
    return childResult_2;
  }
// ***** VDMTOOLS END Name=sin#1|Number


// ***** VDMTOOLS START Name=post_sin#2|Number|Number KEEP=NO
  static public Boolean post_sin (final Number v, final Number RESULT) throws CGException {
    return Boolean.valueOf(Math.abs(RESULT.doubleValue()) <= 1);
  }
// ***** VDMTOOLS END Name=post_sin#2|Number|Number


// ***** VDMTOOLS START Name=cos#1|Number KEEP=NO
  static public Number cos (final Number v) throws CGException {
    Number childResult_2 = child.impl_cos(v);
    if (!post_cos(v, childResult_2).booleanValue()) 
      UTIL.RunTime("Postcondition failure in cos");
    return childResult_2;
  }
// ***** VDMTOOLS END Name=cos#1|Number


// ***** VDMTOOLS START Name=post_cos#2|Number|Number KEEP=NO
  static public Boolean post_cos (final Number v, final Number RESULT) throws CGException {
    return Boolean.valueOf(Math.abs(RESULT.doubleValue()) <= 1);
  }
// ***** VDMTOOLS END Name=post_cos#2|Number|Number


// ***** VDMTOOLS START Name=tan#1|Number KEEP=NO
  static public Number tan (final Number a) throws CGException {
    if (!pre_tan(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in tan");
    Number childResult_2 = child.impl_tan(a);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=tan#1|Number


// ***** VDMTOOLS START Name=pre_tan#1|Number KEEP=NO
  static public Boolean pre_tan (final Number a) throws CGException {
    return Boolean.valueOf(!(cos(a).doubleValue() == 0));
  }
// ***** VDMTOOLS END Name=pre_tan#1|Number


// ***** VDMTOOLS START Name=cot#1|Number KEEP=NO
  static public Number cot (final Number a) throws CGException {
    if (!pre_cot(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in cot");
    Number childResult_2 = child.impl_cot(a);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=cot#1|Number


// ***** VDMTOOLS START Name=pre_cot#1|Number KEEP=NO
  static public Boolean pre_cot (final Number a) throws CGException {
    return Boolean.valueOf(!(sin(a).doubleValue() == 0));
  }
// ***** VDMTOOLS END Name=pre_cot#1|Number


// ***** VDMTOOLS START Name=asin#1|Number KEEP=NO
  static public Number asin (final Number a) throws CGException {
    if (!pre_asin(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in asin");
    Number childResult_2 = child.impl_asin(a);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=asin#1|Number


// ***** VDMTOOLS START Name=pre_asin#1|Number KEEP=NO
  static public Boolean pre_asin (final Number a) throws CGException {
    return Boolean.valueOf(Math.abs(a.doubleValue()) <= 1);
  }
// ***** VDMTOOLS END Name=pre_asin#1|Number


// ***** VDMTOOLS START Name=acos#1|Number KEEP=NO
  static public Number acos (final Number a) throws CGException {
    if (!pre_acos(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in acos");
    Number childResult_2 = child.impl_acos(a);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=acos#1|Number


// ***** VDMTOOLS START Name=pre_acos#1|Number KEEP=NO
  static public Boolean pre_acos (final Number a) throws CGException {
    return Boolean.valueOf(Math.abs(a.doubleValue()) <= 1);
  }
// ***** VDMTOOLS END Name=pre_acos#1|Number


// ***** VDMTOOLS START Name=atan#1|Number KEEP=NO
  static public Number atan (final Number v) throws CGException {
    Number childResult_2 = child.impl_atan(v);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=atan#1|Number


// ***** VDMTOOLS START Name=acot#1|Number KEEP=NO
  static public Number acot (final Number a) throws CGException {
    if (!pre_acot(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in acot");
    return atan(new Double((double)1 / a.doubleValue()));
  }
// ***** VDMTOOLS END Name=acot#1|Number


// ***** VDMTOOLS START Name=pre_acot#1|Number KEEP=NO
  static public Boolean pre_acot (final Number a) throws CGException {
    return Boolean.valueOf(!(a.doubleValue() == 0));
  }
// ***** VDMTOOLS END Name=pre_acot#1|Number


// ***** VDMTOOLS START Name=sqrt#1|Number KEEP=NO
  static public Number sqrt (final Number a) throws CGException {
    if (!pre_sqrt(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in sqrt");
    Number childResult_2 = child.impl_sqrt(a);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=sqrt#1|Number


// ***** VDMTOOLS START Name=pre_sqrt#1|Number KEEP=NO
  static public Boolean pre_sqrt (final Number a) throws CGException {
    return Boolean.valueOf(a.doubleValue() >= 0);
  }
// ***** VDMTOOLS END Name=pre_sqrt#1|Number


// ***** VDMTOOLS START Name=pi_f KEEP=NO
  static public Number pi_f () throws CGException {
    Number childResult_1 = child.impl_pi_f();
    return childResult_1;
  }
// ***** VDMTOOLS END Name=pi_f


// ***** VDMTOOLS START Name=srand#1|Number KEEP=NO
  static public void srand (final Number a) throws CGException {
    if (!pre_srand(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in srand");
    MATH.srand2(a);
  }
// ***** VDMTOOLS END Name=srand#1|Number


// ***** VDMTOOLS START Name=pre_srand#1|Number KEEP=NO
  static public Boolean pre_srand (final Number a) throws CGException {
    return Boolean.valueOf(a.intValue() >= -1);
  }
// ***** VDMTOOLS END Name=pre_srand#1|Number


// ***** VDMTOOLS START Name=rand#1|Number KEEP=NO
  static public Number rand (final Number a) throws CGException {
    return child.impl_rand(a);
  }
// ***** VDMTOOLS END Name=rand#1|Number


// ***** VDMTOOLS START Name=srand2#1|Number KEEP=NO
  static public Number srand2 (final Number a) throws CGException {
    if (!pre_srand2(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in srand2");
    return child.impl_srand2(a);
  }
// ***** VDMTOOLS END Name=srand2#1|Number


// ***** VDMTOOLS START Name=pre_srand2#1|Number KEEP=NO
  static public Boolean pre_srand2 (final Number a) throws CGException {
    return Boolean.valueOf(a.intValue() >= -1);
  }
// ***** VDMTOOLS END Name=pre_srand2#1|Number


// ***** VDMTOOLS START Name=exp#1|Number KEEP=NO
  static public Number exp (final Number a) throws CGException {
    Number childResult_2 = child.impl_exp(a);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=exp#1|Number


// ***** VDMTOOLS START Name=ln#1|Number KEEP=NO
  static public Number ln (final Number a) throws CGException {
    if (!pre_ln(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in ln");
    Number childResult_2 = child.impl_ln(a);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=ln#1|Number


// ***** VDMTOOLS START Name=pre_ln#1|Number KEEP=NO
  static public Boolean pre_ln (final Number a) throws CGException {
    return Boolean.valueOf(a.doubleValue() > 0);
  }
// ***** VDMTOOLS END Name=pre_ln#1|Number


// ***** VDMTOOLS START Name=log#1|Number KEEP=NO
  static public Number log (final Number a) throws CGException {
    if (!pre_log(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in log");
    Number childResult_2 = child.impl_log(a);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=log#1|Number


// ***** VDMTOOLS START Name=pre_log#1|Number KEEP=NO
  static public Boolean pre_log (final Number a) throws CGException {
    return Boolean.valueOf(a.doubleValue() > 0);
  }
// ***** VDMTOOLS END Name=pre_log#1|Number


// ***** VDMTOOLS START Name=fac#1|Number KEEP=NO
  static public Number fac (final Number a) throws CGException {
    if (!pre_fac(a).booleanValue()) 
      UTIL.RunTime("Precondition failure in fac");
    Number childResult_2 = child.impl_fac(a);
    return childResult_2;
  }
// ***** VDMTOOLS END Name=fac#1|Number


// ***** VDMTOOLS START Name=pre_fac#1|Number KEEP=NO
  static public Boolean pre_fac (final Number a) throws CGException {
    return Boolean.valueOf(a.intValue() < 21);
  }
// ***** VDMTOOLS END Name=pre_fac#1|Number

}
;
