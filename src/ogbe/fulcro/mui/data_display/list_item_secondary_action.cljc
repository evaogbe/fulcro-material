(ns ogbe.fulcro.mui.data-display.list-item-secondary-action
  #?(:cljs (:require
            ["@mui/material/ListItemSecondaryAction" :default ListItemSecondaryAction]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-list-item-secondary-action #?(:clj  (fn [& _args])
                                      :cljs (interop/react-factory ListItemSecondaryAction)))
