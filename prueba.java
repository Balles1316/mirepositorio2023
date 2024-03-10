import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.io.File;

public class SimpleDirectoryTreeImg extends JFrame {

    private JTree tree;
        private JLabel imageLabel;

            public SimpleDirectoryTreeImg() {
                    super("Simple Directory Tree Viewer");

                            // Configure JFrame
                                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                            setSize(600, 400);

                                                    // Create the root node and tree model
                                                            DefaultMutableTreeNode root = new DefaultMutableTreeNode("Select a directory");
                                                                    DefaultTreeModel treeModel = new DefaultTreeModel(root);
                                                                            tree = new JTree(treeModel);
                                                                                    tree.addTreeSelectionListener(this::nodeSelected);

                                                                                            // Configure the area to display images
                                                                                                    imageLabel = new JLabel();
                                                                                                            imageLabel.setHorizontalAlignment(JLabel.CENTER);

                                                                                                                    // Create a JSplitPane to divide the tree area and the image area
                                                                                                                            JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(tree), new JScrollPane(imageLabel));
                                                                                                                                    splitPane.setDividerLocation(200);

                                                                                                                                            // Add the JSplitPane to the JFrame
                                                                                                                                                    add(splitPane, BorderLayout.CENTER);

                                                                                                                                                            // Make the window visible
                                                                                                                                                                    setVisible(true);
                                                                                                                                                                        }

                                                                                                                                                                            private void nodeSelected(TreeSelectionEvent e) {
                                                                                                                                                                                    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                                                                                                                                                                                            if (selectedNode == null) return;

                                                                                                                                                                                                    String path = getPath(selectedNode);

                                                                                                                                                                                                            File file = new File(path);
                                                                                                                                                                                                                    if (file.isFile() && isImageFile(file.getName())) {
                                                                                                                                                                                                                                displayImage(file);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                private String getPath(DefaultMutableTreeNode selectedNode) {
                                                                                                                                                                                                                                                        StringBuilder path = new StringBuilder(selectedNode.getUserObject().toString());
                                                                                                                                                                                                                                                                DefaultMutableTreeNode parent = (DefaultMutableTreeNode) selectedNode.getParent();
                                                                                                                                                                                                                                                                        while (parent != null) {
                                                                                                                                                                                                                                                                                    path.insert(0, File.separator).insert(0, parent.getUserObject().toString());
                                                                                                                                                                                                                                                                                                parent = (DefaultMutableTreeNode) parent.getParent();
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                return path.toString();
                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                        private boolean isImageFile(String fileName) {
                                                                                                                                                                                                                                                                                                                                String lowerCaseName = fileName.toLowerCase();
                                                                                                                                                                                                                                                                                                                                        return lowerCaseName.endsWith(".jpg") || lowerCaseName.endsWith(".jpeg") ||
                                                                                                                                                                                                                                                                                                                                                        lowerCaseName.endsWith(".png") || lowerCaseName.endsWith(".gif");
                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                private void displayImage(File file) {
                                                                                                                                                                                                                                                                                                                                                                        try {
                                                                                                                                                                                                                                                                                                                                                                                    ImageIcon icon = new ImageIcon(file.getPath());
                                                                                                                                                                                                                                                                                                                                                                                                imageLabel.setIcon(icon);
                                                                                                                                                                                                                                                                                                                                                                                                        } catch (Exception ex) {
                                                                                                                                                                                                                                                                                                                                                                                                                    ex.printStackTrace();
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                                                                                                    public static void main(String[] args) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            new SimpleDirectoryTreeImg();
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                }