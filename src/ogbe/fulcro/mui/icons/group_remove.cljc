(ns ogbe.fulcro.mui.icons.group-remove
  #?(:cljs (:require
            ["@mui/icons-material/GroupRemove" :default GroupRemove]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-group-remove
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GroupRemove)))