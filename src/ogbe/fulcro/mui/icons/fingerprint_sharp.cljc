(ns ogbe.fulcro.mui.icons.fingerprint-sharp
  #?(:cljs (:require
            ["@mui/icons-material/FingerprintSharp" :default FingerprintSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fingerprint-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FingerprintSharp)))