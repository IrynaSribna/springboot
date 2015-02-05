<div id="header">
<h2>
    Address Book
</h2>
</div>

<div id="content">

  <br>

    <table class="dataheader">
        <tbody><tr>
            <th>Firstname</th>  <th>Lastname</th>
        </tr>
        </tbody>
    <#list model["addressBook"] as addressBook>
    <table class="datatable">
    <tbody><tr>
        <td>${addressBook.firstName}</td> <td>${addressBook.lastName}</td>
    </tr>
    </#list>
  </tbody></table>

</div>