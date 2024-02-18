<%-- 
    Document   : tampil_mahasiswa
    Created on : Dec 9, 2021, 1:54:54 AM
    Author     : WN10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Detil Data Mahasiswa</h1>
        <table border="1">
            <tr><td>NIM</td><td>${mahasiswa.nim}</td></tr>
            <tr><td>Nama</td><td>${mahasiswa.nama}</td></tr>
            <tr><td>IPK</td><td>${mahasiswa.ipk}</td></tr>
        </table>
    </body>
</html>

