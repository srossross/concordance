# concordance

### Files

 * PythonConcordance.ipynb - experimental workbook for python - first iteration
 * ScalaConcordance.ipynb - experimental workbook for scala - second iteration
 * ScalaConcordance.scala - experimental workbook for scala - third iteration

### Running ipynb files

Grab the jupyter-scala notebook kernel to run the ipython notebook files.

```
git clone https://github.com/srossross/concordance
docker run -it -p 8888:8888 -v `pwd`/concordance:/notebooks negokaz/jupyter-scala
open http://localhost:8888
```

### Executing the standalone scala script

```
scala ScalaConcordance.scala < text.txt
```
