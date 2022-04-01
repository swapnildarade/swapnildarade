var selectedRow = null 
function onFormSubmit() { 
if (validate()) { 
var formData = readFormData(); 
if (selectedRow == null) 
insertNewRecord(formData); 
else 
updateRecord(formData); 
resetForm(); 
} 
} 
function readFormData() { 
var formData = {}; 
formData["fullName"] = document.getElementById("fullName").value; 
formData["pName"] = document.getElementById("pName").value; 
formData["cost"] = document.getElementById("cost").value; 
formData["city"] = document.getElementById("city").value; 
return formData; 
} 
function insertNewRecord(data) { 
var table = document.getElementById("vendorList").getElementsByTagName('tbody')[0]; 
var newRow = table.insertRow(table.length); 
cell1 = newRow.insertCell(0); 
cell1.innerHTML = data.fullName; 
cell2 = newRow.insertCell(1); 
cell2.innerHTML = data.pName; 
cell3 = newRow.insertCell(2); 
cell3.innerHTML = data.cost; 
cell4 = newRow.insertCell(3); 
cell4.innerHTML = data.city; 
cell4 = newRow.insertCell(4); 
cell4.innerHTML = `<a onClick="onEdit(this)"><img src="img/edit.png" width="20" height="20"/></a> 
<a onClick="onDelete(this)"><img src="img/trash-10-xxl.png" width="20" height="20"/></a>`; 
} 
function resetForm() { 
document.getElementById("fullName").value = ""; 
document.getElementById("pName").value = ""; 
document.getElementById("cost").value = ""; 
document.getElementById("city").value = ""; 
selectedRow = null; 
} 
function onEdit(td) { 
selectedRow = td.parentElement.parentElement; 
document.getElementById("fullName").value = selectedRow.cells[0].innerHTML; 
document.getElementById("pName").value = selectedRow.cells[1].innerHTML; 
document.getElementById("cost").value = selectedRow.cells[2].innerHTML; 
document.getElementById("city").value = selectedRow.cells[3].innerHTML; 
} 
function updateRecord(formData) { 
selectedRow.cells[0].innerHTML = formData.fullName; 
selectedRow.cells[1].innerHTML = formData.pName; 
selectedRow.cells[2].innerHTML = formData.cost; 
selectedRow.cells[3].innerHTML = formData.city; 
} 
function onDelete(td) { 
if (confirm('Are you sure to delete this record ?')) { 
row = td.parentElement.parentElement; 
document.getElementById("vendorList").deleteRow(row.rowIndex); 
resetForm(); 
} 
} 
function validate() { 
isValid = true; 
if (document.getElementById("fullName").value == "") { 
isValid = false; 
document.getElementById("fullNameValidationError").classList.remove("hide"); 
} else { 
isValid = true; 
if (!document.getElementById("fullNameValidationError").classList.contains("hide")) 
document.getElementById("fullNameValidationError").classList.add("hide"); 
} 
return isValid; 
}