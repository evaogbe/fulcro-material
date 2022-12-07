(ns ogbe.fulcro.mui.icons.no-transfer
  #?(:cljs (:require
            ["@mui/icons-material/NoTransfer" :default NoTransfer]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-transfer
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoTransfer)))