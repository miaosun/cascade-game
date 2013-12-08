@echo off
rem Tests the date book specification for one test case (argument)
rem -- Output the argument to stdout (for redirect) and "con" (for user feedback)
echo VDM Test: '%1' > con
echo VDM Test: '%1'

rem short names for specification files in Word RTF Format
set S1=IO.rtf
set S2=MATH.rtf
set S3=NewLineThread.rtf
set S4=NextLevelThread.rtf
set S5=Cell.rtf
set S6=Board.rtf
set S7=Cascade.rtf
set S8=TestCascade.rtf


rem -- Calls the interpreter for this test case
"E:\The VDM++ Toolbox v9.0.2\bin\vppde" -i -D -I -P -Q -R vdm.tc -O %1.res %1 %S1% %S2% %S3% %S4% %S5% %S6% %S7% %S8%

rem -- Check for difference between result of execution and expected result.
if EXIST %1.exp fc /w %1.res %1.exp

:end
