(ns ogbe.fulcro.mui.data-display.list-item-text
  #?(:cljs (:require
            ["@mui/material/ListItemText" :default ListItemText]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-list-item-text #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory ListItemText)))
