.class public Lcom/naing/vwallpaper/fg/b;
.super Landroid/support/v4/app/Fragment;


# instance fields
.field a:Lcom/naing/vwallpaper/fg/a;

.field b:Landroid/support/v7/widget/RecyclerView;

.field c:Landroid/widget/ProgressBar;

.field d:Lcom/naing/vwallpaper/fg/CWpViewModel;

.field e:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method public static a()Lcom/naing/vwallpaper/fg/b;
    .locals 1

    new-instance v0, Lcom/naing/vwallpaper/fg/b;

    invoke-direct {v0}, Lcom/naing/vwallpaper/fg/b;-><init>()V

    return-object v0
.end method

.method private a(ILjava/lang/String;)V
    .locals 5

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0a004c

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f080044

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/b;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0d0059

    new-instance v2, Lcom/naing/vwallpaper/fg/b$4;

    invoke-direct {v2, p0, p1}, Lcom/naing/vwallpaper/fg/b$4;-><init>(Lcom/naing/vwallpaper/fg/b;I)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/high16 v1, 0x104

    invoke-virtual {v0, v1, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void
.end method

.method static synthetic a(Lcom/naing/vwallpaper/fg/b;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/naing/vwallpaper/fg/b;->a(ILjava/lang/String;)V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b;->c:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    invoke-static {p0}, Landroid/arch/lifecycle/u;->a(Landroid/support/v4/app/Fragment;)Landroid/arch/lifecycle/t;

    move-result-object v0

    const-class v1, Lcom/naing/vwallpaper/fg/CWpViewModel;

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/t;->a(Ljava/lang/Class;)Landroid/arch/lifecycle/s;

    move-result-object v0

    check-cast v0, Lcom/naing/vwallpaper/fg/CWpViewModel;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/b;->d:Lcom/naing/vwallpaper/fg/CWpViewModel;

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b;->d:Lcom/naing/vwallpaper/fg/CWpViewModel;

    invoke-virtual {v0}, Lcom/naing/vwallpaper/fg/CWpViewModel;->a()Landroid/arch/lifecycle/m;

    move-result-object v0

    new-instance v1, Lcom/naing/vwallpaper/fg/b$2;

    invoke-direct {v1, p0}, Lcom/naing/vwallpaper/fg/b$2;-><init>(Lcom/naing/vwallpaper/fg/b;)V

    invoke-virtual {v0, p0, v1}, Landroid/arch/lifecycle/m;->observe(Landroid/arch/lifecycle/h;Landroid/arch/lifecycle/n;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b;->d:Lcom/naing/vwallpaper/fg/CWpViewModel;

    invoke-virtual {v0}, Lcom/naing/vwallpaper/fg/CWpViewModel;->b()Landroid/arch/lifecycle/m;

    move-result-object v0

    new-instance v1, Lcom/naing/vwallpaper/fg/b$3;

    invoke-direct {v1, p0}, Lcom/naing/vwallpaper/fg/b$3;-><init>(Lcom/naing/vwallpaper/fg/b;)V

    invoke-virtual {v0, p0, v1}, Landroid/arch/lifecycle/m;->observe(Landroid/arch/lifecycle/h;Landroid/arch/lifecycle/n;)V

    return-void
.end method

.method private c()V
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/flask/colorpicker/a/b;->a(Landroid/content/Context;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    const v1, 0x7f0d004f

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/b;->a(I)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    sget-object v1, Lcom/flask/colorpicker/ColorPickerView$a;->a:Lcom/flask/colorpicker/ColorPickerView$a;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/b;->a(Lcom/flask/colorpicker/ColorPickerView$a;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/flask/colorpicker/a/b;->a(Lcom/flask/colorpicker/d;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    const v1, 0x7f0d0050

    new-instance v2, Lcom/naing/vwallpaper/fg/b$5;

    invoke-direct {v2, p0}, Lcom/naing/vwallpaper/fg/b$5;-><init>(Lcom/naing/vwallpaper/fg/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/flask/colorpicker/a/b;->a(ILcom/flask/colorpicker/a/a;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    const/high16 v1, 0x104

    invoke-virtual {v0, v1, v3}, Lcom/flask/colorpicker/a/b;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/flask/colorpicker/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/b;->d()Landroid/support/v7/app/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/a;->show()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/fg/b;->setHasOptionsMenu(Z)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    const v0, 0x7f0b0002

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const v0, 0x7f0a0031

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    :pswitch_0
    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/b;->c()V

    const/4 v0, 0x1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x7f080010
        :pswitch_0
    .end packed-switch
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5

    const/4 v4, 0x1

    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    const v0, 0x7f080095

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/b;->c:Landroid/widget/ProgressBar;

    const v0, 0x7f0800a1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/b;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b;->b:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b;->b:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/b;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v4, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lcom/naing/vwallpaper/fg/a;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/b;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/naing/vwallpaper/fg/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/b;->a:Lcom/naing/vwallpaper/fg/a;

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b;->a:Lcom/naing/vwallpaper/fg/a;

    new-instance v1, Lcom/naing/vwallpaper/fg/b$1;

    invoke-direct {v1, p0}, Lcom/naing/vwallpaper/fg/b$1;-><init>(Lcom/naing/vwallpaper/fg/b;)V

    invoke-virtual {v0, v1}, Lcom/naing/vwallpaper/fg/a;->a(Lcom/naing/vwallpaper/fg/a$a;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b;->b:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/b;->a:Lcom/naing/vwallpaper/fg/a;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/b;->b()V

    return-void
.end method
