(ns ogbe.fulcro.mui.icons.foundation-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FoundationRounded" :default FoundationRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-foundation-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FoundationRounded)))