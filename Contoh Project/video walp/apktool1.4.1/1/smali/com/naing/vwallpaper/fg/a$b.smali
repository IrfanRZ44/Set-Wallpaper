.class Lcom/naing/vwallpaper/fg/a$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/naing/vwallpaper/fg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Landroid/support/v7/widget/AppCompatTextView;

.field c:Landroid/support/v7/widget/AppCompatTextView;

.field d:Landroid/support/v7/widget/CardView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const v0, 0x7f080094

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/a$b;->a:Landroid/view/View;

    const v0, 0x7f0800e2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/AppCompatTextView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/a$b;->b:Landroid/support/v7/widget/AppCompatTextView;

    const v0, 0x7f0800e1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/AppCompatTextView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/a$b;->c:Landroid/support/v7/widget/AppCompatTextView;

    const v0, 0x7f08003b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/CardView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/a$b;->d:Landroid/support/v7/widget/CardView;

    return-void
.end method
