.class public abstract Lcom/flask/colorpicker/b/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/flask/colorpicker/b/c;


# instance fields
.field protected a:Lcom/flask/colorpicker/b/b;

.field protected b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/flask/colorpicker/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/b/a;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method protected a(FF)I
    .locals 6

    const/4 v0, 0x1

    const-wide v2, 0x40088121e29cdd4cL

    div-float v1, p2, p1

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->asin(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    const-wide/high16 v4, 0x3fe0

    add-double/2addr v2, v4

    double-to-int v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public a()Lcom/flask/colorpicker/b/b;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/b/a;->a:Lcom/flask/colorpicker/b/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/flask/colorpicker/b/b;

    invoke-direct {v0}, Lcom/flask/colorpicker/b/b;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/b/a;->a:Lcom/flask/colorpicker/b/b;

    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/b/a;->a:Lcom/flask/colorpicker/b/b;

    return-object v0
.end method

.method public a(Lcom/flask/colorpicker/b/b;)V
    .locals 1

    iput-object p1, p0, Lcom/flask/colorpicker/b/a;->a:Lcom/flask/colorpicker/b/b;

    iget-object v0, p0, Lcom/flask/colorpicker/b/a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/flask/colorpicker/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/flask/colorpicker/b/a;->b:Ljava/util/List;

    return-object v0
.end method

.method protected c()I
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/b/a;->a:Lcom/flask/colorpicker/b/b;

    iget v0, v0, Lcom/flask/colorpicker/b/b;->e:F

    const/high16 v1, 0x437f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method
