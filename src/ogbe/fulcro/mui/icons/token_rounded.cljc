(ns ogbe.fulcro.mui.icons.token-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TokenRounded" :default TokenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-token-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TokenRounded)))