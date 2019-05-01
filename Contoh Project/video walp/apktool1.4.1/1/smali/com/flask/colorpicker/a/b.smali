.class public Lcom/flask/colorpicker/a/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/support/v7/app/a$a;

.field private b:Landroid/widget/LinearLayout;

.field private c:Lcom/flask/colorpicker/ColorPickerView;

.field private d:Lcom/flask/colorpicker/slider/LightnessSlider;

.field private e:Lcom/flask/colorpicker/slider/AlphaSlider;

.field private f:Landroid/widget/EditText;

.field private g:Landroid/widget/LinearLayout;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:I

.field private m:I

.field private n:[Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/flask/colorpicker/a/b;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 6

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, p0, Lcom/flask/colorpicker/a/b;->h:Z

    iput-boolean v2, p0, Lcom/flask/colorpicker/a/b;->i:Z

    iput-boolean v5, p0, Lcom/flask/colorpicker/a/b;->j:Z

    iput-boolean v5, p0, Lcom/flask/colorpicker/a/b;->k:Z

    iput v2, p0, Lcom/flask/colorpicker/a/b;->l:I

    iput v5, p0, Lcom/flask/colorpicker/a/b;->m:I

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Integer;

    aput-object v3, v0, v5

    aput-object v3, v0, v2

    const/4 v1, 0x2

    aput-object v3, v0, v1

    const/4 v1, 0x3

    aput-object v3, v0, v1

    const/4 v1, 0x4

    aput-object v3, v0, v1

    iput-object v0, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    sget v0, Lcom/flask/colorpicker/e$a;->default_slider_margin:I

    invoke-static {p1, v0}, Lcom/flask/colorpicker/a/b;->a(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/a/b;->m:I

    sget v0, Lcom/flask/colorpicker/e$a;->default_slider_margin_btw_title:I

    invoke-static {p1, v0}, Lcom/flask/colorpicker/a/b;->a(Landroid/content/Context;I)I

    move-result v0

    new-instance v1, Landroid/support/v7/app/a$a;

    invoke-direct {v1, p1, p2}, Landroid/support/v7/app/a$a;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    iget v2, p0, Lcom/flask/colorpicker/a/b;->m:I

    iget v3, p0, Lcom/flask/colorpicker/a/b;->m:I

    iget v4, p0, Lcom/flask/colorpicker/a/b;->m:I

    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v1, 0x3f80

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    new-instance v1, Lcom/flask/colorpicker/ColorPickerView;

    invoke-direct {v1, p1}, Lcom/flask/colorpicker/ColorPickerView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/support/v7/app/a$a;->b(Landroid/view/View;)Landroid/support/v7/app/a$a;

    return-void
.end method

.method private static a(Landroid/content/Context;I)I
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    const/high16 v1, 0x3f00

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static a(Landroid/content/Context;)Lcom/flask/colorpicker/a/b;
    .locals 1

    new-instance v0, Lcom/flask/colorpicker/a/b;

    invoke-direct {v0, p0}, Lcom/flask/colorpicker/a/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method private a([Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_0

    aget-object v2, p1, v0

    if-nez v2, :cond_1

    :cond_0
    return-object v1

    :cond_1
    add-int/lit8 v1, v0, 0x1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private a(Landroid/content/DialogInterface;Lcom/flask/colorpicker/a/a;)V
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v0

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v1}, Lcom/flask/colorpicker/ColorPickerView;->getAllColors()[Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, p1, v0, v1}, Lcom/flask/colorpicker/a/a;->a(Landroid/content/DialogInterface;I[Ljava/lang/Integer;)V

    return-void
.end method

.method static synthetic a(Lcom/flask/colorpicker/a/b;Landroid/content/DialogInterface;Lcom/flask/colorpicker/a/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/a/b;->a(Landroid/content/DialogInterface;Lcom/flask/colorpicker/a/a;)V

    return-void
.end method

.method private b([Ljava/lang/Integer;)I
    .locals 1

    invoke-direct {p0, p1}, Lcom/flask/colorpicker/a/b;->a([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aget-object v0, p1, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/flask/colorpicker/a/b;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/flask/colorpicker/a/b;->h:Z

    iput-boolean v0, p0, Lcom/flask/colorpicker/a/b;->i:Z

    return-object p0
.end method

.method public a(I)Lcom/flask/colorpicker/a/b;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/a$a;->a(I)Landroid/support/v7/app/a$a;

    return-object p0
.end method

.method public a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/flask/colorpicker/a/b;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/a$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/a$a;

    return-object p0
.end method

.method public a(ILcom/flask/colorpicker/a/a;)Lcom/flask/colorpicker/a/b;
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    new-instance v1, Lcom/flask/colorpicker/a/b$2;

    invoke-direct {v1, p0, p2}, Lcom/flask/colorpicker/a/b$2;-><init>(Lcom/flask/colorpicker/a/b;Lcom/flask/colorpicker/a/a;)V

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/app/a$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/a$a;

    return-object p0
.end method

.method public a(Lcom/flask/colorpicker/ColorPickerView$a;)Lcom/flask/colorpicker/a/b;
    .locals 2

    invoke-static {p1}, Lcom/flask/colorpicker/a/c;->a(Lcom/flask/colorpicker/ColorPickerView$a;)Lcom/flask/colorpicker/b/c;

    move-result-object v0

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v1, v0}, Lcom/flask/colorpicker/ColorPickerView;->setRenderer(Lcom/flask/colorpicker/b/c;)V

    return-object p0
.end method

.method public a(Lcom/flask/colorpicker/d;)Lcom/flask/colorpicker/a/b;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->a(Lcom/flask/colorpicker/d;)V

    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/flask/colorpicker/a/b;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/a$a;->b(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/a$a;

    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;Lcom/flask/colorpicker/a/a;)Lcom/flask/colorpicker/a/b;
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    new-instance v1, Lcom/flask/colorpicker/a/b$1;

    invoke-direct {v1, p0, p2}, Lcom/flask/colorpicker/a/b$1;-><init>(Lcom/flask/colorpicker/a/b;Lcom/flask/colorpicker/a/a;)V

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/app/a$a;->a(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/a$a;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/flask/colorpicker/a/b;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/a$a;->a(Ljava/lang/CharSequence;)Landroid/support/v7/app/a$a;

    return-object p0
.end method

.method public b()Lcom/flask/colorpicker/a/b;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/flask/colorpicker/a/b;->h:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flask/colorpicker/a/b;->i:Z

    return-object p0
.end method

.method public b(I)Lcom/flask/colorpicker/a/b;
    .locals 3

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    return-object p0
.end method

.method public c()Lcom/flask/colorpicker/a/b;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/flask/colorpicker/a/b;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/flask/colorpicker/a/b;->i:Z

    return-object p0
.end method

.method public c(I)Lcom/flask/colorpicker/a/b;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setDensity(I)V

    return-object p0
.end method

.method public d()Landroid/support/v7/app/a;
    .locals 9

    const/4 v6, 0x1

    const/4 v5, -0x2

    const/4 v8, -0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    invoke-virtual {v0}, Landroid/support/v7/app/a$a;->a()Landroid/content/Context;

    move-result-object v4

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    iget-object v2, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    invoke-direct {p0, v2}, Lcom/flask/colorpicker/a/b;->a([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/flask/colorpicker/ColorPickerView;->a([Ljava/lang/Integer;I)V

    iget-boolean v0, p0, Lcom/flask/colorpicker/a/b;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    sget v1, Lcom/flask/colorpicker/e$a;->default_slider_height:I

    invoke-static {v4, v1}, Lcom/flask/colorpicker/a/b;->a(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {v0, v8, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    new-instance v1, Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-direct {v1, v4}, Lcom/flask/colorpicker/slider/LightnessSlider;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/flask/colorpicker/a/b;->d:Lcom/flask/colorpicker/slider/LightnessSlider;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->d:Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {v1, v0}, Lcom/flask/colorpicker/slider/LightnessSlider;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->d:Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->d:Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setLightnessSlider(Lcom/flask/colorpicker/slider/LightnessSlider;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->d:Lcom/flask/colorpicker/slider/LightnessSlider;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    invoke-direct {p0, v1}, Lcom/flask/colorpicker/a/b;->b([Ljava/lang/Integer;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColor(I)V

    :cond_0
    iget-boolean v0, p0, Lcom/flask/colorpicker/a/b;->i:Z

    if-eqz v0, :cond_1

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    sget v1, Lcom/flask/colorpicker/e$a;->default_slider_height:I

    invoke-static {v4, v1}, Lcom/flask/colorpicker/a/b;->a(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {v0, v8, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    new-instance v1, Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-direct {v1, v4}, Lcom/flask/colorpicker/slider/AlphaSlider;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/flask/colorpicker/a/b;->e:Lcom/flask/colorpicker/slider/AlphaSlider;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->e:Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {v1, v0}, Lcom/flask/colorpicker/slider/AlphaSlider;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->e:Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->e:Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setAlphaSlider(Lcom/flask/colorpicker/slider/AlphaSlider;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->e:Lcom/flask/colorpicker/slider/AlphaSlider;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    invoke-direct {p0, v1}, Lcom/flask/colorpicker/a/b;->b([Ljava/lang/Integer;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColor(I)V

    :cond_1
    iget-boolean v0, p0, Lcom/flask/colorpicker/a/b;->j:Z

    if-eqz v0, :cond_2

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    sget v0, Lcom/flask/colorpicker/e$c;->picker_edit:I

    invoke-static {v4, v0, v7}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/flask/colorpicker/a/b;->f:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->f:Landroid/widget/EditText;

    new-array v2, v6, [Landroid/text/InputFilter;

    new-instance v5, Landroid/text/InputFilter$AllCaps;

    invoke-direct {v5}, Landroid/text/InputFilter$AllCaps;-><init>()V

    aput-object v5, v2, v3

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->f:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->setSingleLine()V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->f:Landroid/widget/EditText;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setVisibility(I)V

    iget-boolean v0, p0, Lcom/flask/colorpicker/a/b;->i:Z

    if-eqz v0, :cond_5

    const/16 v0, 0x9

    :goto_0
    iget-object v2, p0, Lcom/flask/colorpicker/a/b;->f:Landroid/widget/EditText;

    new-array v5, v6, [Landroid/text/InputFilter;

    new-instance v6, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v6, v0}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v6, v5, v3

    invoke-virtual {v2, v5}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/flask/colorpicker/a/b;->f:Landroid/widget/EditText;

    invoke-virtual {v0, v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->f:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    invoke-direct {p0, v1}, Lcom/flask/colorpicker/a/b;->b([Ljava/lang/Integer;)I

    move-result v1

    iget-boolean v2, p0, Lcom/flask/colorpicker/a/b;->i:Z

    invoke-static {v1, v2}, Lcom/flask/colorpicker/f;->a(IZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->f:Landroid/widget/EditText;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setColorEdit(Landroid/widget/EditText;)V

    :cond_2
    iget-boolean v0, p0, Lcom/flask/colorpicker/a/b;->k:Z

    if-eqz v0, :cond_4

    sget v0, Lcom/flask/colorpicker/e$c;->color_preview:I

    invoke-static {v4, v0, v7}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/flask/colorpicker/a/b;->g:Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    array-length v0, v0

    if-nez v0, :cond_6

    sget v0, Lcom/flask/colorpicker/e$c;->color_selector:I

    invoke-static {v4, v0, v7}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v8}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->c:Lcom/flask/colorpicker/ColorPickerView;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->g:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    invoke-direct {p0, v2}, Lcom/flask/colorpicker/a/b;->a([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/flask/colorpicker/ColorPickerView;->a(Landroid/widget/LinearLayout;Ljava/lang/Integer;)V

    :cond_4
    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->a:Landroid/support/v7/app/a$a;

    invoke-virtual {v0}, Landroid/support/v7/app/a$a;->b()Landroid/support/v7/app/a;

    move-result-object v0

    return-object v0

    :cond_5
    const/4 v0, 0x7

    goto :goto_0

    :cond_6
    move v2, v3

    :goto_1
    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    array-length v0, v0

    if-ge v2, v0, :cond_3

    iget v0, p0, Lcom/flask/colorpicker/a/b;->l:I

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    aget-object v0, v0, v2

    if-eqz v0, :cond_3

    sget v0, Lcom/flask/colorpicker/e$c;->color_selector:I

    invoke-static {v4, v0, v7}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    sget v1, Lcom/flask/colorpicker/e$b;->image_preview:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    iget-object v6, p0, Lcom/flask/colorpicker/a/b;->n:[Ljava/lang/Integer;

    aget-object v6, v6, v2

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-direct {v5, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lcom/flask/colorpicker/a/b;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1
.end method
