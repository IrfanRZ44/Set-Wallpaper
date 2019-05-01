.class Lcom/naing/vwallpaper/VideoChooser$a;
.super Landroid/widget/BaseAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/naing/vwallpaper/VideoChooser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/VideoChooser;

.field private b:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lcom/naing/vwallpaper/VideoChooser;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/VideoChooser$a;->a:Lcom/naing/vwallpaper/VideoChooser;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p2, p0, Lcom/naing/vwallpaper/VideoChooser$a;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/naing/model/VideoModel;
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser$a;->a:Lcom/naing/vwallpaper/VideoChooser;

    invoke-static {v0}, Lcom/naing/vwallpaper/VideoChooser;->c(Lcom/naing/vwallpaper/VideoChooser;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/naing/model/VideoModel;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser$a;->a:Lcom/naing/vwallpaper/VideoChooser;

    invoke-static {v0}, Lcom/naing/vwallpaper/VideoChooser;->c(Lcom/naing/vwallpaper/VideoChooser;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/naing/vwallpaper/VideoChooser$a;->a(I)Lcom/naing/model/VideoModel;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser$a;->b:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0a0034

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    new-instance v1, Lcom/naing/vwallpaper/VideoChooser$b;

    invoke-direct {v1}, Lcom/naing/vwallpaper/VideoChooser$b;-><init>()V

    const v0, 0x7f0800e4

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/AppCompatTextView;

    iput-object v0, v1, Lcom/naing/vwallpaper/VideoChooser$b;->a:Landroid/support/v7/widget/AppCompatTextView;

    iget-object v0, v1, Lcom/naing/vwallpaper/VideoChooser$b;->a:Landroid/support/v7/widget/AppCompatTextView;

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoChooser$a;->a:Lcom/naing/vwallpaper/VideoChooser;

    invoke-static {v2}, Lcom/naing/vwallpaper/VideoChooser;->d(Lcom/naing/vwallpaper/VideoChooser;)Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/AppCompatTextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v0, 0x7f0800e3

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/AppCompatTextView;

    iput-object v0, v1, Lcom/naing/vwallpaper/VideoChooser$b;->b:Landroid/support/v7/widget/AppCompatTextView;

    iget-object v0, v1, Lcom/naing/vwallpaper/VideoChooser$b;->b:Landroid/support/v7/widget/AppCompatTextView;

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoChooser$a;->a:Lcom/naing/vwallpaper/VideoChooser;

    invoke-static {v2}, Lcom/naing/vwallpaper/VideoChooser;->d(Lcom/naing/vwallpaper/VideoChooser;)Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/AppCompatTextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v0, 0x7f080075

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/AppCompatImageView;

    iput-object v0, v1, Lcom/naing/vwallpaper/VideoChooser$b;->c:Landroid/support/v7/widget/AppCompatImageView;

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/naing/vwallpaper/VideoChooser$a;->a(I)Lcom/naing/model/VideoModel;

    move-result-object v1

    iget-object v2, v0, Lcom/naing/vwallpaper/VideoChooser$b;->a:Landroid/support/v7/widget/AppCompatTextView;

    invoke-virtual {v1}, Lcom/naing/model/VideoModel;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/AppCompatTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v0, Lcom/naing/vwallpaper/VideoChooser$b;->b:Landroid/support/v7/widget/AppCompatTextView;

    invoke-virtual {v1}, Lcom/naing/model/VideoModel;->c()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lcom/naing/c/b;->a(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/AppCompatTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoChooser$a;->b:Landroid/app/Activity;

    invoke-static {v2}, Lcom/a/a/c;->a(Landroid/app/Activity;)Lcom/a/a/j;

    move-result-object v2

    invoke-virtual {v1}, Lcom/naing/model/VideoModel;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/a/a/j;->a(Ljava/lang/String;)Lcom/a/a/i;

    move-result-object v1

    new-instance v2, Lcom/a/a/g/e;

    invoke-direct {v2}, Lcom/a/a/g/e;-><init>()V

    const v3, 0x7f070085

    invoke-virtual {v2, v3}, Lcom/a/a/g/e;->a(I)Lcom/a/a/g/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/a/a/g/e;->e()Lcom/a/a/g/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/a/a/i;->a(Lcom/a/a/g/e;)Lcom/a/a/i;

    move-result-object v1

    iget-object v0, v0, Lcom/naing/vwallpaper/VideoChooser$b;->c:Landroid/support/v7/widget/AppCompatImageView;

    invoke-virtual {v1, v0}, Lcom/a/a/i;->a(Landroid/widget/ImageView;)Lcom/a/a/g/a/i;

    return-object p2

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/naing/vwallpaper/VideoChooser$b;

    goto :goto_0
.end method
