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
        Me.gbTrabajador = New System.Windows.Forms.GroupBox()
        Me.rbProfesional = New System.Windows.Forms.RadioButton()
        Me.rbTecnico = New System.Windows.Forms.RadioButton()
        Me.rbAdministrativo = New System.Windows.Forms.RadioButton()
        Me.rbObrero = New System.Windows.Forms.RadioButton()
        Me.gbSindicato = New System.Windows.Forms.GroupBox()
        Me.rbSindicatoNo = New System.Windows.Forms.RadioButton()
        Me.rbSindicatoSi = New System.Windows.Forms.RadioButton()
        Me.gbServicio = New System.Windows.Forms.GroupBox()
        Me.rb10oMas = New System.Windows.Forms.RadioButton()
        Me.rb5a10anos = New System.Windows.Forms.RadioButton()
        Me.rb5anos = New System.Windows.Forms.RadioButton()
        Me.lblNhijos = New System.Windows.Forms.Label()
        Me.nudNhijos = New System.Windows.Forms.NumericUpDown()
        Me.btnCalcular = New System.Windows.Forms.Button()
        Me.btnLimpiar = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.gbTrabajador.SuspendLayout()
        Me.gbSindicato.SuspendLayout()
        Me.gbServicio.SuspendLayout()
        CType(Me.nudNhijos, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'gbTrabajador
        '
        Me.gbTrabajador.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.gbTrabajador.Controls.Add(Me.rbProfesional)
        Me.gbTrabajador.Controls.Add(Me.rbTecnico)
        Me.gbTrabajador.Controls.Add(Me.rbAdministrativo)
        Me.gbTrabajador.Controls.Add(Me.rbObrero)
        Me.gbTrabajador.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.gbTrabajador.Location = New System.Drawing.Point(12, 15)
        Me.gbTrabajador.Name = "gbTrabajador"
        Me.gbTrabajador.Size = New System.Drawing.Size(265, 250)
        Me.gbTrabajador.TabIndex = 0
        Me.gbTrabajador.TabStop = False
        Me.gbTrabajador.Text = "Clase de Trabajador"
        '
        'rbProfesional
        '
        Me.rbProfesional.AutoSize = True
        Me.rbProfesional.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbProfesional.Location = New System.Drawing.Point(6, 179)
        Me.rbProfesional.Name = "rbProfesional"
        Me.rbProfesional.Size = New System.Drawing.Size(134, 29)
        Me.rbProfesional.TabIndex = 3
        Me.rbProfesional.TabStop = True
        Me.rbProfesional.Text = "Profesional"
        Me.rbProfesional.UseVisualStyleBackColor = True
        '
        'rbTecnico
        '
        Me.rbTecnico.AutoSize = True
        Me.rbTecnico.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbTecnico.Location = New System.Drawing.Point(6, 137)
        Me.rbTecnico.Name = "rbTecnico"
        Me.rbTecnico.Size = New System.Drawing.Size(107, 29)
        Me.rbTecnico.TabIndex = 2
        Me.rbTecnico.TabStop = True
        Me.rbTecnico.Text = "Técnico"
        Me.rbTecnico.UseVisualStyleBackColor = True
        '
        'rbAdministrativo
        '
        Me.rbAdministrativo.AutoSize = True
        Me.rbAdministrativo.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbAdministrativo.Location = New System.Drawing.Point(6, 88)
        Me.rbAdministrativo.Name = "rbAdministrativo"
        Me.rbAdministrativo.Size = New System.Drawing.Size(159, 29)
        Me.rbAdministrativo.TabIndex = 1
        Me.rbAdministrativo.TabStop = True
        Me.rbAdministrativo.Text = "Administrativo"
        Me.rbAdministrativo.UseVisualStyleBackColor = True
        '
        'rbObrero
        '
        Me.rbObrero.AutoSize = True
        Me.rbObrero.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbObrero.Location = New System.Drawing.Point(6, 41)
        Me.rbObrero.Name = "rbObrero"
        Me.rbObrero.Size = New System.Drawing.Size(98, 29)
        Me.rbObrero.TabIndex = 0
        Me.rbObrero.TabStop = True
        Me.rbObrero.Text = "Obrero"
        Me.rbObrero.UseVisualStyleBackColor = True
        '
        'gbSindicato
        '
        Me.gbSindicato.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.gbSindicato.Controls.Add(Me.rbSindicatoNo)
        Me.gbSindicato.Controls.Add(Me.rbSindicatoSi)
        Me.gbSindicato.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.gbSindicato.Location = New System.Drawing.Point(303, 15)
        Me.gbSindicato.Name = "gbSindicato"
        Me.gbSindicato.Size = New System.Drawing.Size(307, 81)
        Me.gbSindicato.TabIndex = 0
        Me.gbSindicato.TabStop = False
        Me.gbSindicato.Text = "Afiliado a Sindicato"
        '
        'rbSindicatoNo
        '
        Me.rbSindicatoNo.AutoSize = True
        Me.rbSindicatoNo.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbSindicatoNo.Location = New System.Drawing.Point(145, 41)
        Me.rbSindicatoNo.Name = "rbSindicatoNo"
        Me.rbSindicatoNo.Size = New System.Drawing.Size(62, 29)
        Me.rbSindicatoNo.TabIndex = 1
        Me.rbSindicatoNo.TabStop = True
        Me.rbSindicatoNo.Text = "No"
        Me.rbSindicatoNo.UseVisualStyleBackColor = True
        '
        'rbSindicatoSi
        '
        Me.rbSindicatoSi.AutoSize = True
        Me.rbSindicatoSi.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rbSindicatoSi.Location = New System.Drawing.Point(40, 41)
        Me.rbSindicatoSi.Name = "rbSindicatoSi"
        Me.rbSindicatoSi.Size = New System.Drawing.Size(55, 29)
        Me.rbSindicatoSi.TabIndex = 1
        Me.rbSindicatoSi.TabStop = True
        Me.rbSindicatoSi.Text = "Si"
        Me.rbSindicatoSi.UseVisualStyleBackColor = True
        '
        'gbServicio
        '
        Me.gbServicio.BackColor = System.Drawing.SystemColors.ActiveCaption
        Me.gbServicio.Controls.Add(Me.rb10oMas)
        Me.gbServicio.Controls.Add(Me.rb5a10anos)
        Me.gbServicio.Controls.Add(Me.rb5anos)
        Me.gbServicio.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.gbServicio.Location = New System.Drawing.Point(12, 297)
        Me.gbServicio.Name = "gbServicio"
        Me.gbServicio.Size = New System.Drawing.Size(265, 226)
        Me.gbServicio.TabIndex = 4
        Me.gbServicio.TabStop = False
        Me.gbServicio.Text = "Años de Servicio"
        '
        'rb10oMas
        '
        Me.rb10oMas.AutoSize = True
        Me.rb10oMas.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rb10oMas.Location = New System.Drawing.Point(6, 129)
        Me.rb10oMas.Name = "rb10oMas"
        Me.rb10oMas.Size = New System.Drawing.Size(124, 29)
        Me.rb10oMas.TabIndex = 5
        Me.rb10oMas.TabStop = True
        Me.rb10oMas.Text = "> 10 años"
        Me.rb10oMas.UseVisualStyleBackColor = True
        '
        'rb5a10anos
        '
        Me.rb5a10anos.AutoSize = True
        Me.rb5a10anos.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rb5a10anos.Location = New System.Drawing.Point(6, 87)
        Me.rb5a10anos.Name = "rb5a10anos"
        Me.rb5a10anos.Size = New System.Drawing.Size(166, 29)
        Me.rb5a10anos.TabIndex = 1
        Me.rb5a10anos.TabStop = True
        Me.rb5a10anos.Text = "de 5 a 10 años"
        Me.rb5a10anos.UseVisualStyleBackColor = True
        '
        'rb5anos
        '
        Me.rb5anos.AutoSize = True
        Me.rb5anos.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.rb5anos.Location = New System.Drawing.Point(6, 44)
        Me.rb5anos.Name = "rb5anos"
        Me.rb5anos.Size = New System.Drawing.Size(113, 29)
        Me.rb5anos.TabIndex = 0
        Me.rb5anos.TabStop = True
        Me.rb5anos.Text = "< 5 años"
        Me.rb5anos.UseVisualStyleBackColor = True
        '
        'lblNhijos
        '
        Me.lblNhijos.AutoSize = True
        Me.lblNhijos.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblNhijos.Location = New System.Drawing.Point(297, 145)
        Me.lblNhijos.Name = "lblNhijos"
        Me.lblNhijos.Size = New System.Drawing.Size(187, 25)
        Me.lblNhijos.TabIndex = 5
        Me.lblNhijos.Text = "Número de hijos : "
        '
        'nudNhijos
        '
        Me.nudNhijos.BackColor = System.Drawing.SystemColors.MenuBar
        Me.nudNhijos.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.nudNhijos.Location = New System.Drawing.Point(490, 143)
        Me.nudNhijos.Name = "nudNhijos"
        Me.nudNhijos.Size = New System.Drawing.Size(120, 30)
        Me.nudNhijos.TabIndex = 6
        '
        'btnCalcular
        '
        Me.btnCalcular.BackColor = System.Drawing.SystemColors.ControlLight
        Me.btnCalcular.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnCalcular.Location = New System.Drawing.Point(670, 143)
        Me.btnCalcular.Name = "btnCalcular"
        Me.btnCalcular.Size = New System.Drawing.Size(143, 38)
        Me.btnCalcular.TabIndex = 7
        Me.btnCalcular.Text = "Calcular"
        Me.btnCalcular.UseVisualStyleBackColor = False
        '
        'btnLimpiar
        '
        Me.btnLimpiar.BackColor = System.Drawing.SystemColors.ControlLight
        Me.btnLimpiar.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnLimpiar.Location = New System.Drawing.Point(448, 470)
        Me.btnLimpiar.Name = "btnLimpiar"
        Me.btnLimpiar.Size = New System.Drawing.Size(143, 38)
        Me.btnLimpiar.TabIndex = 8
        Me.btnLimpiar.Text = "Limpiar"
        Me.btnLimpiar.UseVisualStyleBackColor = False
        '
        'btnSalir
        '
        Me.btnSalir.BackColor = System.Drawing.SystemColors.ControlLight
        Me.btnSalir.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnSalir.Location = New System.Drawing.Point(660, 470)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(143, 38)
        Me.btnSalir.TabIndex = 9
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(9.0!, 20.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.SystemColors.GradientInactiveCaption
        Me.ClientSize = New System.Drawing.Size(837, 535)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnLimpiar)
        Me.Controls.Add(Me.btnCalcular)
        Me.Controls.Add(Me.nudNhijos)
        Me.Controls.Add(Me.lblNhijos)
        Me.Controls.Add(Me.gbServicio)
        Me.Controls.Add(Me.gbSindicato)
        Me.Controls.Add(Me.gbTrabajador)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.gbTrabajador.ResumeLayout(False)
        Me.gbTrabajador.PerformLayout()
        Me.gbSindicato.ResumeLayout(False)
        Me.gbSindicato.PerformLayout()
        Me.gbServicio.ResumeLayout(False)
        Me.gbServicio.PerformLayout()
        CType(Me.nudNhijos, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents gbTrabajador As GroupBox
    Friend WithEvents gbSindicato As GroupBox
    Friend WithEvents rbObrero As RadioButton
    Friend WithEvents rbAdministrativo As RadioButton
    Friend WithEvents rbTecnico As RadioButton
    Friend WithEvents rbProfesional As RadioButton
    Friend WithEvents rbSindicatoSi As RadioButton
    Friend WithEvents rbSindicatoNo As RadioButton
    Friend WithEvents gbServicio As GroupBox
    Friend WithEvents rb5anos As RadioButton
    Friend WithEvents rb5a10anos As RadioButton
    Friend WithEvents rb10oMas As RadioButton
    Friend WithEvents lblNhijos As Label
    Friend WithEvents nudNhijos As NumericUpDown
    Friend WithEvents btnCalcular As Button
    Friend WithEvents btnLimpiar As Button
    Friend WithEvents btnSalir As Button
End Class
