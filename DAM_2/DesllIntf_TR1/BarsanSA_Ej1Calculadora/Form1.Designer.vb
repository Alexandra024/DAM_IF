<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.bttSuma = New System.Windows.Forms.Button()
        Me.bttResta = New System.Windows.Forms.Button()
        Me.bttMultiplicar = New System.Windows.Forms.Button()
        Me.bttDividir = New System.Windows.Forms.Button()
        Me.bttSalir = New System.Windows.Forms.Button()
        Me.bttClear = New System.Windows.Forms.Button()
        Me.txtSolucion = New System.Windows.Forms.TextBox()
        Me.txtNumero2 = New System.Windows.Forms.TextBox()
        Me.txtNumero1 = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'bttSuma
        '
        Me.bttSuma.Location = New System.Drawing.Point(98, 151)
        Me.bttSuma.Name = "bttSuma"
        Me.bttSuma.Size = New System.Drawing.Size(121, 42)
        Me.bttSuma.TabIndex = 0
        Me.bttSuma.Text = "Suma"
        Me.bttSuma.UseVisualStyleBackColor = True
        '
        'bttResta
        '
        Me.bttResta.Location = New System.Drawing.Point(323, 149)
        Me.bttResta.Name = "bttResta"
        Me.bttResta.Size = New System.Drawing.Size(100, 44)
        Me.bttResta.TabIndex = 1
        Me.bttResta.Text = "Resta"
        Me.bttResta.UseVisualStyleBackColor = True
        '
        'bttMultiplicar
        '
        Me.bttMultiplicar.Location = New System.Drawing.Point(98, 199)
        Me.bttMultiplicar.Name = "bttMultiplicar"
        Me.bttMultiplicar.Size = New System.Drawing.Size(121, 42)
        Me.bttMultiplicar.TabIndex = 2
        Me.bttMultiplicar.Text = "Multiplicar"
        Me.bttMultiplicar.UseVisualStyleBackColor = True
        '
        'bttDividir
        '
        Me.bttDividir.Location = New System.Drawing.Point(323, 199)
        Me.bttDividir.Name = "bttDividir"
        Me.bttDividir.Size = New System.Drawing.Size(100, 42)
        Me.bttDividir.TabIndex = 3
        Me.bttDividir.Text = "Dividir"
        Me.bttDividir.UseVisualStyleBackColor = True
        '
        'bttSalir
        '
        Me.bttSalir.Location = New System.Drawing.Point(640, 360)
        Me.bttSalir.Name = "bttSalir"
        Me.bttSalir.Size = New System.Drawing.Size(100, 44)
        Me.bttSalir.TabIndex = 4
        Me.bttSalir.Text = "Salir"
        Me.bttSalir.UseVisualStyleBackColor = True
        '
        'bttClear
        '
        Me.bttClear.Location = New System.Drawing.Point(323, 360)
        Me.bttClear.Name = "bttClear"
        Me.bttClear.Size = New System.Drawing.Size(121, 44)
        Me.bttClear.TabIndex = 5
        Me.bttClear.Text = "Clear"
        Me.bttClear.UseVisualStyleBackColor = True
        '
        'txtSolucion
        '
        Me.txtSolucion.Location = New System.Drawing.Point(98, 378)
        Me.txtSolucion.Name = "txtSolucion"
        Me.txtSolucion.Size = New System.Drawing.Size(100, 26)
        Me.txtSolucion.TabIndex = 6
        Me.txtSolucion.Text = "Solucion"
        '
        'txtNumero2
        '
        Me.txtNumero2.Location = New System.Drawing.Point(323, 87)
        Me.txtNumero2.Name = "txtNumero2"
        Me.txtNumero2.Size = New System.Drawing.Size(100, 26)
        Me.txtNumero2.TabIndex = 7
        Me.txtNumero2.Text = "Numero2"
        '
        'txtNumero1
        '
        Me.txtNumero1.Location = New System.Drawing.Point(98, 87)
        Me.txtNumero1.Name = "txtNumero1"
        Me.txtNumero1.Size = New System.Drawing.Size(100, 26)
        Me.txtNumero1.TabIndex = 8
        Me.txtNumero1.Text = "Numero1"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(9.0!, 20.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.txtNumero1)
        Me.Controls.Add(Me.txtNumero2)
        Me.Controls.Add(Me.txtSolucion)
        Me.Controls.Add(Me.bttClear)
        Me.Controls.Add(Me.bttSalir)
        Me.Controls.Add(Me.bttDividir)
        Me.Controls.Add(Me.bttMultiplicar)
        Me.Controls.Add(Me.bttResta)
        Me.Controls.Add(Me.bttSuma)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents bttSuma As Button
    Friend WithEvents bttResta As Button
    Friend WithEvents bttMultiplicar As Button
    Friend WithEvents bttDividir As Button
    Friend WithEvents bttSalir As Button
    Friend WithEvents bttClear As Button
    Friend WithEvents txtSolucion As TextBox
    Friend WithEvents txtNumero2 As TextBox
    Friend WithEvents txtNumero1 As TextBox
End Class
