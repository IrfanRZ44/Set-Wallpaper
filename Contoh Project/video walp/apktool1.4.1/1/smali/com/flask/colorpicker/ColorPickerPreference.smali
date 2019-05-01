.class public Lcom/flask/colorpicker/ColorPickerPreference;
.super Landroid/preference/Preference;


# instance fields
.field protected a:Z

.field protected b:Z

.field protected c:I

.field protected d:Lcom/flask/colorpicker/ColorPickerView$a;

.field protected e:I

.field protected f:Landroid/widget/ImageView;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->c:I

    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerPreference;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->c:I

    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerPreference;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static a(IF)I
    .locals 5

    const/4 v4, 0x0

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v1

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-float v3, v3

    mul-float/2addr v3, p1

    float-to-int v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    return v0
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    :try_start_0
    sget v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_alphaSlider:I

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->a:Z

    sget v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_lightnessSlider:I

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->b:Z

    sget v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_density:I

    const/16 v2, 0xa

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->e:I

    sget v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_wheelType:I

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {v0}, Lcom/flask/colorpicker/ColorPickerView$a;->a(I)Lcom/flask/colorpicker/ColorPickerView$a;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->d:Lcom/flask/colorpicker/ColorPickerView$a;

    sget v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_initialColor:I

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->c:I

    sget v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_pickerTitle:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->g:Ljava/lang/String;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "Choose color"

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->g:Ljava/lang/String;

    :cond_0
    sget v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_pickerButtonCancel:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->h:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "cancel"

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->h:Ljava/lang/String;

    :cond_1
    sget v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_pickerButtonOk:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->i:Ljava/lang/String;

    if-nez v0, :cond_2

    const-string v0, "ok"

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    sget v0, Lcom/flask/colorpicker/e$c;->color_widget:I

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/ColorPickerPreference;->setWidgetLayoutResource(I)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/ColorPickerPreference;->callChangeListener(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput p1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->c:I

    invoke-virtual {p0, p1}, Lcom/flask/colorpicker/ColorPickerPreference;->persistInt(I)Z

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerPreference;->notifyChanged()V

    :cond_0
    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 5

    const/4 v4, 0x1

    invoke-super {p0, p1}, Landroid/preference/Preference;->onBindView(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v1, 0x0

    sget v0, Lcom/flask/colorpicker/e$b;->color_indicator:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->f:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerPreference;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    instance-of v3, v0, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v3, :cond_2

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerPreference;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->c:I

    :goto_1
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v3, 0x3f80

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v4, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    const v3, 0x3f4ccccd

    invoke-static {v1, v3}, Lcom/flask/colorpicker/ColorPickerPreference;->a(IF)I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->f:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_1
    iget v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->c:I

    const/high16 v3, 0x3f00

    invoke-static {v1, v3}, Lcom/flask/colorpicker/ColorPickerPreference;->a(IF)I

    move-result v1

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method protected onClick()V
    .locals 3

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerPreference;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/flask/colorpicker/a/b;->a(Landroid/content/Context;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/b;->a(Ljava/lang/String;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->c:I

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/b;->b(I)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->d:Lcom/flask/colorpicker/ColorPickerView$a;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/b;->a(Lcom/flask/colorpicker/ColorPickerView$a;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->e:I

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/b;->c(I)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->i:Ljava/lang/String;

    new-instance v2, Lcom/flask/colorpicker/ColorPickerPreference$1;

    invoke-direct {v2, p0}, Lcom/flask/colorpicker/ColorPickerPreference$1;-><init>(Lcom/flask/colorpicker/ColorPickerPreference;)V

    invoke-virtual {v0, v1, v2}, Lcom/flask/colorpicker/a/b;->a(Ljava/lang/CharSequence;Lcom/flask/colorpicker/a/a;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->h:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/flask/colorpicker/a/b;->a(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->a:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->b:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/b;->a()Lcom/flask/colorpicker/a/b;

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/flask/colorpicker/a/b;->d()Landroid/support/v7/app/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/a;->show()V

    return-void

    :cond_1
    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->a:Z

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/b;->c()Lcom/flask/colorpicker/a/b;

    goto :goto_0

    :cond_2
    iget-boolean v1, p0, Lcom/flask/colorpicker/ColorPickerPreference;->b:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/b;->b()Lcom/flask/colorpicker/a/b;

    goto :goto_0
.end method

.method protected onSetInitialValue(ZLjava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/ColorPickerPreference;->getPersistedInt(I)I

    move-result v0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/ColorPickerPreference;->a(I)V

    return-void

    :cond_0
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method
