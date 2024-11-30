export class Command {
  id!: number;
  commandDate!: string;
  client!: { id: number; name: string };  // Assurez-vous que `client` contient une propriété `name`
  productItems!: Array<{
    product: { id: string; name: string };  // Assurez-vous que `product` contient `name`
    quantity: number;
    unitPrice: number;
  }>;
}
