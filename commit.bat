@REM Batch script to accept string parameter and automate git commit.

@ECHO OFF
git add .
git commit -m "%*"
git push -u origin main
echo "Commited Successfully."