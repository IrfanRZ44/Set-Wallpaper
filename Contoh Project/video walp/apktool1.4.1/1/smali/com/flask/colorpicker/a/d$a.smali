.class public Lcom/flask/colorpicker/a/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/flask/colorpicker/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/graphics/Paint;


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/flask/colorpicker/a/d$a;->a:Landroid/graphics/Paint;

    return-void
.end method

.method synthetic constructor <init>(Lcom/flask/colorpicker/a/d$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/flask/colorpicker/a/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/d$a;->a:Landroid/graphics/Paint;

    return-object v0
.end method

.method public a(F)Lcom/flask/colorpicker/a/d$a;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/d$a;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-object p0
.end method

.method public a(I)Lcom/flask/colorpicker/a/d$a;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/d$a;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-object p0
.end method

.method public a(Landroid/graphics/Paint$Style;)Lcom/flask/colorpicker/a/d$a;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/d$a;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-object p0
.end method

.method public a(Landroid/graphics/PorterDuff$Mode;)Lcom/flask/colorpicker/a/d$a;
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/a/d$a;->a:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v1, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-object p0
.end method

.method public a(Landroid/graphics/Shader;)Lcom/flask/colorpicker/a/d$a;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/a/d$a;->a:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-object p0
.end method
