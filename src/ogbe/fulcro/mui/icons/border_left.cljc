(ns ogbe.fulcro.mui.icons.border-left
  #?(:cljs (:require
            ["@mui/icons-material/BorderLeft" :default BorderLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderLeft)))