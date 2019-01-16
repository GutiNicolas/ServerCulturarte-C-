javac -encoding UTF-8 -cp "./lib/mysql.jar:./lib/jcalendar.jar;./lib/AbsoluteLayout.jar;./lib/beansbinding.jar" -d ./build/WSServidorSA ./src/Logica/*.java ./src/WebServices/*.java ../src/Presentacion/*.java ../src/Persistencia/*.java 
jar -cvfm ./ServidorCulturarte.jar ./src/Manifest.txt -C ./build/WSServidorSA . > temp.txt







