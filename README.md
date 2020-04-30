<img src="https://raw.githubusercontent.com/hershyz/autodoc/master/assets/logo.png"/>
<p>Automatically generate clean HTML documentation for application commands.</p>
<br>
<h4>Turn this:</h4>
<pre>
  type: Displays the contents of a text file
  vol: Displays disk volume label and serial number
  tasklist: Displays all currently running tasks and services
  sort: Sorts input
  replace: Replaces files
  robocopy: Advanced utility to copy files and directory trees
</pre>
<h4>Into this:</h4>
<pre>
  <i><strong>type:</i></strong>       Displays the contents of a text file
  <i><strong>vol:</i></strong>        Displays disk volume label and serial number
  <i><strong>tasklist:</i></strong>   Displays all currently running tasks and services
  <i><strong>sort:</i></strong>       Sorts input
  <i><strong>replace:</i></strong>    Replaces files
  <i><strong>robocopy:</i></strong>   Advanced utility to copy files and directory trees
</pre>
<br>
<h4>Config:</h4>
<p>Config can be changed using the static variables in <code>Config.java</code></p>
<pre>
    public static String tag             <i>Tag to print before and after the text</i>
    public static String suffix          <i>Optional suffix, leave blank if not needed</i>
    public static boolean italics        <i>Makes commands italic if set to true</i>
    public static boolean bold           <i>Makes commands bold if set to true</i>
    public static int minSpaceCount      <i>Minimum spaces definition should be from command</i>
</pre>
<p>Jar file must be recompiled when settings are changed for them to take effect.</p>
<br>
<h4>Running:</h4>
<code>java -jar autodoc.jar</code>
