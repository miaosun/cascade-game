@echo off
rem Runs a colletion of VDM++ test examples
rem Assumes specification is in Word RTF files

set S1=Cell.rtf
set S2=TestCell.rtf

"E:\The VDM++ Toolbox v9.0.2\bin\vppde" -p -R vdm.tc %s1% %S2%
for /R %%f in (*.arg) do call vdmtest "%%f"