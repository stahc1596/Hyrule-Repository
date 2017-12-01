import os, glob

for dir in glob.glob("*"):
	os.rename(dir,dir.replace("jpeg","jpg"))