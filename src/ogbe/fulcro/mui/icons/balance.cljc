(ns ogbe.fulcro.mui.icons.balance
  #?(:cljs (:require
            ["@mui/icons-material/Balance" :default Balance]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-balance
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Balance)))