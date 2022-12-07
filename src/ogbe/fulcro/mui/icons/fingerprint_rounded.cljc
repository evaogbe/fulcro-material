(ns ogbe.fulcro.mui.icons.fingerprint-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FingerprintRounded" :default FingerprintRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fingerprint-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FingerprintRounded)))