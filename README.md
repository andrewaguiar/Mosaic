## Mosaic provides a more DSL style to create HTML code from Java:

Example:
```java
new Table().id("table").addStyles( StyleProperty.BACKGROUND + ":#FEFEFE" ).classes("report_table").add(
  new THead().add(
    new TR().add(
      new TD().text("name"),
      new TD().text("age"),
      new TD().text("city")
      )
    ),
  new TBody().add(
    new TR().add(
      new TD().text("Andrew"),
      new TD().text("24"),
      new TD().text("São Paulo")
    ),
    new TR().add(
      new TD().text("Test"),
      new TD().text("2000"),
      new TD().text("All the world")
    )
  )
);
```
It provides a HTML code like that:
```html
<table id='table' style='background: #FEFEFE;' class='report_table'>
 <thead>
  <tr>
   <td>name</td>
   <td>name</td>
   <td>name</td>
  </tr>
 </head>
 <tbody>
  <tr>
   <td>Andrew</td>
   <td>24</td>
   <td>São Paulo</td>
  </tr>
  <tr>
   <td>Test</td>
   <td>2000</td>
   <td>All the world</td>
  </tr>
 </tbody>
</table>
```
###################################################################################################

Sometimes you'll wanna change the Quote of attributes, you can use the method setQuotation for that.
new Div().setQuotation(Quotation.DOUBLE).id("test").text("Quotation Test")

it'll seems like that
```html
<div id="test">Quotation Test</div>
```
Or change the DEFAULT_QUOTATION in HTMLComponent class.
```java
HTMLComponent.DEFAULT_QUOTATION = Quotation.DOUBLE;
new Div().setQuotation(Quotation.DOUBLE).id("test").text("Quotation Test")
```
it'll seems like that
```html
<div id="test">Quotation Test</div>
```