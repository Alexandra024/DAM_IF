<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.gbColores = New System.Windows.Forms.GroupBox()
        Me.rbAzul = New System.Windows.Forms.RadioButton()
        Me.rbVerde = New System.Windows.Forms.RadioButton()
        Me.rbRojo = New System.Windows.Forms.RadioButton()
        Me.rbAmarillo = New System.Windows.Forms.RadioButton()
        Me.rbBlanco = New System.Windows.Forms.RadioButton()
        Me.gbPosicion = New System.Windows.Forms.GroupBox()
        Me.rbAbajo = New System.Windows.Forms.RadioButton()
        Me.rbArriba = New System.Windows.Forms.RadioButton()
        Me.rbCentro = New System.Windows.Forms.RadioButton()
        Me.gbTamano = New System.Windows.Forms.GroupBox()
        Me.rbPequeno = New System.Windows.Forms.RadioButton()
        Me.rbGrande = New System.Windows.Forms.RadioButton()
        Me.rbNormal = New System.Windows.Forms.RadioButton()
        Me.btnRestablecer = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.txtCuadro = New System.Windows.Forms.TextBox()
        Me.gbColores.SuspendLayout()
        Me.gbPosicion.SuspendLayout()
        Me.gbTamano.SuspendLayout()
        Me.SuspendLayout()
        '
        'gbColores
        '
        Me.gbColores.BackColor = System.Drawing.SystemColors.Info
        Me.gbColores.Controls.Add(Me.rbAzul)
        Me.gbColores.Controls.Add(Me.rbVerde)
        Me.gbColores.Controls.Add(Me.rbRojo)
        Me.gbColores.Controls.Add(Me.rbAmarillo)
        Me.gbColores.Controls.Add(Me.rbBlanco)
        Me.gbColores.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.gbColores.Location = New System.Drawing.Point(23, 23)
        Me.gbColores.Name = "gbColores"
        Me.gbColores.Size = New System.Drawing.Size(198, 248)
        Me.gbColores.TabIndex = 0
        Me.gbColores.TabStop = False
        Me.gbColores.Text = "Colores"
        '
        'rbAzul
        '
        Me.rbAzul.AutoSize = True
        Me.rbAzul.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbAzul.Location = New System.Drawing.Point(18, 195)
        Me.rbAzul.Name = "rbAzul"
        Me.rbAzul.Size = New System.Drawing.Size(76, 29)
        Me.rbAzul.TabIndex = 4
        Me.rbAzul.TabStop = True
        Me.rbAzul.Text = "Azul"
        Me.rbAzul.UseVisualStyleBackColor = True
        '
        'rbVerde
        '
        Me.rbVerde.AutoSize = True
        Me.rbVerde.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbVerde.Location = New System.Drawing.Point(18, 154)
        Me.rbVerde.Name = "rbVerde"
        Me.rbVerde.Size = New System.Drawing.Size(90, 29)
        Me.rbVerde.TabIndex = 3
        Me.rbVerde.TabStop = True
        Me.rbVerde.Text = "Verde"
        Me.rbVerde.UseVisualStyleBackColor = True
        '
        'rbRojo
        '
        Me.rbRojo.AutoSize = True
        Me.rbRojo.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbRojo.Location = New System.Drawing.Point(18, 76)
        Me.rbRojo.Name = "rbRojo"
        Me.rbRojo.Size = New System.Drawing.Size(76, 29)
        Me.rbRojo.TabIndex = 2
        Me.rbRojo.TabStop = True
        Me.rbRojo.Text = "Rojo"
        Me.rbRojo.UseVisualStyleBackColor = True
        '
        'rbAmarillo
        '
        Me.rbAmarillo.AutoSize = True
        Me.rbAmarillo.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbAmarillo.Location = New System.Drawing.Point(18, 114)
        Me.rbAmarillo.Name = "rbAmarillo"
        Me.rbAmarillo.Size = New System.Drawing.Size(107, 29)
        Me.rbAmarillo.TabIndex = 1
        Me.rbAmarillo.TabStop = True
        Me.rbAmarillo.Text = "Amarillo"
        Me.rbAmarillo.UseVisualStyleBackColor = True
        '
        'rbBlanco
        '
        Me.rbBlanco.AutoSize = True
        Me.rbBlanco.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbBlanco.Location = New System.Drawing.Point(18, 37)
        Me.rbBlanco.Name = "rbBlanco"
        Me.rbBlanco.Size = New System.Drawing.Size(97, 29)
        Me.rbBlanco.TabIndex = 0
        Me.rbBlanco.TabStop = True
        Me.rbBlanco.Text = "Blanco"
        Me.rbBlanco.UseVisualStyleBackColor = True
        '
        'gbPosicion
        '
        Me.gbPosicion.BackColor = System.Drawing.SystemColors.Info
        Me.gbPosicion.Controls.Add(Me.rbAbajo)
        Me.gbPosicion.Controls.Add(Me.rbArriba)
        Me.gbPosicion.Controls.Add(Me.rbCentro)
        Me.gbPosicion.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.gbPosicion.Location = New System.Drawing.Point(283, 23)
        Me.gbPosicion.Name = "gbPosicion"
        Me.gbPosicion.Size = New System.Drawing.Size(198, 248)
        Me.gbPosicion.TabIndex = 1
        Me.gbPosicion.TabStop = False
        Me.gbPosicion.Text = "Posición"
        '
        'rbAbajo
        '
        Me.rbAbajo.AutoSize = True
        Me.rbAbajo.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbAbajo.Location = New System.Drawing.Point(15, 133)
        Me.rbAbajo.Name = "rbAbajo"
        Me.rbAbajo.Size = New System.Drawing.Size(88, 29)
        Me.rbAbajo.TabIndex = 7
        Me.rbAbajo.TabStop = True
        Me.rbAbajo.Text = "Abajo"
        Me.rbAbajo.UseVisualStyleBackColor = True
        '
        'rbArriba
        '
        Me.rbArriba.AutoSize = True
        Me.rbArriba.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbArriba.Location = New System.Drawing.Point(15, 36)
        Me.rbArriba.Name = "rbArriba"
        Me.rbArriba.Size = New System.Drawing.Size(89, 29)
        Me.rbArriba.TabIndex = 6
        Me.rbArriba.TabStop = True
        Me.rbArriba.Text = "Arriba"
        Me.rbArriba.UseVisualStyleBackColor = True
        '
        'rbCentro
        '
        Me.rbCentro.AutoSize = True
        Me.rbCentro.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbCentro.Location = New System.Drawing.Point(15, 84)
        Me.rbCentro.Name = "rbCentro"
        Me.rbCentro.Size = New System.Drawing.Size(96, 29)
        Me.rbCentro.TabIndex = 5
        Me.rbCentro.TabStop = True
        Me.rbCentro.Text = "Centro"
        Me.rbCentro.UseVisualStyleBackColor = True
        '
        'gbTamano
        '
        Me.gbTamano.BackColor = System.Drawing.SystemColors.Info
        Me.gbTamano.Controls.Add(Me.rbPequeno)
        Me.gbTamano.Controls.Add(Me.rbGrande)
        Me.gbTamano.Controls.Add(Me.rbNormal)
        Me.gbTamano.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.gbTamano.Location = New System.Drawing.Point(547, 23)
        Me.gbTamano.Name = "gbTamano"
        Me.gbTamano.Size = New System.Drawing.Size(198, 248)
        Me.gbTamano.TabIndex = 1
        Me.gbTamano.TabStop = False
        Me.gbTamano.Text = "Tamaño"
        '
        'rbPequeno
        '
        Me.rbPequeno.AutoSize = True
        Me.rbPequeno.Font = New System.Drawing.Font("Microsoft Sans Serif", 8.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbPequeno.Location = New System.Drawing.Point(14, 36)
        Me.rbPequeno.Name = "rbPequeno"
        Me.rbPequeno.Size = New System.Drawing.Size(98, 24)
        Me.rbPequeno.TabIndex = 10
        Me.rbPequeno.TabStop = True
        Me.rbPequeno.Text = "Pequeño"
        Me.rbPequeno.UseVisualStyleBackColor = True
        '
        'rbGrande
        '
        Me.rbGrande.AutoSize = True
        Me.rbGrande.Font = New System.Drawing.Font("Microsoft Sans Serif", 16.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbGrande.Location = New System.Drawing.Point(14, 136)
        Me.rbGrande.Name = "rbGrande"
        Me.rbGrande.Size = New System.Drawing.Size(149, 41)
        Me.rbGrande.TabIndex = 9
        Me.rbGrande.TabStop = True
        Me.rbGrande.Text = "Grande"
        Me.rbGrande.UseVisualStyleBackColor = True
        '
        'rbNormal
        '
        Me.rbNormal.AutoSize = True
        Me.rbNormal.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbNormal.Location = New System.Drawing.Point(14, 84)
        Me.rbNormal.Name = "rbNormal"
        Me.rbNormal.Size = New System.Drawing.Size(99, 29)
        Me.rbNormal.TabIndex = 8
        Me.rbNormal.TabStop = True
        Me.rbNormal.Text = "Normal"
        Me.rbNormal.UseVisualStyleBackColor = True
        '
        'btnRestablecer
        '
        Me.btnRestablecer.BackColor = System.Drawing.Color.Coral
        Me.btnRestablecer.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnRestablecer.Location = New System.Drawing.Point(20, 376)
        Me.btnRestablecer.Name = "btnRestablecer"
        Me.btnRestablecer.Size = New System.Drawing.Size(159, 37)
        Me.btnRestablecer.TabIndex = 2
        Me.btnRestablecer.Text = "Restablecer"
        Me.btnRestablecer.UseVisualStyleBackColor = False
        '
        'btnSalir
        '
        Me.btnSalir.BackColor = System.Drawing.Color.Coral
        Me.btnSalir.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnSalir.Location = New System.Drawing.Point(200, 376)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(159, 37)
        Me.btnSalir.TabIndex = 3
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = False
        '
        'txtCuadro
        '
        Me.txtCuadro.BackColor = System.Drawing.Color.Wheat
        Me.txtCuadro.Location = New System.Drawing.Point(23, 314)
        Me.txtCuadro.Name = "txtCuadro"
        Me.txtCuadro.Size = New System.Drawing.Size(332, 26)
        Me.txtCuadro.TabIndex = 4
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(9.0!, 20.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.LightSalmon
        Me.ClientSize = New System.Drawing.Size(923, 534)
        Me.Controls.Add(Me.txtCuadro)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnRestablecer)
        Me.Controls.Add(Me.gbPosicion)
        Me.Controls.Add(Me.gbTamano)
        Me.Controls.Add(Me.gbColores)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.gbColores.ResumeLayout(False)
        Me.gbColores.PerformLayout()
        Me.gbPosicion.ResumeLayout(False)
        Me.gbPosicion.PerformLayout()
        Me.gbTamano.ResumeLayout(False)
        Me.gbTamano.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents gbColores As GroupBox
    Friend WithEvents gbPosicion As GroupBox
    Friend WithEvents gbTamano As GroupBox
    Friend WithEvents rbAzul As RadioButton
    Friend WithEvents rbVerde As RadioButton
    Friend WithEvents rbRojo As RadioButton
    Friend WithEvents rbAmarillo As RadioButton
    Friend WithEvents rbBlanco As RadioButton
    Friend WithEvents rbCentro As RadioButton
    Friend WithEvents rbAbajo As RadioButton
    Friend WithEvents rbArriba As RadioButton
    Friend WithEvents rbPequeno As RadioButton
    Friend WithEvents rbGrande As RadioButton
    Friend WithEvents rbNormal As RadioButton
    Friend WithEvents btnRestablecer As Button
    Friend WithEvents btnSalir As Button
    Friend WithEvents txtCuadro As TextBox
End Class
