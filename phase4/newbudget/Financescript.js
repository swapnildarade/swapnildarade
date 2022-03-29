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
formData["cName"] = document.getElementById("cName").value; 
formData["aord"] = document.getElementById("aord").value; 
return formData; 
} 
function insertNewRecord(data) { 
var table = document.getElementById("dealsList").getElementsByTagName('tbody')[0]; 
var newRow = table.insertRow(table.length); 
cell1 = newRow.insertCell(0); 
cell1.innerHTML = data.fullName; 
cell2 = newRow.insertCell(1); 
cell2.innerHTML = data.cName; 
cell3 = newRow.insertCell(2); 
cell3.innerHTML = data.aord; 
cell4 = newRow.insertCell(3); 
cell4.innerHTML = `<a onClick="onDelete(this)"><img src="img/trash-10-xxl.png" width="20" height="20"/></a>`; 
} 
function resetForm() { 
document.getElementById("fullName").value = ""; 
document.getElementById("cName").value = ""; 
document.getElementById("aord").value = ""; 
selectedRow = null; 
} 
function onEdit(td) { 
selectedRow = td.parentElement.parentElement; 
document.getElementById("fullName").value = selectedRow.cells[0].innerHTML; 
document.getElementById("cName").value = selectedRow.cells[1].innerHTML; 
document.getElementById("aord").value = selectedRow.cells[2].innerHTML; 
} 
function updateRecord(formData) { 
selectedRow.cells[0].innerHTML = formData.fullName; 
selectedRow.cells[1].innerHTML = formData.cName; 
selectedRow.cells[2].innerHTML = formData.aord; 
} 
function onDelete(td) { 
if (confirm('Are you sure to delete this record ?')) { 
row = td.parentElement.parentElement; 
document.getElementById("dealsList").deleteRow(row.rowIndex); 
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
