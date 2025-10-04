Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub TextBox3_TextChanged(sender As Object, e As EventArgs) Handles txtNumero1.TextChanged

    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles bttDividir.Click
        txtSolucion.Text = Val(txtNumero1.Text) / Val(txtNumero2.Text)
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles bttSalir.Click
        Me.Close()
    End Sub

    Private Sub TextBox2_TextChanged(sender As Object, e As EventArgs) Handles txtNumero2.TextChanged

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles bttResta.Click
        txtSolucion.Text = Val(txtNumero1.Text) - Val(txtNumero2.Text)
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles bttMultiplicar.Click
        txtSolucion.Text = Val(txtNumero1.Text) * Val(txtNumero2.Text)
    End Sub

    Private Sub SumaBt_Click(sender As Object, e As EventArgs) Handles bttSuma.Click
        txtSolucion.Text = Val(txtNumero1.Text) + Val(txtNumero2.Text)
    End Sub

    Private Sub bttClear_Click(sender As Object, e As EventArgs) Handles bttClear.Click
        txtNumero1.Clear()
        txtNumero2.Clear()
        txtSolucion.Clear()
    End Sub
End Class
