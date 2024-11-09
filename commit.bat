@REM Batch script to automate Git commit with a string parameter.

@ECHO OFF
git add .
git commit -m "%*"
git push -u origin main
echo "Commited Successfully."