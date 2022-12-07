(ns ogbe.fulcro.mui.icons.wash-rounded
  #?(:cljs (:require
            ["@mui/icons-material/WashRounded" :default WashRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wash-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WashRounded)))