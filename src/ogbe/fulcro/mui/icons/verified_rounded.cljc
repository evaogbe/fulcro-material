(ns ogbe.fulcro.mui.icons.verified-rounded
  #?(:cljs (:require
            ["@mui/icons-material/VerifiedRounded" :default VerifiedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-verified-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VerifiedRounded)))