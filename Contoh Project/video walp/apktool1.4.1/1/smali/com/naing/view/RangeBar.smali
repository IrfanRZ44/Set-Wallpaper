.class public Lcom/naing/view/RangeBar;
.super Landroid/widget/LinearLayout;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/naing/view/RangeBar$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/FrameLayout$LayoutParams;

.field private j:Landroid/widget/RelativeLayout$LayoutParams;

.field private k:Landroid/widget/RelativeLayout$LayoutParams;

.field private l:Landroid/widget/RelativeLayout$LayoutParams;

.field private m:Lcom/naing/view/RangeBar$a;

.field private n:J

.field private o:J

.field private p:J

.field private q:J

.field private r:J

.field private s:J

.field private t:J

.field private u:J

.field private v:J

.field private w:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/naing/view/RangeBar;->w:Z

    invoke-direct {p0, p1}, Lcom/naing/view/RangeBar;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/naing/view/RangeBar;->w:Z

    invoke-direct {p0, p1}, Lcom/naing/view/RangeBar;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static a(J)Ljava/lang/String;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    const-wide/16 v12, 0xe10

    const-wide/16 v10, 0x3c

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v0, "%%0%dd"

    new-array v1, v9, [Ljava/lang/Object;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v8

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    div-long v2, p0, v2

    new-array v1, v9, [Ljava/lang/Object;

    rem-long v4, v2, v10

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v1, v8

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v4, v9, [Ljava/lang/Object;

    rem-long v6, v2, v12

    div-long/2addr v6, v10

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v9, [Ljava/lang/Object;

    div-long/2addr v2, v12

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v5, v8

    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "00"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->r:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->s:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->t:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->u:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->v:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->n:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->o:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->p:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->q:J

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0a004d

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f0800d3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->g:Landroid/widget/RelativeLayout;

    const v0, 0x7f080096

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->h:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/naing/view/RangeBar;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->j:Landroid/widget/RelativeLayout$LayoutParams;

    const v0, 0x7f080049

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->d:Landroid/widget/TextView;

    const v0, 0x7f0800c6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->e:Landroid/widget/TextView;

    const v0, 0x7f080056

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->f:Landroid/widget/TextView;

    const v0, 0x7f080097

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->c:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/naing/view/RangeBar;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->i:Landroid/widget/FrameLayout$LayoutParams;

    const v0, 0x7f080078

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->a:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/naing/view/RangeBar;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->k:Landroid/widget/RelativeLayout$LayoutParams;

    const v0, 0x7f08009e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->b:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/naing/view/RangeBar;->b:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iput-object v0, p0, Lcom/naing/view/RangeBar;->l:Landroid/widget/RelativeLayout$LayoutParams;

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 8

    const-wide/16 v6, 0x2

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->n:J

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->p:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->r:J

    mul-long/2addr v0, v2

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v2

    int-to-long v2, v2

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v4, v6

    sub-long/2addr v2, v4

    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->s:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/naing/view/RangeBar;->a(JZ)V

    :goto_0
    return-void

    :cond_0
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->n:J

    cmp-long v0, v0, v6

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->q:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->r:J

    mul-long/2addr v0, v2

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v2

    int-to-long v2, v2

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v4, v6

    sub-long/2addr v2, v4

    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->t:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/naing/view/RangeBar;->b(JZ)V

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->u:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->s:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->s:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->u:J

    :cond_2
    :goto_1
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->u:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/naing/view/RangeBar;->c(JZ)V

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->u:J

    invoke-virtual {p0, v0, v1}, Lcom/naing/view/RangeBar;->setCurrentPosition(J)V

    goto :goto_0

    :cond_3
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->u:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->t:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->t:J

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->u:J

    goto :goto_1
.end method

.method private setThumbPosition(J)V
    .locals 11

    const-wide/16 v8, 0x2

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->n:J

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->o:J

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->p:J

    :goto_0
    iget-object v0, p0, Lcom/naing/view/RangeBar;->k:Landroid/widget/RelativeLayout$LayoutParams;

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->p:J

    long-to-int v1, v2

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    iget-object v0, p0, Lcom/naing/view/RangeBar;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/naing/view/RangeBar;->k:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_1
    iget-object v0, p0, Lcom/naing/view/RangeBar;->j:Landroid/widget/RelativeLayout$LayoutParams;

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->p:J

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    add-long/2addr v2, v4

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    div-long/2addr v4, v8

    add-long/2addr v2, v4

    long-to-int v1, v2

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    iget-object v0, p0, Lcom/naing/view/RangeBar;->j:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v1

    int-to-long v2, v1

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->q:J

    iget-wide v6, p0, Lcom/naing/view/RangeBar;->o:J

    div-long/2addr v6, v8

    add-long/2addr v4, v6

    sub-long/2addr v2, v4

    long-to-int v1, v2

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    iget-object v0, p0, Lcom/naing/view/RangeBar;->h:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/naing/view/RangeBar;->j:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->o:J

    add-long/2addr v0, p1

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->q:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->q:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v2, v8

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->p:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->o:J

    sub-long v0, p1, v0

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->p:J

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->n:J

    cmp-long v0, v0, v8

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->o:J

    sub-long/2addr v0, v2

    cmp-long v0, p1, v0

    if-lez v0, :cond_3

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v2, v8

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->q:J

    :goto_2
    iget-object v0, p0, Lcom/naing/view/RangeBar;->l:Landroid/widget/RelativeLayout$LayoutParams;

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->q:J

    long-to-int v1, v2

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    iget-object v0, p0, Lcom/naing/view/RangeBar;->b:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/naing/view/RangeBar;->l:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    :cond_3
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v0, v8

    sub-long v0, p1, v0

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->p:J

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->p:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v2, v8

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->q:J

    goto :goto_2

    :cond_4
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->o:J

    sub-long v0, p1, v0

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->q:J

    goto :goto_2

    :cond_5
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->o:J

    sub-long v0, p1, v0

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->r:J

    mul-long/2addr v0, v2

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v2

    int-to-long v2, v2

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v4, v8

    sub-long/2addr v2, v4

    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->u:J

    goto/16 :goto_1
.end method


# virtual methods
.method public a(JJJ)V
    .locals 13

    move-wide/from16 v0, p5

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->r:J

    iput-wide p1, p0, Lcom/naing/view/RangeBar;->s:J

    iput-wide p1, p0, Lcom/naing/view/RangeBar;->u:J

    move-wide/from16 v0, p3

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->t:J

    iget-object v2, p0, Lcom/naing/view/RangeBar;->d:Landroid/widget/TextView;

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->u:J

    invoke-static {v4, v5}, Lcom/naing/view/RangeBar;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/naing/view/RangeBar;->e:Landroid/widget/TextView;

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->s:J

    invoke-static {v4, v5}, Lcom/naing/view/RangeBar;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/naing/view/RangeBar;->f:Landroid/widget/TextView;

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->t:J

    invoke-static {v4, v5}, Lcom/naing/view/RangeBar;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/naing/view/RangeBar;->a:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-long v2, v2

    iput-wide v2, p0, Lcom/naing/view/RangeBar;->o:J

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v2, p1

    div-long v2, v2, p5

    iput-wide v2, p0, Lcom/naing/view/RangeBar;->p:J

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v2

    int-to-long v2, v2

    mul-long v2, v2, p3

    div-long v2, v2, p5

    const-wide/16 v4, 0x2

    iget-wide v6, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v4, v6

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lcom/naing/view/RangeBar;->q:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->o:J

    iput-wide v2, p0, Lcom/naing/view/RangeBar;->v:J

    iget-object v2, p0, Lcom/naing/view/RangeBar;->k:Landroid/widget/RelativeLayout$LayoutParams;

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->p:J

    long-to-int v3, v4

    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    iget-object v2, p0, Lcom/naing/view/RangeBar;->l:Landroid/widget/RelativeLayout$LayoutParams;

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->q:J

    long-to-int v3, v4

    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    iget-object v2, p0, Lcom/naing/view/RangeBar;->j:Landroid/widget/RelativeLayout$LayoutParams;

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->p:J

    iget-wide v6, p0, Lcom/naing/view/RangeBar;->o:J

    add-long/2addr v4, v6

    iget-wide v6, p0, Lcom/naing/view/RangeBar;->o:J

    const-wide/16 v8, 0x2

    div-long/2addr v6, v8

    add-long/2addr v4, v6

    long-to-int v3, v4

    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    iget-object v2, p0, Lcom/naing/view/RangeBar;->j:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v3

    int-to-long v4, v3

    iget-wide v6, p0, Lcom/naing/view/RangeBar;->q:J

    iget-wide v8, p0, Lcom/naing/view/RangeBar;->o:J

    const-wide/16 v10, 0x2

    div-long/2addr v8, v10

    add-long/2addr v6, v8

    sub-long/2addr v4, v6

    long-to-int v3, v4

    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->u:J

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v4

    int-to-long v4, v4

    mul-long/2addr v2, v4

    div-long v2, v2, p5

    invoke-virtual {p0, v2, v3}, Lcom/naing/view/RangeBar;->setCurrentPosition(J)V

    iget-object v2, p0, Lcom/naing/view/RangeBar;->a:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/naing/view/RangeBar;->k:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, p0, Lcom/naing/view/RangeBar;->b:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/naing/view/RangeBar;->l:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, p0, Lcom/naing/view/RangeBar;->h:Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lcom/naing/view/RangeBar;->j:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, p0, Lcom/naing/view/RangeBar;->g:Landroid/widget/RelativeLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v2, p0, Lcom/naing/view/RangeBar;->h:Landroid/widget/RelativeLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v2, p0, Lcom/naing/view/RangeBar;->c:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v2, 0x1

    iput-boolean v2, p0, Lcom/naing/view/RangeBar;->w:Z

    return-void
.end method

.method public a(JZ)V
    .locals 5

    iget-object v0, p0, Lcom/naing/view/RangeBar;->m:Lcom/naing/view/RangeBar$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/view/RangeBar;->e:Landroid/widget/TextView;

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->s:J

    invoke-static {v2, v3}, Lcom/naing/view/RangeBar;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/naing/view/RangeBar;->m:Lcom/naing/view/RangeBar$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/naing/view/RangeBar$a;->b(JZ)V

    :cond_0
    return-void
.end method

.method public b(JZ)V
    .locals 5

    iget-object v0, p0, Lcom/naing/view/RangeBar;->m:Lcom/naing/view/RangeBar$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/view/RangeBar;->f:Landroid/widget/TextView;

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->t:J

    invoke-static {v2, v3}, Lcom/naing/view/RangeBar;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/naing/view/RangeBar;->m:Lcom/naing/view/RangeBar$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/naing/view/RangeBar$a;->a(JZ)V

    :cond_0
    return-void
.end method

.method public c(JZ)V
    .locals 1

    iget-object v0, p0, Lcom/naing/view/RangeBar;->m:Lcom/naing/view/RangeBar$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/view/RangeBar;->m:Lcom/naing/view/RangeBar$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/naing/view/RangeBar$a;->c(JZ)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    const/4 v7, 0x0

    const-wide/16 v8, 0x2

    const-wide/16 v2, 0x0

    const/4 v6, 0x1

    iget-boolean v0, p0, Lcom/naing/view/RangeBar;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    return v6

    :pswitch_0
    iput-wide v2, p0, Lcom/naing/view/RangeBar;->n:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->p:J

    int-to-long v4, v0

    cmp-long v1, v2, v4

    if-gtz v1, :cond_2

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->p:J

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v4, v8

    add-long/2addr v2, v4

    int-to-long v4, v0

    cmp-long v1, v2, v4

    if-ltz v1, :cond_2

    const-wide/16 v2, 0x1

    iput-wide v2, p0, Lcom/naing/view/RangeBar;->n:J

    :cond_1
    :goto_1
    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lcom/naing/view/RangeBar;->setThumbPosition(J)V

    invoke-direct {p0, v7}, Lcom/naing/view/RangeBar;->a(Z)V

    goto :goto_0

    :cond_2
    iget-wide v2, p0, Lcom/naing/view/RangeBar;->q:J

    int-to-long v4, v0

    cmp-long v1, v2, v4

    if-gtz v1, :cond_1

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->q:J

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v4, v8

    add-long/2addr v2, v4

    int-to-long v4, v0

    cmp-long v1, v2, v4

    if-ltz v1, :cond_1

    iput-wide v8, p0, Lcom/naing/view/RangeBar;->n:J

    goto :goto_1

    :pswitch_1
    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lcom/naing/view/RangeBar;->setThumbPosition(J)V

    invoke-direct {p0, v7}, Lcom/naing/view/RangeBar;->a(Z)V

    invoke-direct {p0, p0}, Lcom/naing/view/RangeBar;->a(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->invalidate()V

    goto :goto_0

    :pswitch_2
    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lcom/naing/view/RangeBar;->setThumbPosition(J)V

    invoke-direct {p0, v6}, Lcom/naing/view/RangeBar;->a(Z)V

    iput-wide v2, p0, Lcom/naing/view/RangeBar;->n:J

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->invalidate()V

    goto :goto_0

    :pswitch_3
    iput-wide v2, p0, Lcom/naing/view/RangeBar;->n:J

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->invalidate()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public setCurrentPosition(J)V
    .locals 9

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->o:J

    invoke-virtual {p0}, Lcom/naing/view/RangeBar;->getWidth()I

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0x2

    iget-wide v6, p0, Lcom/naing/view/RangeBar;->o:J

    mul-long/2addr v4, v6

    sub-long/2addr v2, v4

    mul-long/2addr v2, p1

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->r:J

    div-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->v:J

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->v:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->p:J

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->p:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->o:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->v:J

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/naing/view/RangeBar;->i:Landroid/widget/FrameLayout$LayoutParams;

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->v:J

    long-to-int v1, v2

    iget-object v2, p0, Lcom/naing/view/RangeBar;->c:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget-object v0, p0, Lcom/naing/view/RangeBar;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/naing/view/RangeBar;->i:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/naing/view/RangeBar;->d:Landroid/widget/TextView;

    invoke-static {p1, p2}, Lcom/naing/view/RangeBar;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-wide v0, p0, Lcom/naing/view/RangeBar;->v:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->q:J

    iget-wide v4, p0, Lcom/naing/view/RangeBar;->o:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lcom/naing/view/RangeBar;->q:J

    iget-wide v2, p0, Lcom/naing/view/RangeBar;->o:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/naing/view/RangeBar;->v:J

    goto :goto_0
.end method

.method public setOnRangeBarListener(Lcom/naing/view/RangeBar$a;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/view/RangeBar;->m:Lcom/naing/view/RangeBar$a;

    return-void
.end method
