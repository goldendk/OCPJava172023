Working command in this dir: 
CWD: wrk
CMD: javac - cp . pkg\A.java # the relative path is correct and the classpath contains the output directory.

CWD: wrk
CMD: javac -cp .;pkg pkg\A.java #same as above but with more specific classpath even though it is not needed.