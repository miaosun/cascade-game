@echo off
rem Runs a collection of VDM++ test examples
rem Assumes specification is in Word RTF files

set S1=IO.rtf
set S2=MATH.rtf
set S3=Cell.rtf
set S4=Board.rtf
set S5=TestBoard.rtf


"E:\The VDM++ Toolbox v9.0.2\bin\vppde" -p -R vdm.tc %S1% %S2% %S3% %S4% %S5%
for /R %%f in (*.arg) do call vdmtest "%%f"