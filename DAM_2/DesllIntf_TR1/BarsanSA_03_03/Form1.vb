Public Class Form1
    Private Sub btnRestablecer_Click(sender As Object, e As EventArgs) Handles btnRestablecer.Click
        txtCuadro.Size = New Size(300, 100)
        txtCuadro.BackColor = Color.Wheat
        txtCuadro.Location = New Point(23, 314)
        rbBlanco.Checked = True
        rbCentro.Checked = True
        rbNormal.Checked = True
    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Me.Close()
    End Sub

    'Private Sub gbColores_Enter(sender As Object, e As EventArgs) Handles gbColores.Enter

    'End Sub

    Private Sub rbBlanco_CheckedChanged(sender As Object, e As EventArgs) Handles rbBlanco.CheckedChanged
        If rbBlanco.Checked Then
            txtCuadro.BackColor = Color.White
        End If
    End Sub

    Private Sub rbRojo_CheckedChanged(sender As Object, e As EventArgs) Handles rbRojo.CheckedChanged
        If rbRojo.Checked Then
            txtCuadro.BackColor = Color.Red
        End If
    End Sub

    Private Sub rbAmarillo_CheckedChanged(sender As Object, e As EventArgs) Handles rbAmarillo.CheckedChanged
        If rbAmarillo.Checked Then
            txtCuadro.BackColor = Color.Yellow
        End If
    End Sub

    Private Sub rbVerde_CheckedChanged(sender As Object, e As EventArgs) Handles rbVerde.CheckedChanged
        If rbVerde.Checked Then
            txtCuadro.BackColor = Color.Green
        End If
    End Sub

    Private Sub rbAzul_CheckedChanged(sender As Object, e As EventArgs) Handles rbAzul.CheckedChanged
        If rbAzul.Checked Then
            txtCuadro.BackColor = Color.Blue
        End If
    End Sub

    'Private Sub gbPosicion_Enter(sender As Object, e As EventArgs) Handles gbPosicion.Enter

    'End Sub

    Private Sub rbArriba_CheckedChanged(sender As Object, e As EventArgs) Handles rbArriba.CheckedChanged
        If rbArriba.Checked Then
            txtCuadro.Location = New Point(330, 20)
        End If
    End Sub

    Private Sub rbCentro_CheckedChanged(sender As Object, e As EventArgs) Handles rbCentro.CheckedChanged
        If rbCentro.Checked Then
            txtCuadro.Location = New Point(330, 200)
        End If
    End Sub

    Private Sub rbAbajo_CheckedChanged(sender As Object, e As EventArgs) Handles rbAbajo.CheckedChanged
        If rbAbajo.Checked Then
            txtCuadro.Location = New Point(330, 350)
        End If
    End Sub

    'Private Sub gbTamano_Enter(sender As Object, e As EventArgs) Handles gbTamano.Enter

    'End Sub

    Private Sub rbPequeno_CheckedChanged(sender As Object, e As EventArgs) Handles rbPequeno.CheckedChanged
        If rbPequeno.Checked Then
            txtCuadro.Size = New Size(200, 50)
        End If
    End Sub

    Private Sub rbNormal_CheckedChanged(sender As Object, e As EventArgs) Handles rbNormal.CheckedChanged
        If rbNormal.Checked Then
            txtCuadro.Size = New Size(300, 100)
        End If
    End Sub

    Private Sub rbGrande_CheckedChanged(sender As Object, e As EventArgs) Handles rbGrande.CheckedChanged
        If rbGrande.Checked Then
            txtCuadro.Size = New Size(400, 125)
        End If
    End Sub

    'Private Sub txtCuadro_TextChanged(sender As Object, e As EventArgs) Handles txtCuadro.TextChanged

    'End Sub
End Class
