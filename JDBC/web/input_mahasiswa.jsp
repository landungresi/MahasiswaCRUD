<%-- 
    Document   : input_mahasiswa
    Created on : Dec 9, 2021, 3:11:05 AM
    Author     : WN10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Mahasiswa</title>
    </head>
    <body>
        <h1>Input Mahasiswa</h1>
        <form action='./SimpanMahasiswaServlet'>
        <table>
            <tr><td>NIM</td><td><input type='text' name="nim"/></td></tr>
            <tr><td>NAMA</td><td><input type='text' name="nama"/></td></tr>
            <tr><td>IPK</td><td><input type='text' name="ipk"/></td></tr>
            <tr><td></td><td><input type='submit' name="submit" value="simpan"/></td></tr>
        </table>
        </form>
    </body>
</html>
