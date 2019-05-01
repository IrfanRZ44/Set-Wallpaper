.class public Lcom/naing/vwallpaper/fg/a;
.super Landroid/support/v7/widget/RecyclerView$Adapter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/naing/vwallpaper/fg/a$a;,
        Lcom/naing/vwallpaper/fg/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter",
        "<",
        "Lcom/naing/vwallpaper/fg/a$b;",
        ">;"
    }
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/naing/model/a;",
            ">;"
        }
    .end annotation
.end field

.field c:Lcom/naing/vwallpaper/fg/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Lcom/naing/model/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    iput-object p2, p0, Lcom/naing/vwallpaper/fg/a;->b:Ljava/util/List;

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lcom/naing/vwallpaper/fg/a$b;
    .locals 4

    new-instance v0, Lcom/naing/vwallpaper/fg/a$b;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/a;->a:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0a0033

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/naing/vwallpaper/fg/a$b;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public a(Lcom/naing/vwallpaper/fg/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/a;->c:Lcom/naing/vwallpaper/fg/a$a;

    return-void
.end method

.method public a(Lcom/naing/vwallpaper/fg/a$b;I)V
    .locals 4

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/a;->b:Ljava/util/List;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/fg/a;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/naing/model/a;

    iget-object v1, p1, Lcom/naing/vwallpaper/fg/a$b;->a:Landroid/view/View;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/naing/model/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v1, p1, Lcom/naing/vwallpaper/fg/a$b;->b:Landroid/support/v7/widget/AppCompatTextView;

    invoke-virtual {v0}, Lcom/naing/model/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/AppCompatTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p1, Lcom/naing/vwallpaper/fg/a$b;->c:Landroid/support/v7/widget/AppCompatTextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/naing/model/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/AppCompatTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p1, Lcom/naing/vwallpaper/fg/a$b;->d:Landroid/support/v7/widget/CardView;

    new-instance v2, Lcom/naing/vwallpaper/fg/a$1;

    invoke-direct {v2, p0, v0, p2}, Lcom/naing/vwallpaper/fg/a$1;-><init>(Lcom/naing/vwallpaper/fg/a;Lcom/naing/model/a;I)V

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/CardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/naing/model/a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/a;->b:Ljava/util/List;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/a;->notifyDataSetChanged()V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/a;->b:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/fg/a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    check-cast p1, Lcom/naing/vwallpaper/fg/a$b;

    invoke-virtual {p0, p1, p2}, Lcom/naing/vwallpaper/fg/a;->a(Lcom/naing/vwallpaper/fg/a$b;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/naing/vwallpaper/fg/a;->a(Landroid/view/ViewGroup;I)Lcom/naing/vwallpaper/fg/a$b;

    move-result-object v0

    return-object v0
.end method
