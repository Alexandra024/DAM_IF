Public Class Form1
    Private Sub btnLimpiar_Click(sender As Object, e As EventArgs) Handles btnLimpiar.Click
        rbObrero.Checked = True
        rbSindicatoNo.Checked = True
        rb5anos.Checked = True
        nudNhijos.Value = 0

    End Sub

    Private Sub nudHijos_ValueChanged(sender As Object, e As EventArgs) Handles nudNhijos.ValueChanged
        'Propiedad color 
        Me.nudNhijos.ForeColor = Color.Red
    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Me.Close()
        ' También es posible End
    End Sub

    Private Sub btnCalcular_Click(sender As Object, e As EventArgs) Handles btnCalcular.Click
        Dim desglose As String
        Dim salario As Integer

        desglose = ""

        If rbObrero.Checked Then
            desglose &= "Tu salario base como obrero es 800€" & vbNewLine
            salario += 800

        ElseIf rbAdministrativo.Checked Then
            desglose &= "Tu salario base como administrativo es 900€" & vbNewLine
            salario += 900
        ElseIf rbTecnico.Checked Then
            desglose &= "Tu salario base como técnico es 1000€" & vbNewLine
            salario += 1000
        ElseIf rbProfesional.Checked Then
            desglose &= "Tu salario base como profesional es 1200€" & vbNewLine
            salario += 1200
        End If

        If rbSindicatoSi.Checked Then
            desglose &= "Tienes un complemento por afiliación sindical de 50€ " & vbNewLine
            salario += 50
        End If
        If rb5a10anos.Checked Then
            desglose &= "Por tu antigüedad entre 5-10 años cobras un complemento de 100€" & vbNewLine
            salario += 100
        ElseIf rb10oMas.Checked Then
            desglose &= "Por tu antigüedad superior a 10 años cobras un complemento de 200€" & vbNewLine
            salario += 200
        End If

        If nudNhijos.Value > 0 Then
            Dim desgloseHijos As String
            Dim complementoHijos As Integer
            complementoHijos = 100 * nudNhijos.Value
            salario += complementoHijos
            desgloseHijos = "Tienes un complemento de " & complementoHijos & "€ por tener " & nudNhijos.Value & " hijos."
            desglose &= desgloseHijos
        End If

        MsgBox(desglose & vbNewLine & "salario = " & salario & "€")
    End Sub


End Class
