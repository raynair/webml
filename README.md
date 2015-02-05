# webml
An old acceleo project, which as build for generating static html pages as a navigation menu based on a 
simple xml-file. 

It was inital an eclipse JET based Project, which generates a simple static html menu based on a xml-file. 
With the years I switched from JET to Acceleo, to proove iff Acceleo is a valid replacement. To use it, 
start with the update site de.malime.acceleo, and register it under eclipse. Generate a project, and create file 
file webmenu.webml 
```
<?xml version="1.0" encoding="UTF-8"?>
<webml:web xmlns:webml="http://www.malime.de/webml" theme="theme/malime.css">
  <webml:meta name="keywords" value="eclipse,plugins,features"/>
  <webml:meta name="description" value="Auf diesen Seiten befinden sich Informationen ueber malime"/>
  <webml:menu file="index.html" name="malime.de"/>
</webml:web>
```
and use the context menu for the generation of the menu.
