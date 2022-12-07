(ns ogbe.fulcro.mui.data-display.list-item-icon
  #?(:cljs (:require
            ["@mui/material/ListItemIcon" :default ListItemIcon]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-list-item-icon #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory ListItemIcon)))
