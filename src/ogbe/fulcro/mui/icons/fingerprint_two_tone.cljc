(ns ogbe.fulcro.mui.icons.fingerprint-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FingerprintTwoTone" :default FingerprintTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fingerprint-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FingerprintTwoTone)))