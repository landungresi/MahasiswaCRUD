<%-- 
    Document   : search_mahasiswa
    Created on : Dec 9, 2021, 1:56:18 AM
    Author     : WN10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cari Mahasiswa</title>
    </head>
    <body>
        <h1>Cari Mahasiswa</h1>
        <form action="./CariMahasiswaServlets">
            NIM:<input type="text" name="nim"/><input type="submit" name="submit" value="Cari"/>
        </form>
    </body>
</html>
