(ns ogbe.fulcro.mui.icons.wc-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WcRounded" :default WcRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wc-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WcRounded)))