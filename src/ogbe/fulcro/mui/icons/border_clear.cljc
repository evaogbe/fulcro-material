(ns ogbe.fulcro.mui.icons.border-clear
  #?(:cljs (:require
            ["@mui/icons-material/BorderClear" :default BorderClear]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-clear
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderClear)))