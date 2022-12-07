(ns ogbe.fulcro.mui.factories
  #?(:cljs (:require
            ["@mui/base" :refer [ClickAwayListener
                                 NoSsr
                                 Portal
                                 TabPanelUnstyled
                                 TabUnstyled
                                 TabsListUnstyled
                                 TabsUnstyled
                                 TextareaAutosize]]
            ["@mui/material" :refer [Accordion
                                     AccordionActions
                                     AccordionDetails
                                     AccordionSummary
                                     Alert
                                     AlertTitle
                                     AppBar
                                     Autocomplete
                                     Avatar
                                     AvatarGroup
                                     Backdrop
                                     Badge
                                     BottomNavigation
                                     BottomNavigationAction
                                     Box
                                     Breadcrumbs
                                     Button
                                     ButtonBase
                                     ButtonGroup
                                     Card
                                     CardActionArea
                                     CardActions
                                     CardContent
                                     CardHeader
                                     CardMedia
                                     Checkbox
                                     Chip
                                     CircularProgress
                                     Collapse
                                     Container
                                     CssBaseline
                                     Dialog
                                     DialogActions
                                     DialogContent
                                     DialogContentText
                                     DialogTitle
                                     Divider
                                     Drawer
                                     Fab
                                     Fade
                                     FilledInput
                                     FormControl
                                     FormControlLabel
                                     FormGroup
                                     FormHelperText
                                     FormLabel
                                     Grid
                                     Grow
                                     IconButton
                                     ImageList
                                     ImageListItem
                                     ImageListItemBar
                                     Input
                                     InputAdornment
                                     InputBase
                                     InputLabel
                                     LinearProgress
                                     Link
                                     List
                                     ListItem
                                     ListItemAvatar
                                     ListItemButton
                                     ListItemIcon
                                     ListItemSecondaryAction
                                     ListItemText
                                     ListSubheader
                                     Menu
                                     MenuItem
                                     MenuList
                                     MobileStepper
                                     Modal
                                     NativeSelect
                                     OutlinedInput
                                     Pagination
                                     PaginationItem
                                     Paper
                                     Popover
                                     Popper
                                     Radio
                                     RadioGroup
                                     Rating
                                     ScopedCssBaseline
                                     Select
                                     Skeleton
                                     Slide
                                     Slider
                                     Snackbar
                                     SnackbarContent
                                     SpeedDial
                                     SpeedDialAction
                                     SpeedDialIcon
                                     Stack
                                     Step
                                     StepButton
                                     StepConnector
                                     StepContent
                                     StepIcon
                                     StepLabel
                                     Stepper
                                     SwipeableDrawer
                                     Switch
                                     Tab
                                     TabScrollButton
                                     Table
                                     TableBody
                                     TableCell
                                     TableContainer
                                     TableFooter
                                     TableHead
                                     TablePagination
                                     TableRow
                                     TableSortLabel
                                     Tabs
                                     TextField
                                     ToggleButton
                                     ToggleButtonGroup
                                     Toolbar
                                     Tooltip
                                     Typography
                                     Zoom]]
            ["@mui/material/styles" :refer [createTheme ThemeProvider]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn create-theme
  [options]
  #?(:cljs (createTheme (clj->js options))))

(def ui-accordion #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory Accordion)))
(def ui-accordion-actions #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory AccordionActions)))
(def ui-accordion-details #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory AccordionDetails)))
(def ui-accordion-summary #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory AccordionSummary)))
(def ui-alert #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Alert)))
(def ui-alert-title #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory AlertTitle)))
(def ui-app-bar #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory AppBar)))
(def ui-autocomplete #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory Autocomplete)))
(def ui-avatar #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Avatar)))
(def ui-avatar-group #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory AvatarGroup)))
(def ui-backdrop #?(:clj  (fn [& _args])
                    :cljs (interop/react-factory Backdrop)))
(def ui-badge #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Badge)))
(def ui-bottom-navigation #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory BottomNavigation)))
(def ui-bottom-navigation-action #?(:clj  (fn [& _args])
                                    :cljs (interop/react-factory BottomNavigationAction)))
(def ui-box #?(:clj  (fn [& _args])
               :cljs (interop/react-factory Box)))
(def ui-breadcrumbs #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory Breadcrumbs)))
(def ui-button #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Button)))
(def ui-button-base #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory ButtonBase)))
(def ui-button-group #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory ButtonGroup)))
(def ui-card #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Card)))
(def ui-card-action-area #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory CardActionArea)))
(def ui-card-actions #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory CardActions)))
(def ui-card-content #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory CardContent)))
(def ui-card-header #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory CardHeader)))
(def ui-card-media #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory CardMedia)))
(def ui-checkbox #?(:clj  (fn [& _args])
                    :cljs (interop/react-input-factory Checkbox)))
(def ui-chip #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Chip)))
(def ui-circular-progress #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory CircularProgress)))
(def ui-click-away-listener #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory ClickAwayListener)))
(def ui-collapse #?(:clj  (fn [& _args])
                    :cljs (interop/react-factory Collapse)))
(def ui-container #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory Container)))
(def ui-css-baseline #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory CssBaseline)))
(def ui-dialog #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Dialog)))
(def ui-dialog-actions #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory DialogActions)))
(def ui-dialog-content #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory DialogContent)))
(def ui-dialog-content-text #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory DialogContentText)))
(def ui-dialog-title #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory DialogTitle)))
(def ui-divider #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Divider)))
(def ui-drawer #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Drawer)))
(def ui-fade #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Fade)))
(def ui-filled-input #?(:clj  (fn [& _args])
                        :cljs (interop/react-input-factory FilledInput)))
(def ui-fab #?(:clj  (fn [& _args])
               :cljs (interop/react-factory Fab)))
(def ui-form-control #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory FormControl)))
(def ui-form-control-label #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory FormControlLabel)))
(def ui-form-group #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory FormGroup)))
(def ui-form-helper-text #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory FormHelperText)))
(def ui-form-label #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory FormLabel)))
(def ui-grid #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Grid)))
(def ui-grow #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Grow)))
(def ui-icon-button #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory IconButton)))
(def ui-image-list #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory ImageList)))
(def ui-image-list-item #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory ImageListItem)))
(def ui-image-list-item-bar #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory ImageListItemBar)))
(def ui-input #?(:clj  (fn [& _args])
                 :cljs (interop/react-input-factory Input)))
(def ui-input-adornment #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory InputAdornment)))
(def ui-input-base #?(:clj  (fn [& _args])
                      :cljs (interop/react-input-factory InputBase)))
(def ui-input-label #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory InputLabel)))
(def ui-linear-progress #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory LinearProgress)))
(def ui-link #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Link)))
(def ui-list #?(:clj  (fn [& _args])
                :cljs (interop/react-factory List)))
(def ui-list-item #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory ListItem)))
(def ui-list-item-avatar #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory ListItemAvatar)))
(def ui-list-item-button #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory ListItemButton)))
(def ui-list-item-icon #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory ListItemIcon)))
(def ui-list-item-secondary-action #?(:clj  (fn [& _args])
                                      :cljs (interop/react-factory ListItemSecondaryAction)))
(def ui-list-item-text #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory ListItemText)))
(def ui-list-subheader #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory ListSubheader)))
(def ui-menu #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Menu)))
(def ui-menu-item #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory MenuItem)))
(def ui-menu-list #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory MenuList)))
(def ui-mobile-stepper #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory MobileStepper)))
(def ui-modal #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Modal)))
(def ui-native-select #?(:clj  (fn [& _args])
                         :cljs (interop/react-input-factory NativeSelect)))
(def ui-no-ssr #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory NoSsr)))
(def ui-outlined-input #?(:clj  (fn [& _args])
                          :cljs (interop/react-input-factory OutlinedInput)))
(def ui-pagination #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory Pagination)))
(def ui-pagination-item #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory PaginationItem)))
(def ui-paper #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Paper)))
(def ui-popover #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Popover)))
(def ui-popper #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Popper)))
(def ui-portal #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory Portal)))
(def ui-radio #?(:clj  (fn [& _args])
                 :cljs (interop/react-input-factory Radio)))
(def ui-radio-group #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory RadioGroup)))
(def ui-rating
  "Use synchronous transact for onChange handler."
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Rating)))
(def ui-scoped-css-baseline #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory ScopedCssBaseline)))
(def ui-select #?(:clj  (fn [& _args])
                  :cljs (interop/react-input-factory Select)))
(def ui-skeleton #?(:clj  (fn [& _args])
                    :cljs (interop/react-factory Skeleton)))
(def ui-slide #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Slide)))
(def ui-slider #?(:clj  (fn [& _args])
                  :cljs (interop/react-input-factory Slider)))
(def ui-snackbar #?(:clj  (fn [& _args])
                    :cljs (interop/react-factory Snackbar)))
(def ui-snackbar-content #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory SnackbarContent)))
(def ui-speed-dial #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory SpeedDial)))
(def ui-speed-dial-action #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory SpeedDialAction)))
(def ui-speed-dial-icon #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory SpeedDialIcon)))
(def ui-stack #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Stack)))
(def ui-step #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Step)))
(def ui-step-button #?(:clj  (fn [& _args])
                       :cljs (interop/react-factory StepButton)))
(def ui-step-connector #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory StepConnector)))
(def ui-step-content #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory StepContent)))
(def ui-step-icon #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory StepIcon)))
(def ui-step-label #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory StepLabel)))
(def ui-stepper #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Stepper)))
(def ui-swipeable-drawer #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory SwipeableDrawer)))
(def ui-switch #?(:clj  (fn [& _args])
                  :cljs (interop/react-input-factory Switch)))
(def ui-tab #?(:clj  (fn [& _args])
               :cljs (interop/react-factory Tab)))
(def ui-tab-panel-unstyled #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory TabPanelUnstyled)))
(def ui-tab-unstyled #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory TabUnstyled)))
(def ui-tab-scroll-button #?(:clj  (fn [& _args])
                             :cljs (interop/react-factory TabScrollButton)))
(def ui-table #?(:clj  (fn [& _args])
                 :cljs (interop/react-factory Table)))
(def ui-table-body #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory TableBody)))
(def ui-table-cell #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory TableCell)))
(def ui-table-container #?(:clj  (fn [& _args])
                           :cljs (interop/react-factory TableContainer)))
(def ui-table-footer #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory TableFooter)))
(def ui-table-head #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory TableHead)))
(def ui-table-pagination
  "Use synchronous transact for onRowsPerPageChange."
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TablePagination)))
(def ui-table-row #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory TableRow)))
(def ui-table-sort-label #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory TableSortLabel)))
(def ui-tabs #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Tabs)))
(def ui-tabs-list-unstyled #?(:clj  (fn [& _args])
                              :cljs (interop/react-factory TabsListUnstyled)))
(def ui-tabs-unstyled #?(:clj  (fn [& _args])
                         :cljs (interop/react-factory TabsUnstyled)))
(def ui-text-field #?(:clj  (fn [& _args])
                      :cljs (interop/react-input-factory TextField)))
(def ui-textarea-autosize #?(:clj  (fn [& _args])
                             :cljs (interop/react-input-factory TextareaAutosize)))
(def ui-toggle-button #?(:clj  (fn [& _args])
                         :cljs (interop/react-factory ToggleButton)))
(def ui-toggle-button-group #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory ToggleButtonGroup)))
(def ui-theme-provider #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory ThemeProvider)))
(def ui-toolbar #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Toolbar)))
(def ui-tooltip #?(:clj  (fn [& _args])
                   :cljs (interop/react-factory Tooltip)))
(def ui-typography #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory Typography)))
(def ui-zoom #?(:clj  (fn [& _args])
                :cljs (interop/react-factory Zoom)))
