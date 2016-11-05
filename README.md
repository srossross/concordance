# concordance

### Files

 * PythonConcordance.ipynb - experimental workbook for python - first iteration
 * ScalaConcordance.ipynb - experimental workbook for scala - second iteration
 * ScalaConcordance.scala - scala script - third iteration
 * ipsum.txt - example data
 * text.txt - example data

### Notes

The word parser could be improved right now it splits `zero-indexed` into `zero` and `indexed`

### Running ipynb files

Grab the jupyter-scala notebook kernel to run the ipython notebook files.

```
git clone https://github.com/srossross/concordance
docker run -it -p 8888:8888 -v `pwd`/concordance:/notebooks negokaz/jupyter-scala
open http://localhost:8888
```

### Executing the standalone scala script

```
$ scala ScalaConcordance.scala  < text.txt 
a               {6:0,0,0,1,1,1}
alphabetical    {1:0}
an              {2:0,1}
and             {4:0,1,2,3}
appears         {2:0,0}
arbitrary       {1:1}
assume          {1:3}
be              {1:1}
can             {1:1}
case            {1:2}
choice          {1:1}
citations       {2:0,2}
concordance     {3:0,1,1}
contains        {1:3}
count           {2:0,2}
document        {1:1}
e.g.            {1:0}
each            {3:0,0,2}
english         {3:1,3,3}
file            {1:1}
for             {1:2}
from            {1:1}
generate        {1:1}
how             {1:0}
in              {6:0,0,1,1,2,2}
indexed         {1:2}
input           {1:3}
is              {1:0}
it              {1:2}
language        {1:1}
letters         {1:3}
list            {2:0,2}
marks           {1:3}
may             {1:3}
newlines        {1:3}
number          {2:0,2}
occurs          {1:2}
of              {6:0,0,0,1,1,2}
often           {1:0}
only            {1:3}
or              {1:1}
output          {1:1}
page            {1:0}
present         {1:0}
print           {1:2}
program         {2:1,1}
programming     {1:1}
punctuation     {1:3}
read            {1:1}
sentence        {1:2}
should          {2:1,2}
sorted          {1:2}
spaces          {1:3}
standard        {2:3,3}
stdin           {1:1}
stdout          {1:1}
text            {4:0,0,1,1}
that            {3:1,2,3}
the             {10:0,0,1,1,1,1,2,2,2,3}
this            {1:2}
to              {1:1}
where           {1:0}
which           {1:2}
will            {1:1}
with            {1:0}
word            {4:0,0,2,2}
words           {1:0}
write           {1:1}
written         {1:1}
you             {1:3}
your            {1:1}
zero            {1:2}
```
